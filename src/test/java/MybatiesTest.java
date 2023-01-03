import com.example.JavaBeanDemo.JavaBeanDemo;
import com.example.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MybatiesTest {
    @Test
    public  void testSelectALL() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession=sqlSessionFactory.openSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        //List<JavaBeanDemo> dbs=sqlSession.selectList("selectDB");
        List<JavaBeanDemo> dbs=userMapper.selectDB();
        System.out.println(dbs);
        sqlSession.close();
    }

    @Test
    public  void testSelectOne() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession=sqlSessionFactory.openSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        //List<JavaBeanDemo> dbs=sqlSession.selectList("selectDB");
        JavaBeanDemo dbs=userMapper.selectByID("'XIAOYONG' or 1=1");
        System.out.println(dbs);
        sqlSession.close();
    }

    @Test
    public  void testSelectByCondition() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession=sqlSessionFactory.openSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        //List<JavaBeanDemo> dbs=sqlSession.selectList("selectDB");
        JavaBeanDemo dbs=userMapper.selectByCondition("XIAOYONG%","");
        System.out.println(dbs);
        sqlSession.close();
    }
}
