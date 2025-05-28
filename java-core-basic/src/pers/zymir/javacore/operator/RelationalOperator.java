package pers.zymir.javacore.operator;

public class RelationalOperator {
  public static void main(String[] args) {

    // 从Java9开始将new创建Integer方式标记为弃用
    @SuppressWarnings("all")
    Integer value10UseNew = new Integer(10);
    Integer value10UseValueOf = Integer.valueOf(10);
    Integer value10UseBoxing = 10;

    // new方式新建了一个Integer对象
    // valueOf 10 是从Integer缓存中拿到的对象
    System.out.println("value10UseNew == value10UseValueOf is：" + (value10UseNew == value10UseValueOf));

    // 自动装箱机制 实际上编译为了valueOf方法 所以与上面的结果相同 都是false
    System.out.println("value10UseNew == value10UseBoxing is：" + (value10UseNew == value10UseBoxing));

    // 都是从缓存里面拿到的对象 所以返回true
    System.out.println("value10UseValueOf == value10UseBoxing is：" + (value10UseValueOf == value10UseBoxing));

    // 从Java9开始将new创建Integer方式标记为弃用
    @SuppressWarnings("all")
    Integer value128UseNew = new Integer(128);
    Integer value128UseValueOf = Integer.valueOf(128);
    Integer value128UseBoxing = 128;

    // new方式新建了一个Integer对象
    // valueOf 128 超过了缓存的范围 所以新建了一个对象
    System.out.println("value128UseNew == value128UseValueOf is：" + (value128UseNew == value128UseValueOf));

    // 自动装箱机制 实际上编译为了valueOf方法 所以与上面的结果相同 都是false
    System.out.println("value128UseNew == value128UseBoxing is：" + (value128UseNew == value128UseBoxing));

    // 虽然实际上都是调用了valueOf方法创建的Integer对象，但是128已经超过了缓存的范围 所以返回false
    System.out.println("value128UseValueOf == value128UseBoxing is：" + (value128UseValueOf == value128UseBoxing));
  }
}