package com.test02_account;

public class TestAccount {
    public static void main(String[] args) {
        //创建一个账号为11223344 余额 2000 年利率 4.5 的Account
        Account account = new Account("11112222", 200, 4.5/100);
        account.withdraw(3000);
        System.out.println("余额" + account.getBalance());
        account.withdraw(300);
        System.out.println("余额" + account.getBalance());
        account.withdraw(30);
        System.out.println("余额" + account.getBalance());
        System.out.println("月利率：" + account.getMonthlyInterest() * 100 + "%");
    }
}
