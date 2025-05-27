package pers.zymir.javacore.operator;

public class AssignmentObjects {
  public static void main(String[] args) {

    SampleObject sampleObject01 = new SampleObject("01");
    SampleObject sampleObject02 = new SampleObject("02");

    // 引用类型赋值实际上是操作的引用 此时两个引用都指向keywork = 02的对象，称之为：别名
    sampleObject01 = sampleObject02;
    System.out.println("sampleObject01: " + sampleObject01);
    System.out.println("sampleObject02: " + sampleObject02);

    // 指向同一个对象 操作的实际上是同一个对象
    sampleObject01.setKeyword("03");
    System.out.println("sampleObject01: " + sampleObject01);
    System.out.println("sampleObject02: " + sampleObject02);

    // 方法调用也会产生别名：
    SampleObject sampleObject04 = new SampleObject("04");
    methodCallObjectAlias(sampleObject04);
    System.out.println(sampleObject04);
  }

  public static void methodCallObjectAlias(SampleObject sampleObject) {

    // 正确做法：可以通过别名引用调用方法进行操作，因为它们指向了同一个对象
    // sampleObject.setKeyword("05");

    // 注意：错误的示范
    // 方法参数列表里面的引用实际上是一个别名，并非sampleObject04这个引用 所以这里的操作不会影响外部的sampleObject04
    sampleObject = new SampleObject("05");
  }

  private static class SampleObject {
    private String keyword;

    public SampleObject(String keyword) {
      this.keyword = keyword;
    }

    public void setKeyword(String keyword) {
      this.keyword = keyword;
    }

    @Override
    public String toString() {
      return "SampleObject{" +
          "keyword='" + keyword + '\'' +
          '}';
    }
  }
}
