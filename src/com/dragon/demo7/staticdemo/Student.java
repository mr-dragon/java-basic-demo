package com.dragon.demo7.staticdemo;

public class Student {

  private int id; // 学号
  private String name; // 姓名
  private int age; // 年龄
  static String room; // 所在教室
  private static int numberOfStudent = 0; // 学号计数器，每当new了一个新对象的时候，计数器++

  public Student() {
    this.id = ++numberOfStudent;
  }

  public Student(String name, int age) {
    this.name = name;
    this.age = age;
    this.id = ++numberOfStudent;
  }

  // 打印属性值
  public void show() {
    System.out.println("Student : name=" + name + ", age=" + age + ", id=" + id);
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
}
