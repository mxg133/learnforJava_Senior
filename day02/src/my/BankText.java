package my;

/**
 * @author 孟享广
 * @create 2020-06-03 11:26 上午
 */
public class BankText {

}
class Bank{
    private Bank(){
    }
    private static Bank instance = null;


    public static synchronized Bank getInstance(){
        if (instance == null){
            instance = new Bank();
        }
        return instance;
    }

}
