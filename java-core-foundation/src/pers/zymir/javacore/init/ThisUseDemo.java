package pers.zymir.javacore.init;

public class ThisUseDemo {
  private int counter;

  public ThisUseDemo() {
    this.counter = 0;
  }

  public ThisUseDemo incr() {
    counter++;
    return this;
  }

  public void printCounter() {
    System.out.println(this.counter);
  }

  public static void main(String[] args) {
    ThisUseDemo thisUseDemo = new ThisUseDemo();
    thisUseDemo.incr().incr().printCounter();
  }
}
