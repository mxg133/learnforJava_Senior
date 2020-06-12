package my;

import org.junit.Test;

import java.util.List;

/**
 * @author 孟享广
 * @create 2020-06-12 3:05 下午
 */
public class DAOTest {

    @Test
    public void test1(){
        CustomerDAO dao1 = new CustomerDAO();
        dao1.add(new Customer());

        List<Customer> list = dao1.getFORlist(10);


        Student student = new Student();

        StudentDAO studentDAO = new StudentDAO();
        studentDAO.add(new Student());

        List<Student> foRlist = studentDAO.getFORlist(1);

    }
}
