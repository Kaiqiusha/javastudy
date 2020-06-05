package com.test02;
/*
 * 方法的重写 Override
 * 当子类继承父类方法时，但父类的方法体不适用于子类了，那么子类可以选择进行重写“override”
 * 方法 = 方法签名 / 方法头 +  方法体
 * 重写要求
 * 1 方法名：必须和父类被重写的方法名“相同”
 * 2 形参列表：必须和父类被重写的形参列表相同
 * 3 返回值类型：
 *      基本数据类型和void：要求与父类被重写的方法的返回值类型相同
 *      例如：
 *           子类方法的返回值类型是Student 父类被重写的返回值类型是 Student
 *           子类方法的返回值类型是Student 父类被重写的返回值类型是 Person
 *           子类方法的返回值类型是Person 父类被重写的返回值类型是 Studnet（错误） 子类要小于等于父类的大小
 * 4 修饰符
 *  权限修饰符：子类重写的方法的权限修饰符的可见范围>=父类被重写方法的权限修饰的范围
 *      例如：
 *             子类是public 父类被重写权限为public
 *             子类是public 父类被重写权限为protected
 *
 */
public class TestOverride {
    public static void main(String[] args) {
        Manager m = new Manager("王柯", 2000,2000 );
        System.out.println(m.getInfo());
    }
}
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
class Manager extends Employee {
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
    public String getInfo(){
        // 父类的name和salary 的属性是私有的，不能在子类中直接使用  重写父类方法
        // return "姓名：" + name + ", 薪资：" + salary + "奖金" + bonus;
         return "姓名：" + getName() + ", 薪资：" + getSalary() + "奖金：" + bonus;
    }

    public Manager(double bonus) {
        this.bonus = bonus;
    }
}
