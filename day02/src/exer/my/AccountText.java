package exer.my;

import java.text.Format;

/**
 * @author 孟享广
 * @create 2020-06-04 9:29 上午
 */

class Account{
    private double m_balance;

    public Account(double m_balance) {
        this.m_balance = m_balance;
    }

    public synchronized void deposit(double var){
        if (var > 0){
            m_balance +=var;

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + " 存钱成功:" + m_balance);
        }
    }
}

class Customer extends Thread{
    private Account acct;

    public Customer(Account acct) {
        this.acct = acct;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++){
            acct.deposit(1000);
        }
    }
}

public class AccountText {
    public static void main(String[] args) {
        Account acct = new Account(0);

        Customer c1 = new Customer(acct);
        Customer c2 = new Customer(acct);

        c1.setName("1号技师");
        c2.setName("2号技师");

        c1.start();
        c2.start();
    }
}