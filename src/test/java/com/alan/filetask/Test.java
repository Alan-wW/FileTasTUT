package com.alan.filetask;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        for (Integer integer : list) {
            if(integer % 2 == 0){
                list.remove(integer);
            }
        }
        System.out.println(list);
    }
}
