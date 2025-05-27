package pers.zymir.javacore.operator;

// 操作符+与String一起运算的特殊之处
public class OperatorPlusStringSample {

  public static void main(String[] args) {

    // String使用+操作符，会尝试将非String类型转化为String
    // 其原理是调用String.valueOf()方法实现的，String.valueOf() 方法实际上就是调用了对象的toString()
    Dog dog = new Dog("旺财");
    System.out.println("我狗狗的名字叫: " + dog);
  }

  public static class Dog {
    private String name;

    public Dog(String name) {
      this.name = name;
    }

    @Override
    public String toString() {
      System.out.println("Dog.toString()被调用");
      return this.name;
    }
  }
}
