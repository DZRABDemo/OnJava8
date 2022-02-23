package com.xufeifan.study.part4_Operator;


import org.junit.Test;

@SuppressWarnings(value = "all")
public class TestOper {
    @Test
    public void info(){
        //这里对操作符进行基础的分析
    }

    /**
     * 算数运算符
     */
    @Test
    public void arithmetic(){
        int num1=100;
        int num2=20;

        System.out.println(num1+num2);
        System.out.println(num1-num2);
        System.out.println(num1*num2);
        System.out.println(num1/num2);
        System.out.println(num1%num2);
        System.out.println(num1<<1);
        System.out.println(num1>>1);
    }

    @Test
    public void relational(){
        System.out.println(2>1);
        System.out.println(2<1);
        System.out.println(1==1);
        System.out.println(1!=1);
    }

    @Test
    public void logic(){
        //这里存在与或非
        boolean flag1 = true;
        boolean flag2 = false;
        System.out.println(flag1&&flag2);
        System.out.println(flag1||flag2);
        System.out.println(!flag1);

        //这里&& 和 &的区别是什么？、

    }

    @Test
    public void testLogic(){
        boolean flag1 = true;
        boolean flag2 = false;

        long start = System.nanoTime();

        for (int i = 0; i < 1000000; i++) {
            while(flag2&flag1){
                //&& 115900
                //& 154100
                //似乎没有什么区别
            }
        }

        long end = System.nanoTime();

        System.out.println(end-start);
    }

    @Test
    public void bitOper(){
        //这里包括与或 异或 取反
        System.out.println(1&1);
        System.out.println(1|0);

        System.out.println(1^1);
        System.out.println(~1);
        //00000001   11111110
    }

    @Test
    public void assign(){

    }

    @Test
    public void testOther(){
        System.out.println(1>0?1:0);
    }
}
