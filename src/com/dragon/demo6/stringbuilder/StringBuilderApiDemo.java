package com.dragon.demo6.stringbuilder;

/**
 * @author dragon
 * @version V0.1
 * @title: com.dragon.demo6.stringbuilder.StringBuilderApiDemo
 * @description: Java语言中的 可变的字符序列：StringBuilder 的 API Demo
 * @document: https://docs.oracle.com/javase/8/docs/api/
 * @date 2019/08/13
 */
public class StringBuilderApiDemo {

  /**
   * 为方便大家直接运行代码，前期都使用 main 方法的形式写demo
   */
  public static void main(String[] args) {
    /*
    java.lang.StringBuilder类:字符串缓冲区,可以提高字符串的效率
    构造方法:
        StringBuilder() 构造一个不带任何字符的字符串生成器，其初始容量为 16 个字符。
        StringBuilder(String str) 构造一个字符串生成器，并初始化为指定的字符串内容。
        该字符串生成器的初始容量为 16 加上字符串参数的长度。
    */

    // 空参数构造方法
    StringBuilder sb1 = new StringBuilder();
    System.out.println("sb1:" + sb1);//sb1:""

    // 带字符串的构造方法
    StringBuilder sb2 = new StringBuilder("abc");
    System.out.println("sb2:" + sb2);//sb2:abc

    //  ====================
    /*
      StringBuilder的常用方法:
          public StringBuilder append(...)：添加任意类型数据的字符串形式，并返回当前对象自身。

          public String toString() ：返回此序列中数据的字符串表示形式。
          将分配一个新的 String 对象，并将它初始化，以包含当前由此对象表示的字符串序列。
          然后返回此 String。对此序列的后续更改不影响该 String 的内容。

          public int indexOf(String str)：返回第一次出现的指定子字符串在该字符串中的索引。
          public int lastIndexOf(String str)：返回最右边出现的指定子字符串在此字符串中的索引。
          将最右边的空字符串 "" 视为出现在索引值 this.length() 处。

          public StringBuilder deleteCharAt(int index)： 移除此序列指定位置上的 char。此序列将缩短一个 char。
          注：如果给定索引处的字符是增补字符，则此方法将不会移除整个字符。
   */
    //创建StringBuilder对象
    StringBuilder bu = new StringBuilder();
    //使用append方法往StringBuilder中添加数据
    //append方法返回的是this,调用方法的对象bu,this==bu
    //StringBuilder sb2 = bu.append("abc");//把bu的地址赋值给了sb2
    //System.out.println(bu);//"abc"
    //System.out.println(sb2);//"abc"
    //System.out.println(bu==sb2);//比较的是地址 true

    //使用append方法无需接收返回值
    // bu.append("abc");
    // bu.append(1);
    // bu.append(true);
    // bu.append(8.8);
    // bu.append('中');
    // System.out.println(bu);//abc1true8.8中

    /*
        链式编程:方法返回值是一个对象,可以继续调用方法
    */
    System.out.println("abc".toUpperCase().toLowerCase().toUpperCase().toLowerCase());
    bu.append("abc").append(1).append(true).append(8.8).append('中');
    System.out.println(bu);//abc1true8.8中

    //  =====================
  /*
    StringBuilder和String可以相互转换:

    1.String->StringBuilder:可以使用StringBuilder的构造方法
      StringBuilder(String str) 构造一个字符串生成器，并初始化为指定的字符串内容。
    2.StringBuilder->String:可以使用StringBuilder中的toString方法
      public String toString()：将当前StringBuilder对象转换为String对象。
  */

    //String->StringBuilder
    String str = "hello";
    System.out.println("str:" + str);
    bu = new StringBuilder(str);
    //往StringBuilder中添加数据
    bu.append("world");
    System.out.println("bu:" + bu);

    //StringBuilder->String
    String s = bu.toString();
    System.out.println("s:" + s);

    // indexOf
    bu = new StringBuilder().append("Mr.Dragon.");
    System.out.println("index = " + bu.indexOf("r"));

    // lastIndexOf
    System.out.println("last index = " + bu.lastIndexOf("r"));


    //  ======== 练习题 ==========
    //  将 "Mr.Dragon." 变成 "Mr.Dragon"(删除最后一个点)

    // deleteCharAt
    bu = bu.deleteCharAt(bu.lastIndexOf("."));
    System.out.println("result = " + bu);

  }
}
