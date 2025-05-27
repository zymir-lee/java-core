package pers.zymir.javacore.operator;

public class IncrementOperator {
  public static void main(String[] args) {

    // 后缀：先得到返回值再进行计算
    int value = 1;
    System.out.println(value++);
    System.out.println(value);

    // 前缀：先进行计算在得到返回值
    int value02 = 1;
    System.out.println(++value02);
  }
}
