package com.test;

import java.util.ArrayList;
import java.util.List;

public class minMax {
    public static void main(String[] args) {
        List<String> timePoints = new ArrayList();
        timePoints.add("23:59");
        timePoints.add("00:00");
        ArrayList<Integer> timeInt = new ArrayList<>();

        for (int i = 0; i < timePoints.size(); i++) {
            String o = timePoints.get(i);
            String substring = o.substring(0, 2);
            Integer integer1 = Integer.valueOf(substring);
            int intRes = integer1 * 60;
            String substring2 = o.substring(3, 5);
            Integer integer2 = Integer.valueOf(substring2);
            int res = intRes + integer2;
            timeInt.add(res);
            timeInt.add(res + 1440);
        }

        int diff = 1440;
        for (int i = 0; i < timeInt.size(); i++) {
            for (int j = i + 1; j < timeInt.size(); j++) {
                int cou = Math.abs(timeInt.get(i) - timeInt.get(j));
                if(cou<diff){
                    diff = cou;
                }
            }
        }
        System.out.println(diff);

    }
}
