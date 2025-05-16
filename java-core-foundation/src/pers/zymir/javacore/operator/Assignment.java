package pers.zymir.javacore.operator;

public class Assignment {

  private int value;

  public static void main(String[] args) {
    Assignment assignment01 = new Assignment();
    Assignment assignment02 = new Assignment();

    assignment01.value = 1;
    assignment02.value = 2;

    System.out.println("01value:" + assignment01.value);
    System.out.println("02value:" + assignment02.value);

    // 注意 此时 assignment01 assignment02引用指向了同一个对象（原assignment02指向的对象）
    assignment01 = assignment02;

    System.out.println("01value:" + assignment01.value);
    System.out.println("02value:" + assignment02.value);

    assignment01.value = 100;

    System.out.println("01value:" + assignment01.value);
    System.out.println("02value:" + assignment02.value);
  }
}
