import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.shiro.session.mgt.SessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;
import java.io.InputStream;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class TestConnection {
    @Test
    public void testCase1(){
//        InputStream inputStream = null;
//        try {
//            inputStream = Resources.getResourceAsStream("mybatis.cfg.xml");
//            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//            SqlSession sqlSession = sqlSessionFactory.openSession();
//            Roles role = sqlSession.selectOne("com.ten_thousand.silver_paving.dto.UserMapper.findDeptByName",1);
//            System.out.println(role);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
