package pers.zymir.javacore.polymorphic;

public class Child extends Parent {

  private String flag = "child";

  @Override
  public void printFlag() {
    System.out.println(flag);
  }
}
