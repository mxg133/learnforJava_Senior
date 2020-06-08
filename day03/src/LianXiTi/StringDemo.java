package LianXiTi;

import org.junit.Test;

/**
 * @author 孟享广
 * @create 2020-06-08 9:53 上午
 */
public class StringDemo {
    //方式一
    public String renerse(String str, int startIndex, int endIndex) {
        if (str != null) {
            char array[] = str.toCharArray();
            for (int i = startIndex, j = endIndex; i < j; i++, j--) {
                char t = array[i];
                array[i] = array[j];
                array[j] = t;
            }
            return new String(array);

        }
        return null;
    }

    @Test
    public void test(){
        String str = "1234567";
        String renerse = renerse(str, 2, 5);
        System.out.println(renerse);
    }

//    方式二
    public String renerse1(String str, int startIndex, int endIndex) {
        if (str != null) {
            String reverseStr = str.substring(0, startIndex);

            for (int i = endIndex; i >= startIndex; i--) {
                reverseStr += str.charAt(i);//每次都要创造一个新的string
            }
            reverseStr += str.substring(endIndex + 1);

            return reverseStr;
        }
        return null ;
    }


    @Test
    public void test1(){
        String str = "1234567";
        String renerse1 = renerse(str, 2, 5);
        System.out.println(renerse1);
    }

    //方式三
    public String renerse3(String str, int startIndex, int endIndex) {
        if (str != null) {
            StringBuilder builder = new StringBuilder(str.length());
            builder.append(str.substring(0, startIndex));

            for (int i = endIndex; i >= startIndex; i++) {
                builder.append(str.charAt(i));
            }

            builder.append(str.substring(endIndex + 1));
            return builder.toString();
        }
        return null;
    }

    @Test
    public void test2(){
        System.out.println(renerse("0123456", 2, 5));
    }








}
