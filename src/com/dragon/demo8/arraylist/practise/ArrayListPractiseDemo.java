package com.dragon.demo8.arraylist.practise;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author dragon
 * @version V0.1
 * @title: com.dragon.demo8.arraylist.practise.ArrayListPractiseDemo
 * @description: Java语言中的 有序可重复的集合类：ArrayList 的 练习 Demo
 * @document: https://docs.oracle.com/javase/8/docs/api/
 * @date 2019/08/13 22:58
 */
public class ArrayListPractiseDemo {

  public static void main(String[] args) {

    /*
        题目1：
        生成6个1~33之间的随机整数，添加到集合，并遍历集合。

        思路：
        1. 需要存储6个数字，创建一个集合，<Integer>
        2. 产生随机数，需要用到Random
        3. 用循环6次，来产生6个随机数字：for循环
        4. 循环内调用r.nextInt(int n)，参数是33，0~32，整体+1才是1~33
        5. 把数字添加到集合中：add
        6. 遍历集合：for、size、get
     */
    ArrayList<Integer> list = new ArrayList<>();
    Random r = new Random();
    for (int i = 0; i < 6; i++) {
      int num = r.nextInt(33) + 1;
      list.add(num);
    }
    // 遍历集合
    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }


    //===========
    /*
        题目2：
        自定义4个学生对象，添加到集合，并遍历。

        思路：
        1. 自定义Student学生类，四个部分。
        2. 创建一个集合，用来存储学生对象。泛型：<Student>
        3. 根据类，创建4个学生对象。
        4. 将4个学生对象添加到集合中：add
        5. 遍历集合：for、size、get
    */
      ArrayList<Student> list2 = new ArrayList<>();

      Student one = new Student("洪七公", 20);
      Student two = new Student("欧阳锋", 21);
      Student three = new Student("黄药师", 22);
      Student four = new Student("段智兴", 23);

      list2.add(one);
      list2.add(two);
      list2.add(three);
      list2.add(four);

      // 遍历集合
      for (int i = 0; i < list.size(); i++) {
          Student stu = list2.get(i);
          System.out.println("姓名：" + stu.getName() + "，年龄" + stu.getAge());
      }

    /*
        题目3：
        定义以指定格式打印集合的方法(ArrayList类型作为参数)，使用{}扩起集合，使用@分隔每个元素。
        格式参照 {元素@元素@元素}。

        System.out.println(list);       [10, 20, 30]
        printArrayList(list);           {10@20@30}
    */

    ArrayList<String> list3 = new ArrayList<>();
    list3.add("张三丰");
    list3.add("宋远桥");
    list3.add("张无忌");
    list3.add("张翠山");
    System.out.println(list3); // [张三丰, 宋远桥, 张无忌, 张翠山]

    printArrayList(list3);


    //===========
    /*
        题目4：
        用一个大集合存入20个随机数字，然后筛选其中的偶数元素，放到小集合当中。
        要求使用自定义的方法来实现筛选。

        分析：
        1. 需要创建一个大集合，用来存储int数字：<Integer>
        2. 随机数字就用Random nextInt
        3. 循环20次，把随机数字放入大集合：for循环、add方法
        4. 定义一个方法，用来进行筛选。
        筛选：根据大集合，筛选符合要求的元素，得到小集合。
        三要素
        返回值类型：ArrayList小集合（里面元素个数不确定）
        方法名称：getSmallList
        参数列表：ArrayList大集合（装着20个随机数字）
        5. 判断（if）是偶数：num % 2 == 0
        6. 如果是偶数，就放到小集合当中，否则不放。
     */

      ArrayList<Integer> bigList = new ArrayList<>();
      Random random = new Random();
      for (int i = 0; i < 20; i++) {
          int num = random.nextInt(100) + 1; // 1~100
          bigList.add(num);
      }

      ArrayList<Integer> smallList = getSmallList(bigList);

      System.out.println("偶数总共有多少个：" + smallList.size());
      for (int i = 0; i < smallList.size(); i++) {
          System.out.println(smallList.get(i));
      }

      //end~
  }

  /*
   定义方法的三要素
   返回值类型：只是进行打印而已，没有运算，没有结果；所以用void
   方法名称：printArrayList
   参数列表：ArrayList
    */
  public static void printArrayList(ArrayList<String> list) {
    // {10@20@30}
    System.out.print("{");
    for (int i = 0; i < list.size(); i++) {
      String name = list.get(i);
      if (i == list.size() - 1) {
        System.out.println(name + "}");
      } else {
        System.out.print(name + "@");
      }
    }
  }

    // 这个方法，接收大集合参数，返回小集合结果
    public static ArrayList<Integer> getSmallList(ArrayList<Integer> bigList) {
        // 创建一个小集合，用来装偶数结果
        ArrayList<Integer> smallList = new ArrayList<>();
        for (int i = 0; i < bigList.size(); i++) {
            int num = bigList.get(i);
            if (num % 2 == 0) {
                smallList.add(num);
            }
        }
        return smallList;
    }

}
