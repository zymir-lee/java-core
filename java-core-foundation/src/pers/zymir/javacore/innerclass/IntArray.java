package pers.zymir.javacore.innerclass;

public class IntArray {
  private final int[] items;
  private int index;

  public IntArray(int maxLength) {
    items = new int[maxLength];
    index = 0;
  }

  public void add(int value) {
    if (index >= items.length) {
      throw new ArrayIndexOutOfBoundsException();
    }
    items[index++] = value;
  }

  public IntArrayIterator iterator() {
    return new IntArrayIterator();
  }

  class IntArrayIterator implements ArrayIterator {
    private int cursor = 0;

    @Override
    public boolean hasNext() {
      return cursor < index;
    }

    @Override
    public int current() {
      return items[cursor];
    }

    @Override
    public void next() {
      if (cursor == index) {
        throw new ArrayIndexOutOfBoundsException();
      }
      cursor++;
    }
  }
}
