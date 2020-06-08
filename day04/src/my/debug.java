package my;

import org.junit.Test;

/**
 * @author 孟享广
 * @create 2020-06-08 12:44 下午
 */
public class debug {
    @Test
    public void testStringBuffer(){
        String str = null;
        StringBuffer sb = new StringBuffer();
        sb.append(str);//

        System.out.println(sb.length());//4

        System.out.println(sb);//"null"

        StringBuffer sb1 = new StringBuffer(str);//抛异常NullPointerException
        System.out.println(sb1);//

    }
}
