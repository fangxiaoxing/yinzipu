package lkctest;

import com.ten_thousand.silver_paving.dao.lkc.IBorrowerDAO;
import com.ten_thousand.silver_paving.dto.lkc.TbBorrower;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class TestsDemo {
    @Autowired
    private IBorrowerDAO borrowerDAO;

    @Test
    public void testCase1() {
            TbBorrower tbBorrower = new TbBorrower();
            tbBorrower.setBorrIdCard("22028121");
            borrowerDAO.save(tbBorrower);
    }

    @Test
    public void testCase2(){
        borrowerDAO.delete(1);

    }
}
