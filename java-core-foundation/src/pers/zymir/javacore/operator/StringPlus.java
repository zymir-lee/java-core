package pers.zymir.javacore.operator;

public class StringPlus {
  public static void main(String[] args) {
    StringPlusOperatorObject stringPlusOperatorObject = new StringPlusOperatorObject();

    // 当编译器看到一个字符串后面紧跟着一个 + 和一个非 String 类型的元素时，
    // 它会尝试着将这个非 String 类型的元素转换为 String 类型
    // 实际上调用的是toString()方法
    String string = "" + stringPlusOperatorObject;
  }
}