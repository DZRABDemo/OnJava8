package com.xufeifan.study.dataType;

/**
 * @author DZRABDemo
 * @version 1.0.0
 * @ClassName TestInterface
 * @Description TODO
 * @createTime 2022年02月23日 11:23:00
 */
//public interface abstract
public interface TestInterface {
    void show();

    int age = 0;
    //public static final

    //public
    default void showDefault(){
        System.out.println("this is show default");
    }

    //public static
    static void showStatic(){
        System.out.println("this is static method");
    }
}
