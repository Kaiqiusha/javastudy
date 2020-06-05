package com.test02_account;

public class CheckAccount extends Account {
    private double overdraft;
    public CheckAccount(String id, double balance, double annualInterestrRate, double overdraft) {
        super(id, balance, annualInterestrRate);
        this.overdraft = overdraft;
    }

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }

    @Override
    public void withdraw(double amount) {
        if (amount < 0 ){
            System.out.println("非法参数");
            return;
        }
        if (amount > getBalance() + overdraft){
            System.out.println("超过可透支额度");
        }else if ( amount > getBalance()){
            // 需要透支
            // （1） 计算需要透支多少
            double d = amount - getBalance();
            // （2）修改透支额度
            overdraft -= d;
            setBalance(0);
        }else if (amount <= getBalance()){
            // 不需要透支 修改属性可以用set方法 因为balance 是父类私有的无法直接使用 balacce -= amount 因此修改属性可以用set方法
            setBalance(getBalance() - amount);
        }
    }

}
