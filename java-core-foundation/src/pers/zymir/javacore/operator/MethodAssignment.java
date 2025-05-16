package pers.zymir.javacore.operator;

public class MethodAssignment {

  private int value;

  public static void main(String[] args) {
    MethodAssignment methodAssignment = new MethodAssignment();
    methodAssignment.value = 100;

    // 注意 方法会产生别名 在方法中操作的引用实际上是当前引用的别名 所以操作引用指向另一个对象不会影响当前的引用
    foo(methodAssignment);

    System.out.println("value:" + methodAssignment.value);
  }

  // 请注意 这是一个反例
  public static void foo(MethodAssignment methodAssignment) {
    MethodAssignment newMethodAssignment = new MethodAssignment();
    newMethodAssignment.value = -100;

    methodAssignment = newMethodAssignment;
    System.out.println("方法内部修改methodAssignment引用指向的对象");
  }
}
