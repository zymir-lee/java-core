package pers.zymir.javacore.operator;

public class ArithmeticOperatorSample {
  public static void main(String[] args) {

    // 整数除法将丢弃小数部分
    int value01 = 10 / 3;
    System.out.println(value01); // 3

    // 快捷运算符 完成运算&赋值
    int value02 = 0;
    value02 += 4;
    System.out.println(value02);

    // 通过一元运算符反转符号位
    value02 = -value02;
    System.out.println(value02);
  }
}
