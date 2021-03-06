package com.flyonsky.snowflake;

import org.junit.Test;

/**
 * @author luowengang
 * @date 2020/8/9 9:47
 */
public class SnowFlakeTest {

    @Test
    public void testNextId(){
        SnowFlake snowFlake = new SnowFlake(2, 3);

        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            System.out.println(snowFlake.nextId());
        }

        System.out.println(System.currentTimeMillis() - start);
    }
}
