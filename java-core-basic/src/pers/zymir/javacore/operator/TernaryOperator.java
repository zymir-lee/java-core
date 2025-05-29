package pers.zymir.javacore.operator;

public class TernaryOperator {

  public static void main(String[] args) {

    boolean isTrue = false;
    // isTrue = true; // 调整为true
    int value = isTrue ? value01() : value02();
    System.out.println(value);
  }

  public static int value01() {
    System.out.println("value01执行");
    return 1;
  }

  public static int value02() {
    System.out.println("value02执行");
    return 2;
  }
}
