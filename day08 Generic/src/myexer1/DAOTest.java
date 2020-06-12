package myexer1;

import exer1.DAO;
import org.junit.Test;

import java.util.List;

/**
 * @author 孟享广
 * @create 2020-06-12 4:26 下午
 */
public class DAOTest {
    @Test
    public void test1(){
        DAO<User> dao = new DAO<>();

        dao.save("1001", new User(1001, 34, "周杰伦"));
        dao.save("1002", new User(1002, 20, "你问"));
        dao.save("1003", new User(1003, 25, "哈哈"));

        dao.update("1003", new User(1003, 30,"啥啊"));
        dao.delete("1002");
        List<User> list = dao.list();
//        System.out.println(list);
       list.forEach(System.out::println);

    }
}
