package pers.zymir.javacore.polymorphic;

public class Parent {
  private String flag = "parent";

  public Parent() {
    // 错误的示范 谨慎在父类中调用子类重写的方法
    // 执行父类构造函数时 子类对象还未初始化完成 可能会造成意想不到的结果
    printFlag();
  }

  public void printFlag() {
    System.out.println(flag);
  }
}
