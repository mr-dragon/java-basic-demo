package com.dragon.demo2.scanner;

// 1. 导包
import java.util.Scanner;

/**
 * @author dragon
 * @version V0.1
 * @title: com.dragon.demo2.scanner.ScannnerApiDemo
 * @description: Java语言中的键盘输入类：Scannner 的 API Demo
 * @document: https://docs.oracle.com/javase/8/docs/api/
 * @date 2019/08/07 22:28
 */
public class ScannnerApiDemo {

  /**
   * 为方便大家直接运行代码，前期都使用 main 方法的形式写demo
   */
  public static void main(String[] args) {

    /*
     Scanner 类的功能：可以实现键盘输入数据，到程序当中。

    引用类型的一般使用步骤：
    1. 导包
    import 包路径.类名称;
    如果需要使用的目标类，和当前类位于同一个包下，则可以省略导包语句不写。
    只有java.lang包下的内容不需要导包，其他的包都需要import语句。

    2. 创建
    类名称 对象名 = new 类名称();

    3. 使用
    对象名.成员方法名()

    获取键盘输入的一个int数字：int num = sc.nextInt();
    获取键盘输入的一个字符串：String str = sc.next();

     今天主要学习 Scanner 的2个方法：
     1.nextInt() : 将输入信息的下一个标记扫描为一个 int。
     2.next()： 查找并返回来自此扫描器的下一个完整标记。即输入什么就返回什么，不做任何处理
     */

    // 2. 创建：Scanner(InputStream source) 构造一个新的 Scanner，它生成的值是从指定的输入流扫描的。
    // 备注：System.in代表从键盘进行输入
    Scanner sc = new Scanner(System.in);

    // 3. 获取键盘输入的int数字
    System.out.println("请输入一个int数字：");
    int num = sc.nextInt();
    System.out.println("输入的int数字是：" + num);

    // 4. 获取键盘输入的字符串
    System.out.println("请输入一个字符串：");
    String str = sc.next();
    System.out.println("输入的字符串是：" + str);

    /*
    题目1：
    键盘输入两个int数字，并且求出和值。

    思路：
    1. 既然需要键盘输入，那么就用Scanner
    2. Scanner的三个步骤：导包、创建、使用
    3. 需要的是两个数字，所以要调用两次nextInt方法
    4. 得到了两个数字，就需要加在一起。
    5. 将结果打印输出。
    */

    System.out.println("\n题目一：键盘输入两个int数字，并且求出和值.\n请输入第一个数字：");
    int a = sc.nextInt();
    System.out.println("请输入第二个数字：");
    int b = sc.nextInt();

    int result = a + b;
    System.out.println("题目一的结果是：" + result);

    /*
      题目2：
      键盘输入三个int数字，然后求出其中的最大值。

      思路：
      1. 既然是键盘输入，肯定需要用到Scanner
      2. Scanner三个步骤：导包、创建、使用nextInt()方法
      3. 既然是三个数字，那么调用三次nextInt()方法，得到三个int变量
      4. 无法同时判断三个数字谁最大，应该转换成为两个步骤：
          4.1 首先判断前两个当中谁最大，拿到前两个的最大值
          4.2 拿着前两个中的最大值，再和第三个数字比较，得到三个数字当中的最大值
      5. 打印最终结果
    */

    System.out.println("\n题目二：输入三个int数字，求出最大值.\n请输入第一个数字：");
    a = sc.nextInt();
    System.out.println("题目二，请输入第二个数字：");
    b = sc.nextInt();
    System.out.println("题目二，请输入第三个数字：");
    int c = sc.nextInt();

    // 首先得到前两个数字当中的最大值
    int temp = a > b ? a : b;
    int max = temp > c ? temp : c;
    System.out.println("题目二的最大值是：" + max);

    /*
    //最终输出的结果：

    请输入一个int数字：
    1
    输入的int数字是：1
    请输入一个字符串：
    dragon
    输入的字符串是：dragon

    题目一：键盘输入两个int数字，并且求出和值.
    请输入第一个数字：
    2
    请输入第二个数字：
    3
    题目一的结果是：5

    题目二：输入三个int数字，求出最大值.
    请输入第一个数字：
    4
    题目二，请输入第二个数字：
    5
    题目二，请输入第三个数字：
    6
    题目二的最大值是：6
    */
  }

}
