package untli;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import java.io.IOException;
import java.io.InputStream;

public class MyBatisUtil {
    // 全局唯一的 SqlSessionFactory
    private static SqlSessionFactory sqlSessionFactory;

    // 初始化 SqlSessionFactory
    static {
        try {
            String configPath = "mybatis-config.xml"; // MyBatis 配置文件路径
            InputStream inputStream = Resources.getResourceAsStream(configPath);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            throw new RuntimeException("MyBatis 初始化失败", e);
        }
    }

    // 获取 SqlSession（自动提交事务）
    public static SqlSession getSqlSession() {
        return sqlSessionFactory.openSession(true); // true 表示自动提交
    }

    // 关闭 SqlSession
    public static void closeSqlSession(SqlSession sqlSession) {
        if (sqlSession != null) {
            sqlSession.close();
        }
    }
}