package com.xufeifan.test;

/**
 * @author DZRABDemo
 * @version 1.0.0
 * @ClassName TestDemo
 * @Description TODO
 * @createTime 2022年02月22日 10:01:00
 */
@SuppressWarnings(value = "all")
public class TestDemo {
    public static void main(String[] args) {
        Person person1 = new Person("zhangSan",20);
        Person person2 = person1;
        System.out.println(person2.toString());
    }
}

class Person{
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
