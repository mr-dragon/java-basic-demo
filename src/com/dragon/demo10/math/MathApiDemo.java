package com.dragon.demo10.math;

/**
 * @author dragon
 * @version V0.1
 * @title: com.dragon.demo10.math.MathApiDemo
 * @description: Java语言中的 数学相关工具类：Math 的 API Demo
 * @document: https://docs.oracle.com/javase/8/docs/api/
 * @date 2019/08/13 23:20
 */
public class MathApiDemo {

  /**
   * 为方便大家直接运行代码，前期都使用 main 方法的形式写demo
   */
  public static void main(String[] args) {
    /*
      java.lang.Math类是数学相关的工具类，里面提供了大量的静态方法，完成与数学运算相关的操作。

      public static double abs(double num)：获取绝对值。有多种重载。
      public static double ceil(double num)：向上取整。
      public static double floor(double num)：向下取整。
      public static long round(double num)：四舍五入。

      Math.PI代表近似的圆周率常量（double）。
    */
    // 获取绝对值
    System.out.println(Math.abs(3.14)); // 3.14
    System.out.println(Math.abs(0)); // 0
    System.out.println(Math.abs(-2.5)); // 2.5
    System.out.println("================");

    // 向上取整
    System.out.println(Math.ceil(3.9)); // 4.0
    System.out.println(Math.ceil(3.1)); // 4.0
    System.out.println(Math.ceil(3.0)); // 3.0
    System.out.println("================");

    // 向下取整，抹零
    System.out.println(Math.floor(30.1)); // 30.0
    System.out.println(Math.floor(30.9)); // 30.0
    System.out.println(Math.floor(31.0)); // 31.0
    System.out.println("================");

    System.out.println(Math.round(20.4)); // 20
    System.out.println(Math.round(10.5)); // 11

    /*
    题目：
    计算在-10.8到5.9之间，绝对值大于6或者小于2.1的整数有多少个？

    分析：
    1. 既然已经确定了范围，for循环
    2. 起点位置-10.8应该转换成为-10，两种办法：
        2.1 可以使用Math.ceil方法，向上（向正方向）取整
        2.2 强转成为int，自动舍弃所有小数位
    3. 每一个数字都是整数，所以步进表达式应该是num++，这样每次都是+1的。
    4. 如何拿到绝对值：Math.abs方法。
    5. 一旦发现了一个数字，需要让计数器++进行统计。

    备注：如果使用Math.ceil方法，-10.8可以变成-10.0。注意double也是可以进行++的。
    * */

    int count = 0; // 符合要求的数量

    double min = -10.8;
    double max = 5.9;
    // 这样处理，变量i就是区间之内所有的整数
    for (int i = (int) min; i < max; i++) {
      int abs = Math.abs(i); // 绝对值
      if (abs > 6 || abs < 2.1) {
        System.out.println(i);
        count++;
      }
    }

    System.out.println("总共有：" + count); // 9
  }
}
