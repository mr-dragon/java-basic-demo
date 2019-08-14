package com.dragon.demo8.arraylist;

import java.util.ArrayList;

/**
 * @author dragon
 * @version V0.1
 * @title: com.dragon.demo8.arraylist.ArrayListApiDemo
 * @description: Java语言中的 有序可重复的集合类：ArrayList 的 API Demo
 * @document: https://docs.oracle.com/javase/8/docs/api/
 * @date 2019/08/13 22:39
 */
public class ArrayListApiDemo {

  /**
   * 为方便大家直接运行代码，前期都使用 main 方法的形式写demo
   */
  public static void main(String[] args) {
    /*
    题目：
    定义一个数组，用来存储3个 Person 对象。

    数组有一个缺点：一旦创建，程序运行期间长度不可以发生改变。
   */

    // 首先创建一个长度为3的数组，里面用来存放Person类型的对象
    Person[] array = new Person[3];

    Person one = new Person("迪丽热巴", 18);
    Person two = new Person("古力娜扎", 28);
    Person three = new Person("玛尔扎哈", 38);

    // 将one当中的地址值赋值到数组的0号元素位置
    array[0] = one;
    array[1] = two;
    array[2] = three;

    System.out.println(array[0]); // 地址值
    System.out.println(array[1]); // 地址值
    System.out.println(array[2]); // 地址值

    System.out.println(array[1].getName()); // 古力娜扎

    // =============
    /*
      数组的长度不可以发生改变。
      但是ArrayList集合的长度是可以随意变化的。

      对于ArrayList来说，有一个尖括号<E>代表泛型。
      泛型：也就是装在集合当中的所有元素，全都是统一的什么类型。
      注意：泛型只能是引用类型，不能是基本类型。

      注意事项：
      对于ArrayList集合来说，直接打印得到的不是地址值，而是内容。
      如果内容是空，得到的是空的中括号：[]
    */

    // 创建了一个ArrayList集合，集合的名称是list，里面装的全都是String字符串类型的数据
    // 备注：从 JDK 1.7+ 开始，右侧的尖括号内部可以不写内容，但是 <> 本身还是要写的。

    ArrayList<String> list = new ArrayList<>();
    System.out.println(list); // []

    // 向集合当中添加一些数据，需要用到add方法。
    list.add("赵丽颖");
    System.out.println(list); // [赵丽颖]

    list.add("迪丽热巴");
    list.add("古力娜扎");
    list.add("玛尔扎哈");
    System.out.println(list); // [赵丽颖, 迪丽热巴, 古力娜扎, 玛尔扎哈]

    // 错误写法！因为创建的时候尖括号泛型已经说了是字符串，添加进去的元素就必须都是字符串才行
    // list.add(100);

    /*
      ArrayList当中的常用方法有：

      public boolean add(E e)：向集合当中添加元素，参数的类型和泛型一致。返回值代表添加是否成功。
      备注：对于ArrayList集合来说，add添加动作一定是成功的，所以返回值可用可不用。
      但是对于其他集合（今后学习）来说，add添加动作不一定成功。

      public E get(int index)：从集合当中获取元素，参数是索引编号，返回值就是对应位置的元素。

      public E remove(int index)：从集合当中删除元素，参数是索引编号，返回值就是被删除掉的元素。

      public int size()：获取集合的尺寸长度，返回值是集合中包含的元素个数。
    */

    list = new ArrayList<>();
    System.out.println(list); // []

    // 向集合中添加元素：add
    boolean success = list.add("柳岩");
    System.out.println(list); // [柳岩]
    System.out.println("添加的动作是否成功：" + success); // true

    list.add("高圆圆");
    list.add("赵又廷");
    list.add("李小璐");
    list.add("贾乃亮");
    System.out.println(list); // [柳岩, 高圆圆, 赵又廷, 李小璐, 贾乃亮]

    // 从集合中获取元素：get。索引值从0开始
    String name = list.get(2);
    System.out.println("第2号索引位置：" + name); // 赵又廷

    // 从集合中删除元素：remove。索引值从0开始。
    String whoRemoved = list.remove(3);
    System.out.println("被删除的人是：" + whoRemoved); // 李小璐
    System.out.println(list); // [柳岩, 高圆圆, 赵又廷, 贾乃亮]

    // 获取集合的长度尺寸，也就是其中元素的个数
    int size = list.size();
    System.out.println("集合的长度是：" + size);


    // =====  遍历集合 =======
    list = new ArrayList<>();
    list.add("迪丽热巴");
    list.add("古力娜扎");
    list.add("玛尔扎哈");

    // 遍历集合
    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }

    for (String s : list) {
      System.out.println(s);
    }

    // ===== 集合中存储 存储基本类型 ====
    /*
      如果希望向集合ArrayList当中存储基本类型数据，必须使用基本类型对应的“包装类”。

      基本类型    包装类（引用类型，包装类都位于java.lang包下）
      byte        Byte
      short       Short
      int         Integer     【特殊】
      long        Long
      float       Float
      double      Double
      char        Character   【特殊】
      boolean     Boolean

      从JDK 1.5+开始，支持自动装箱、自动拆箱。

      自动装箱：基本类型 --> 包装类型
      自动拆箱：包装类型 --> 基本类型
    */

    ArrayList<String> listA = new ArrayList<>();
    // 错误写法！泛型只能是引用类型，不能是基本类型
    // ArrayList<int> listB = new ArrayList<>();

    ArrayList<Integer> listC = new ArrayList<>();
    listC.add(100);
    listC.add(200);
    System.out.println(listC); // [100, 200]

    int num = listC.get(1);
    System.out.println("第1号元素是：" + num);

  }

}
