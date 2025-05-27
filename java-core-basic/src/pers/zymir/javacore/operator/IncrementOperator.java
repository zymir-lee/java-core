package pers.zymir.javacore.operator;

public class IncrementOperator {
  public static void main(String[] args) {

    // 后缀：先得到返回值再进行计算
    int value = 1;
    System.out.println(value++); // 1
    System.out.println(value); // 2

    // 前缀：先进行计算在得到返回值
    int value02 = 1;
    System.out.println(++value02); // 2

    // 不要滥用自增操作符 不要写出下面这样逆天的代码
    int i =1;
    System.out.println(i++ + ++i);
  }
}
