package com.winky.springcloud;

import java.util.HashMap;


/**
 * @auther Li Wenjie
 * @create 2022-01-11 16:38
 */

public class ListTest {
    public static void main(String[] args) {
        int count = 0;
        int num = 2;

        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(0,"8001");
        hashMap.put(1,"8002");
        for (int i = 0; i < 20; i++) {
            int m = count % num;
            System.out.println(hashMap.get(m));
            count++;
        }
    }

}
