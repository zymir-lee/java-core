package pers.zymir.javacore.operator;

public class ShiftOperator {
  public static void main(String[] args) {

    // 左位移 默认无符号（符号位被移出） 低位补0
    int bit01 = 0b00000001;
    System.out.println(Integer.toBinaryString(bit01 << 2));

    // 右位移 正数 高位补0
    int bit02 = 0b10000000;
    System.out.println(Integer.toBinaryString(bit02 >> 2));


    // 计算机存储负数是补码+1 所以下面的结果需要计算一下才能得到

    // 右位移 负数 高位补1
    int bit03 = -0b100;
    System.out.println(Integer.toBinaryString(bit03 >> 2));

    // 无符号右位移 高位统统补0
    int bit04 = -0b100;
    System.out.println(Integer.toBinaryString(bit04 >>> 2));

    // 无符号右位移正数 高位统统补0
    int bit05 = 0b100;
    System.out.println(Integer.toBinaryString(bit05 >>> 2));

    // 位移操作的保护机制：int超过32位位移没有任何意义（因为int只有32位）
    // 这个结果只会取33的低五位 33 -> 100001 低五位：00001 -> 等同于 bit06 << 1
    int bit06 = 0b00000001;
    System.out.println(Integer.toBinaryString(bit06 << 33)); // 注意 这里是错误的示范!
  }
}