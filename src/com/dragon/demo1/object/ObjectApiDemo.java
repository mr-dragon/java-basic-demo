package com.dragon.demo1.object;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

/**
 * @author dragon
 * @version V0.1
 * @title: com.dragon.demo1.object.ObjectApiDemo
 * @description: Java语言中的根类：Object的 API Demo
 * @document: https://docs.oracle.com/javase/8/docs/api/
 * @date 2019/08/06 22:58
 */
public class ObjectApiDemo {

  /**
   * 为方便大家直接运行代码，前期都使用 main 方法的形式写demo
   */
  public static void main(String[] args) {

    /*
     java.lang.Object
     类 Object 是类层次结构的根(父)类。
     每个类(Person,Student...)都使用 Object 作为超(父)类。
     所有对象（包括数组）都实现这个类的方法。

     今天主要学习Object的三个方法：
     1.toString ()
     2.equals (Object obj)
     3.hashCode()
     */
    Object object = new Object();

    //1.=====================================
    //public String toString ()：返回该对象的字符串形式。
    String toString = object.toString();
    // toString: java.lang.Object@60e53b93
    System.out.println("Object.toString : " + toString);

    /*
      Person类默认继承了Object类,所以可以使用Object类中的toString方法
      String toString() 返回该对象的字符串表示。
    */
    Person p = new Person("dragon", 18);
    //com.md.demo.object.Person@75412c2f | abc | Person{name=张三 ,age=18}
    System.out.println("Person.toString : " + p.toString());

    /*
      直接打印对象的名字,其实就是调用对象的 toString  p=p.toString();
      com.md.demo.object.Person@5f150435 | abc | Person{name=张三 ,age=18}
     */
    System.out.println(p);

    //看一个类是否重写了toString,直接打印这个类的对象即可,如果没有重写toString方法那么打印的是对象的地址值
    Random r = new Random();
    //java.util.Random@3f3afe78  没有重写toString方法
    System.out.println(r);

    Scanner sc = new Scanner(System.in);
    //java.util.Scanner[delimiters=\p{javaWhitespace}+..  重写toString方法
    System.out.println(sc);

    ArrayList<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    //[1, 2, 3]  重写toString方法
    System.out.println(list);


    //2.=====================================
    //public boolean equals (Object obj)：指示其他某个对象是否与此对象“相等”。
    Object tempObject = new Object();
    boolean equalsResult = object.equals(tempObject);
    System.out.println("equals : " + equalsResult);

     /*
        Person类默认继承了Object类,所以可以使用Object类的equals方法
        boolean equals(Object obj) 指示其他某个对象是否与此对象“相等”。
        equals方法源码:
            public boolean equals(Object obj) {
                return (this == obj);
            }
          参数:
              Object obj:可以传递任意的对象
              == 比较运算符,返回的是一个布尔值 true false
              基本数据类型:比较的是值
              引用数据类型:比价的是两个对象的地址值

           this是谁? 哪个对象调用的方法,方法中的this就是哪个对象;
           p1调用的equals方法所以this就是p1
           obj是谁? 传递过来的参数p2
           this==obj --> p1 == p2
   */
    Person p1 = new Person("dragon", 18);
    //Person p2 = new Person("mr-dragon",19);
    Person p2 = new Person("dragon", 18);
    System.out.println("p1:" + p1);//p1:com.md.demo.object.Object.Person@58ceff1
    System.out.println("p2:" + p2);//p2:com.md.demo.object.Object.Person@7c30a502

    System.out.println("p1.equals(p1): "+ p1.equals(p1));
    System.out.println("p1.equals(p2): "+ p1.equals(p2));

    //3.=====================================
    //int hashCode () :返回对象的哈希码值。
    int hashCode = object.hashCode();
    System.out.println("hashCode = " + hashCode);

    //============= Objects  ===============
    String s1 = "abc";
    //String s1 = null;
    String s2 = "abc";
    //boolean b = s1.equals(s2); // NullPointerException null是不能调用方法的,会抛出空指针异常
    //System.out.println(b);
    /*
        Objects类的equals方法: 对两个对象进行比较,防止空指针异常
        public static boolean equals(Object a, Object b) {
            return (a == b) || (a != null && a.equals(b));
        }
     */
    System.out.println("Objects.equals(s1, s2)："+ Objects.equals(s1, s2));

  }


}
