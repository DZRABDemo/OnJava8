package com.xufeifan.study.dataType;

import org.junit.Test;

/**
 * @author DZRABDemo
 * @version 1.0.0
 * @ClassName TestDemo
 * @Description TODO
 * @createTime 2022年02月23日 11:31:00
 */
public class TestDemo {
    @Test
    public void testEnum(){
        //System.out.println(TestEnum.ZSAN);
        //System.out.println(TestEnum.LISI);

        TestEnum[] values = TestEnum.values();
        for (TestEnum testEnum:
             values) {
            System.out.println(testEnum);
        }

        //TestEnum.valueOf("");
    }
}
