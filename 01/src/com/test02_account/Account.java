package com.test02_account;

public class Account {
    private String id;
    private double balance;
    private double annualInterestrRate;
// controller
    public Account(String id, double balance, double annualInterestrRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestrRate = annualInterestrRate;
    }
    // get  set
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestrRate() {
        return annualInterestrRate;
    }

    public void setAnnualInterestrRate(double annualInterestrRate) {
        this.annualInterestrRate = annualInterestrRate;
    }
    // 返回月利率getMonthlyInterRate()
    //取款方法
    // 存款方法
    public double getMonthlyInterest(){
        return annualInterestrRate / 12;
    }
    public void withdraw(double amount){
        if (amount < 0){
            System.out.println("非法参数");
            return;
        }
        if (amount > balance){
            System.out.println("余额不足");
        }else{
            balance -= amount;
        }
    }
    public void deposit(double amount){
        if (amount < 0 ){
            System.out.println("非法参数");
            return;//结束当前方法
        }
        balance += amount;
    }
}
