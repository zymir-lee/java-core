package pers.zymir.javacore.operator;

// 操作符号优先级
public class OperatorPrioritySample {

  public static void main(String[] args) {

    // 最简单的操作符的优先级：先计算乘除、后计算加减
    int value01 = 2 * 3 + 4;

    // 可以通过括号来指定优先级
    int value02 = 2 * (3 + 4);

    System.out.println("value: " + value01);
    System.out.println("value02: " + value02);

    // 对于这样的一个表达式 用括号更加清晰易读
    int value03 = 2 + 4 / 2 * 3 - 6;
    int value04 = 2 + (4 / 2 * 3) - 6;
    System.out.println("value03 == value04: " + (value03 == value04));
  }
}
