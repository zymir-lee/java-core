package pers.zymir.javacore.operator;

public class AssignmentPrimitiveType {
  public static void main(String[] args) {

    int value01 = 10;
    int value02 = 20;

    // 两个变量各自有物理存储空间 因此这里的操作只是将value20的值赋值给了value01
    value01 = value02;
    value02 = 30;

    // value01仍是20不会改变
    System.out.println("value01: " + value01);
    System.out.println("value02: " + value02);
  }
}
