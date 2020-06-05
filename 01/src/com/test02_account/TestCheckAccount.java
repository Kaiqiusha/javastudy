package com.test02_account;

public class TestCheckAccount {
    public static void main(String[] args) {
        CheckAccount c = new CheckAccount("11223344", 2000, 435/100, 50000);
        c.withdraw(500);
        System.out.println("余额： " + c.getBalance());// 从父类继承过来的
        System.out.println("可透支的额度" + c.getBalance());// 从父类继承过来的
    }
}
