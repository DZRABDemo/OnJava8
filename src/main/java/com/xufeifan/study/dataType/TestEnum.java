package com.xufeifan.study.dataType;

/**
 * @author DZRABDemo
 * @version 1.0.0
 * @ClassName TestEnum
 * @Description TODO
 * @createTime 2022年02月23日 11:29:00
 */
@SuppressWarnings(value = "all")
//public final enum
public enum TestEnum {
    //public static final enum
    ZSAN("张三",20),
    LISI("李四",20);

    private String name;
    private int age;

    TestEnum(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "TestEnum{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
