package my;

import org.junit.Test;

import java.util.Date;

/**
 * @author 孟享广
 * @create 2020-06-07 5:33 下午
 */
public class time {


    @Test
    public void text1(){
        long time = System.currentTimeMillis() ;
        System.out.println(time);


        Date date1 = new Date();

        System.out.println(date1.toString());

        System.out.println(date1.getTime());

        java.sql.Date date3 = new java.sql.Date(1591523333175l);

        System.out.println(date3.toString());

    }
}
