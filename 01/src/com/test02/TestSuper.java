package com.test02;
/*
*supper:从父类中取查找 引用父类xx
* 用法：
* 1 super.属性
* 当子类声明和父类同名的属性时 可以使用super ，属性来访问父类的属性
* 2 super.方法
* 当在子类中徐奥调用父类被重写的方法时 可以使用super.方法
*
* 3 super（）或者 super（实参列表）
* super() 调用父类的无参构造
* super（实参列表）： 调用父类的有参构造
* 注意：必须在子类构造器的首行
* 如果子类构造器 没有写super（）他也是存在的
* 但是如果子类构造器中邪了super（实参列表） 那么super（）就不会存在.gitignore
*/
public class TestSuper {
    public static void main(String[] args) {
        XueSheng xuesheng = new XueSheng("王柯", 18, 85);
        System.out.println(xuesheng.getInfo());

    }
}
class A{
    int num;
}
class B extends A{
    int num;
    public void printNum( int num ){
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);
    }
}
class Human{
    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Human(){
        super(); //调用的是公共类java.lang.Object类中的无参构造
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String getInfo(){
        return "姓名： " + name + "，年龄： "  + age;
    }
}
class XueSheng extends Human{
    private  int score;

    public XueSheng(String name, int age, int score) {
        super(name, age);
        this.score = score;
    }
    public XueSheng(){
        super();
    }
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    public String getInfo(){
        //return "姓名： " + getName() + "，年龄： "  + getScore() + "成绩： " + score; // 前面是写过了
        return super.getInfo() + "成绩： " + score;
    }
}