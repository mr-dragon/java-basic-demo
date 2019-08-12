package com.dragon.demo4.random;

import java.util.Random;
import java.util.Scanner;

/**
 * @author dragon
 * @version V0.1
 * @title: com.dragon.demo4.random.RandomApiDemo
 * @description: Java语言中的 随机数生成类：Random 的 API Demo
 * @document: https://docs.oracle.com/javase/8/docs/api/
 * @date 2019/08/07 23:01
 */
public class RandomApiDemo {

  /**
   * 为方便大家直接运行代码，前期都使用 main 方法的形式写demo
   */
  public static void main(String[] args) {
    /*
      Random类用来生成随机数字。使用起来也是三个步骤：

      1. 导包
      import java.util.Random;

      2. 创建
      Random r = new Random(); // 小括号当中留空即可

      3. 使用
      获取一个随机的int数字（范围是int所有范围，有正负两种）：int num = r.nextInt()
      获取一个随机的int数字（参数代表了范围，左闭右开区间）：int num = r.nextInt(3)
      实际上代表的含义是：[0,3)，也就是0~2

      nextInt()：
      返回下一个伪随机数，它是此随机数生成器的序列中均匀分布的 int 值。
      nextInt 的常规协定是，伪随机地生成并返回一个 int 值。
      所有 2的32次方 个可能 int 值的生成概率（大致）相同。
    */

    Random r = new Random();

    int num = r.nextInt();

    System.out.println("1.生成的随机数是：" + num);


    for (int i = 0; i < 10; i++) {
      num = r.nextInt(10); // 范围实际上是0~9
      System.out.println(num);
    }

    //  ====================
  /*
    题目1：
    根据int变量n的值，来获取随机数字，范围是[1,n]，可以取到1也可以取到n。

    思路：
    1. 定义一个int变量n，随意赋值
    2. 要使用Random：三个步骤，导包、创建、使用
    3. 如果写10，那么就是0~9，然而想要的是1~10，可以发现：整体+1即可。
    4. 打印随机数字
 */
    int n = 5;
    for (int i = 0; i < 10; i++) {
      // 本来范围是[0,n)，整体+1之后变成了[1,n+1)，也就是[1,n]
      int result = r.nextInt(n) + 1;
      System.out.println(result);
    }


    //  =====================
  /*
    题目2：用代码模拟猜数字的小游戏。

    思路：
    1. 首先需要产生一个随机数字，并且一旦产生不再变化。用Random的nextInt方法
    2. 需要键盘输入，所以用到了Scanner
    3. 获取键盘输入的数字，用Scanner当中的nextInt方法
    4. 已经得到了两个数字，判断（if）一下：
        如果太大了，提示太大，并且重试；
        如果太小了，提示太小，并且重试；
        如果猜中了，游戏结束。
    5. 重试就是再来一次，循环次数不确定，用while(true)。
  */

    int randomNum = r.nextInt(100) + 1; // [1,100]
    Scanner sc = new Scanner(System.in);

    while (true) {
      // 思考：此类游戏 对半猜会快些吗？
      System.out.println("3.请输入你猜测的数字：");
      int guessNum = sc.nextInt(); // 键盘输入猜测的数字

      if (guessNum > randomNum) {
        System.out.println("太大了，请重试。");
      } else if (guessNum < randomNum) {
        System.out.println("太小了，请重试。");
      } else {
        System.out.println("恭喜你，猜中啦！");
        break; // 如果猜中，不再重试
      }
    }

    System.out.println("游戏结束。");
  }
}
