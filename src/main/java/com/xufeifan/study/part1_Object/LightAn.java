package com.xufeifan.study.part1_Object;

public class LightAn {
    public void on(){
        System.out.println("light on");
    }

    public void off(){
        System.out.println("light off");
    }

    public static void main(String[] args) {
        LightAn lightAn = new LightAn();
        lightAn.off();
        lightAn.on();
        //完成了开灯和关灯的动作
    }
}
