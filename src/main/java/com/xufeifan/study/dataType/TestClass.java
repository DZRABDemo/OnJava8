package com.xufeifan.study.dataType;

/**
 * @author DZRABDemo
 * @version 1.0.0
 * @ClassName TestClass
 * @Description TODO
 * @createTime 2022年02月23日 11:12:00
 */
@SuppressWarnings(value = "all")
public class TestClass {

    public static void main(String[] args) {
        TestClass testClass = new TestClass();
        Class<? extends TestClass> aClass = testClass.getClass();
        System.out.println(aClass.getTypeName());
        System.out.println(aClass.getName());
        System.out.println(aClass.getSigners());
        //访问标志public
    }
}

class TestFinal{
    //final 只能被赋值一次
    final int age;

    public TestFinal(){
        age = 10;
    }
}
