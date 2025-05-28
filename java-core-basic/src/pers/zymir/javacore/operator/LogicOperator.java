package pers.zymir.javacore.operator;

public class LogicOperator {

  public static void main(String[] args) {

    // returnFalse()被短路
    boolean result01 = returnTrue() || returnFalse();

    // returnTrue()被短路
    boolean result02 = returnFalse() && returnTrue();
  }

  private static boolean returnFalse() {
    System.out.println("return false执行");
    return false;
  }

  private static boolean returnTrue() {
    System.out.println("return true执行");
    return true;
  }
}