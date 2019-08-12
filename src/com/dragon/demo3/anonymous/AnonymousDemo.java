package com.dragon.demo3.anonymous;

import java.util.Scanner;

/**
 * @author dragon
 * @version V0.1
 * @title: com.dragon.demo3.anonymous.AnonymousDemo
 * @description: Java语言中的 "匿名对象"
 * @document: https://docs.oracle.com/javase/8/docs/api/
 * @date 2019/08/07 22:57
 */
public class AnonymousDemo {

  /**
   * 为方便大家直接运行代码，前期都使用 main 方法的形式写demo
   */
  public static void main(String[] args) {
    /*
    创建对象的标准格式：
    类名称 对象名 = new 类名称();

    匿名对象就是只有右边的对象，没有左边的名字和赋值运算符。
    new 类名称();

    注意事项：匿名对象只能使用唯一的一次，下次再用不得不再创建一个新对象。
    使用场景：如果确定有一个对象只需要使用唯一的一次，就可以用匿名对象。
   */

    // 左边的 one 就是对象的名字
    Person one = new Person();
    one.name = "dragon";
    one.showName(); // 我叫 dragon
    System.out.println("===============\n");

    // 匿名对象：只能使用一次
    new Person().name = "mr.dragon";
    // 打印结果我叫：null，切忌注意这种方式！
    // 新new的对象，根本没有 set name，所以是null
    new Person().showName();

    // ================================
    // 普通使用方式
    // Scanner sc = new Scanner(System.in);
    // int num = sc.nextInt();

    // 匿名对象的方式
    // int num = new Scanner(System.in).nextInt();
    // System.out.println("输入的是：" + num);

    // 使用一般写法传入参数
    //  Scanner sc = new Scanner(System.in);
    //  methodParam(sc);

    // 使用匿名对象来进行传参
    // methodParam(new Scanner(System.in));

    Scanner sc = methodReturn();
    int num = sc.nextInt();
    System.out.println("输入的是：" + num);
  }

  public static void methodParam(Scanner sc) {
    int num = sc.nextInt();
    System.out.println("输入的是：" + num);
  }

  public static Scanner methodReturn() {
    // Scanner sc = new Scanner(System.in);
    // return sc;
    return new Scanner(System.in);
  }

}
