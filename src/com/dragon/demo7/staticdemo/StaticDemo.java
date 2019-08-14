package com.dragon.demo7.staticdemo;

/**
 * @author dragon
 * @version V0.1
 * @title: com.dragon.demo7.staticdemo.StaticDemo
 * @description: Java语言中的 static：静态关键字
 * @document: https://docs.oracle.com/javase/8/docs/api/
 * @date 2019/08/13
 */
public class StaticDemo {

  /**
   * 为方便大家直接运行代码，前期都使用 main 方法的形式写demo
   */
  public static void main(String[] args) {

    /*
      如果一个成员变量使用了static关键字，那么这个变量不再属于对象自己，而是属于所在的类。多个对象共享同一份数据。
    */

    Student two = new Student("黄蓉", 16);
    two.room = "101教室";
    two.show();

    Student one = new Student("郭靖", 19);
    one.show();

    /*
     一旦使用static修饰成员方法，那么这就成为了静态方法。静态方法不属于对象，而是属于类的。

     如果没有static关键字，那么必须首先创建对象，然后通过对象才能使用它。
     如果有了static关键字，那么不需要创建对象，直接就能通过类名称来使用它。

     无论是成员变量，还是成员方法。如果有了static，都推荐使用类名称进行调用。
     静态变量：类名称.静态变量
     静态方法：类名称.静态方法()

     注意事项：
     1. 静态不能直接访问非静态。
     原因：因为在内存当中是【先】有的静态内容，【后】有的非静态内容。
     “先人不知道后人，但是后人知道先人。”
     2. 静态方法当中不能用this。
     原因：this代表当前对象，通过谁调用的方法，谁就是当前对象。
     */

    MyClass obj = new MyClass(); // 首先创建对象
    // 然后才能使用没有static关键字的内容
    obj.method();

    // 对于静态方法来说，可以通过对象名进行调用，也可以直接通过类名称来调用。
    obj.methodStatic(); // 正确，不推荐，这种写法在编译之后也会被javac翻译成为“类名称.静态方法名”
    MyClass.methodStatic(); // 正确，推荐

    // 对于本来当中的静态方法，可以省略类名称
    myMethod();
    StaticDemo.myMethod(); // 完全等效


    //  =============
    // 首先设置一下教室，这是静态的东西，应该通过类名称进行调用
    Student.room = "101教室";

    one = new Student("郭靖", 20);
    System.out.println("one的姓名：" + one.getName());
    System.out.println("one的年龄：" + one.getAge());
    System.out.println("one的教室：" + Student.room);
    System.out.println("============");

    two = new Student("黄蓉", 18);
    System.out.println("two的姓名：" + two.getName());
    System.out.println("two的年龄：" + two.getAge());
    System.out.println("two的教室：" + Student.room);

  }

  public static void myMethod() {
    System.out.println("自己的方法！");
  }
}
