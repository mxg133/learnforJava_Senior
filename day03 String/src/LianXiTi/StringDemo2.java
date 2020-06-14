package LianXiTi;

import org.junit.Test;

/**
 * @author 孟享广
 * @create 2020-06-08 10:46 上午
 */
public class StringDemo2 {

    public String getMaxSameString(String str1, String str2){


        String maxStr = (str1.length() >= str2.length()) ? str1 : str2;
        String minStr = (str1.length() < str2.length()) ? str1 : str2;
        int legth = minStr.length();
        for (int i = 0; i < legth; i++){

            for (int x = 0, y = legth - i; y <= legth; x++, y++) {
                String subStr = minStr.substring(x, y);
                if (maxStr.contains(subStr)){
                    return subStr;
                }
            }

        }
        return null;
    }

@Test
    public void test1(){
    System.out.println(getMaxSameString("abcwerthelloyuiodefabcdef", "cvhellobnm"));
}



    public String getMaxSameString1(String str1, String str2){


        String maxStr = (str1.length() >= str2.length()) ? str1 : str2;
        String minStr = (str1.length() < str2.length()) ? str1 : str2;
        int legth = minStr.length();
        for (int i = 0; i < legth; i++){

            for (int x = 0, y = legth - i; y <= legth; x++, y++) {
                String subStr = minStr.substring(x, y);
                if (maxStr.contains(subStr)){
                    return subStr;
                }
            }

        }
        return null;
    }

    @Test
    public void test2(){
        System.out.println(getMaxSameString("abcwerthelloyuiodefabcdef", "cvhellobnm"));
    }
}
