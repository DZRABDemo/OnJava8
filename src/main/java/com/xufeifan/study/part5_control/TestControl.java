package com.xufeifan.study.part5_control;

import org.junit.Test;

@SuppressWarnings(value = "all")
public class TestControl {
    @Test
    public void testIf(){
        if(1>0){
            System.out.println("true");
        }
    }

    @Test
    public void testWhile(){
        while(true){
            System.out.println("while");
        }
    }

    @Test
    public void testSwitch(){
        int num = 1;

        switch (num){
            case 1:
                System.out.println("1");
                //break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            default:
                System.out.println("default;");
                break;
        }
    }
}
