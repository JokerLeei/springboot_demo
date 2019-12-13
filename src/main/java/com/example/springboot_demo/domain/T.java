package com.example.springboot_demo.domain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class T {
    public static void main(String[] args) {
        List<Integer> list =new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            Integer i = it.next();
            System.out.println(i);
        }

        System.out.println(list);
    }
}
