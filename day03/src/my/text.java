package my;


/**
 * @author 孟享广
 * @create 2020-06-05 3:59 下午
 */
public class text {
    public static void main(String[] args) {
        String s1 = "javaEE";
        String s2 = "javaEE";

        String s3 = new String("JavaEE");
        String s4 = new String("JavaEE");

        System.out.println(s1 == s2);

        System.out.println(s1 == s3);

        System.out.println(s1 == s4);

        System.out.println(s3 == s4);






    }
}
