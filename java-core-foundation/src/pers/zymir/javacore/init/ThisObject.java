package pers.zymir.javacore.init;

public class ThisObject {

  public static void main(String[] args) {
    ThisObject thisObject = new ThisObject();
    thisObject.thisFoo(100);
  }

  // this被编译器隐式传递到实例方法的第一个参数，可以显式的声明出来证明这一点
  public void thisFoo(ThisObject this, int value) {
    System.out.println("thisFoo" + value);
  }
}