package LianXiTi;

import org.junit.Test;

import javax.print.attribute.standard.PrinterURI;

/**
 * @author 孟享广
 * @create 2020-06-08 10:25 上午
 */
public class StringDemo1 {
    /**
     *     获取一个字符串在另一个字符串中出现的次数。
     *       比如：获取“ab”在 “abkkcadkabkebfkaabkskab” 中出现的次数
     * @param mainStr
     * @param subStr
     * @return
     */
    public int getCount(String mainStr, String subStr){
        int mainLength = mainStr.length();
        int SubLength = subStr.length();
        int count = 0;
        int index = 0;
        if (mainLength >= SubLength){
//           while ((index = mainStr.indexOf(subStr)) != -1){
//               count++;
//
//               mainStr = mainStr.substring(index + subStr.length());
//
//           }


            //改进
            while ((index = mainStr.indexOf(subStr, index))   != -1   ){
                count++;
                index =+ SubLength;

            }

            return count;
        }else {
            return 0;
        }
    }

    @Test
    public void test1(){
        System.out.println(getCount("abkkcadkabkebfkaabkskab", "ab"));
    }
}
