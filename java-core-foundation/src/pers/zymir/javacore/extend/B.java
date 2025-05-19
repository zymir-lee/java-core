package pers.zymir.javacore.extend;

public class B extends A {
  @Override
  public void foo() {
    System.out.println("B");

    // 通过super关键字调用父类版本方法 与递归当前方法做出区分
    super.foo();
  }
}