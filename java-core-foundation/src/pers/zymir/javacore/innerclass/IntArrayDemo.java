package pers.zymir.javacore.innerclass;

public class IntArrayDemo {
  public static void main(String[] args) {

    IntArray intArray = new IntArray(5);

    for (int i = 1; i <= 5; i++) {
      intArray.add(i);
    }

    IntArray.IntArrayIterator iterator = intArray.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.current());
      iterator.next();
    }
  }
}
