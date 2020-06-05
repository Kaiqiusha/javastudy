package com.test01;
/*
* 方法的重写 Override
 */
class Employee {
    // 属性列表
    private String name;
    private double salary;
    //构造器 controller
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    public Employee(){

    }
    // get 和 set 方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String getInfo(){
        return "姓名：" + name + ", 薪资：" + salary;
    }
}
// 经理
class Manager extends Employee{
    private double bonus; //奖金

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }
    public  Manager(){

    }
    //get 和 set 方法
    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public Manager(double bonus) {
        this.bonus = bonus;
    }
}
