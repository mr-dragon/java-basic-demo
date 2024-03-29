package com.dragon.demo11.date;

import java.util.Date;

/**
 * @author dragon
 * @version V0.1
 * @title: com.dragon.demo11.date.DateApiDemo
 * @description: Java语言中的 日期类：Date 的 API Demo
 * @document: https://docs.oracle.com/javase/8/docs/api/
 * @date 2019/08/07 23:01
 */
public class DateApiDemo {

  /**
   * 为方便大家直接运行代码，前期都使用 main 方法的形式写demo
   */
  public static void main(String[] args) {
    /*
      java.util.Date:表示日期和时间的类
      类 Date 表示特定的瞬间，精确到毫秒。
      毫秒:千分之一秒 1000毫秒=1秒
      特定的瞬间:一个时间点,一刹那时间
      2088-08-08 09:55:33:333 瞬间
      2088-08-08 09:55:33:334 瞬间
      2088-08-08 09:55:33:334 瞬间
      ...
      毫秒值的作用:可以对时间和日期进行计算
      2099-01-03 到 2088-01-01 中间一共有多少天
      可以日期转换为毫秒进行计算,计算完毕,在把毫秒转换为日期

      把日期转换为毫秒:
          当前的日期:2088-01-01
          时间原点(0毫秒):1970 年 1 月 1 日 00:00:00(英国格林威治)
          就是计算当前日期到时间原点之间一共经历了多少毫秒 (3742767540068L)
      注意:
          中国属于东八区,会把时间增加8个小时
          1970 年 1 月 1 日 08:00:00

      把毫秒转换为日期:
          1 天 = 24 × 60 × 60 = 86400 秒  = 86400 x 1000 = 86400000毫秒
    */
    System.out.println(System.currentTimeMillis());//获取当前系统时间到1970 年 1 月 1 日 00:00:00经历了多少毫秒

    demo01();
    demo02();
    demo03();

  }

  /*
    long getTime() 把日期转换为毫秒值(相当于System.currentTimeMillis()方法)
      返回自 1970 年 1 月 1 日 00:00:00 GMT 以来此 Date 对象表示的毫秒数。
  */
  private static void demo03() {
    Date date = new Date();
    long time = date.getTime();
    System.out.println(time);//3742777636267
  }

  /*
      Date类的带参数构造方法
      Date(long date) :传递毫秒值,把毫秒值转换为Date日期
   */
  private static void demo02() {
    Date date = new Date(0L);
    System.out.println(date);// Thu Jan 01 08:00:00 CST 1970

    date = new Date(3742767540068L);
    System.out.println(date);// Sun Aug 08 09:39:00 CST 2088
  }

  /*
      Date类的空参数构造方法
      Date() 获取当前系统的日期和时间
   */
  private static void demo01() {
    Date date = new Date();
    System.out.println(date);//Sun Aug 08 12:23:03 CST 2088
  }
}
