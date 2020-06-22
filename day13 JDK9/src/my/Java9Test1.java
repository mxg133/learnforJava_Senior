package my;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author 孟享广
 * @create 2020-06-22 10:13 上午
 */
public class Java9Test1 {
    @Test
    public void test1(){
        List<String> namesList = new ArrayList<>();
        namesList.add("Joe");
        namesList.add("Bob");
        namesList.add("Bill");
        Collections.unmodifiableList(namesList);

    }
}
