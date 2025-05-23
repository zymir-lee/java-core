package pers.zymir.javacore.innerclass;

public interface Printer {
  void print();

  static void main(String[] args) {
    final String content = "123";
    // 使用 javac Printer.java 来编译会发现生成了两个class文件
    // 其中一个class文件是Pinter接口 另一个是我们创建的匿名内部类
    ((Printer) () -> System.out.println(content)).print();
  }
}