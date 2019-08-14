package com.dragon.demo12.calendar;

import java.util.Calendar;
import java.util.Date;

/**
 * @author dragon
 * @version V0.1
 * @title: com.dragon.demo12.calendar.CalendarApiDemo
 * @description: Java语言中的 操作日历 类：Calendar 的 API Demo
 * @document: https://docs.oracle.com/javase/8/docs/api/
 * @date 2019/08/14
 */
public class CalendarApiDemo {

  /**
   * 为方便大家直接运行代码，前期都使用 main 方法的形式写demo
   */
  public static void main(String[] args) {
    /*
    java.util.Calendar类:日历类
    Calendar类是一个抽象类,里边提供了很多操作日历字段的方法(YEAR、MONTH、DAY_OF_MONTH、HOUR )
    Calendar类无法直接创建对象使用,里边有一个静态方法叫getInstance(),该方法返回了Calendar类的子类对象
    static Calendar getInstance() 使用默认时区和语言环境获得一个日历。
    */

    Calendar c = Calendar.getInstance();//多态
    System.out.println(c);

    /*
    Calendar类的常用成员方法:
        public int get(int field)：返回给定日历字段的值。
        public void set(int field, int value)：将给定的日历字段设置为给定值。
        public abstract void add(int field, int amount)：根据日历的规则，为给定的日历字段添加或减去指定的时间量。
        public Date getTime()：返回一个表示此Calendar时间值（从历元到现在的毫秒偏移量）的Date对象。
    成员方法的参数:
        int field:日历类的字段,可以使用Calendar类的静态成员变量获取
            public static final int YEAR = 1;	年
            public static final int MONTH = 2;	月
            public static final int DATE = 5;	月中的某一天
            public static final int DAY_OF_MONTH = 5;月中的某一天
            public static final int HOUR = 10; 		时
            public static final int MINUTE = 12; 	分
            public static final int SECOND = 13;	秒
 */

    demo01();
    demo02();
    demo03();
    demo04();

  }


  /*
      public Date getTime()：返回一个表示此Calendar时间值（从历元到现在的毫秒偏移量）的Date对象。
      把日历对象,转换为日期对象
   */
  private static void demo04() {
    //使用getInstance方法获取Calendar对象
    Calendar c = Calendar.getInstance();

    Date date = c.getTime();
    System.out.println(date);
  }

  /*
      public abstract void add(int field, int amount)：根据日历的规则，为给定的日历字段添加或减去指定的时间量。
      把指定的字段增加/减少指定的值
      参数:
          int field:传递指定的日历字段(YEAR,MONTH...)
          int amount:增加/减少指定的值
              正数:增加
              负数:减少
   */
  private static void demo03() {
    //使用getInstance方法获取Calendar对象
    Calendar c = Calendar.getInstance();

    //把年增加2年
    c.add(Calendar.YEAR, 2);
    //把月份减少3个月
    c.add(Calendar.MONTH, -3);


    int year = c.get(Calendar.YEAR);
    System.out.println(year);

    int month = c.get(Calendar.MONTH);
    System.out.println(month);//西方的月份0-11 东方:1-12

    //int date = c.get(Calendar.DAY_OF_MONTH);
    int date = c.get(Calendar.DATE);
    System.out.println(date);
  }

  /*
      public void set(int field, int value)：将给定的日历字段设置为给定值。
      参数:
          int field:传递指定的日历字段(YEAR,MONTH...)
          int value:给指定字段设置的值
   */
  private static void demo02() {
    //使用getInstance方法获取Calendar对象
    Calendar c = Calendar.getInstance();

    //设置年为9999
    c.set(Calendar.YEAR, 9999);
    //设置月为9月
    c.set(Calendar.MONTH, 9);
    //设置日9日
    c.set(Calendar.DATE, 9);

    //同时设置年月日,可以使用set的重载方法
    c.set(8888, 8, 8);

    int year = c.get(Calendar.YEAR);
    System.out.println(year);

    int month = c.get(Calendar.MONTH);
    System.out.println(month);//西方的月份0-11 东方:1-12

    int date = c.get(Calendar.DATE);
    System.out.println(date);
  }

  /*
      public int get(int field)：返回给定日历字段的值。
      参数:传递指定的日历字段(YEAR,MONTH...)
      返回值:日历字段代表的具体的值
   */
  private static void demo01() {
    //使用getInstance方法获取Calendar对象
    Calendar c = Calendar.getInstance();
    int year = c.get(Calendar.YEAR);
    System.out.println(year);

    int month = c.get(Calendar.MONTH);
    System.out.println(month);//西方的月份0-11 东方:1-12

    //int date = c.get(Calendar.DAY_OF_MONTH);
    int date = c.get(Calendar.DATE);
    System.out.println(date);
  }
}
