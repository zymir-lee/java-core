package pers.zymir.javacore.operator;

public class CastOperator {
  public static void main(String[] args) {

    // 自动转换 不会丢失信息
    int valueInt = 2;
    float valueIntToFloat = valueInt;
    System.out.println(valueIntToFloat);

    // 可能会丢失信息 必须强制转换 进行舍入操作
    float valueF = 3.14F;
    int valueFloatToInt = (int) valueF;
    System.out.println(valueFloatToInt);

    // 可能会丢失信息 必须强制转换 进行截尾操作
    int value256Int = 256;
    byte valueInt256ToByte = (byte) value256Int;
    System.out.println(valueInt256ToByte);
  }
}
