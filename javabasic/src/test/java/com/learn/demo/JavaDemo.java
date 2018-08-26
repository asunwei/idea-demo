package com.learn.demo;

import java.util.*;

public class JavaDemo {
    public static void main(String[] args) {
        System.out.println("===============================");
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "one");
        map.put(2, "one");
        map.put(3, "one");
        map.put(4, "one");
        map.put(5, "one");
        map.put(6, "one");
        System.out.println(map);

        List<String> list = new ArrayList<String>();
        list.add("one");
        list.add("one");
        list.add("one");
        list.add("two");
        list.add("two");
        list.add("two");
        System.out.println(list);


        Set<String> set = new HashSet<String>();
        set.add("qqqq");
        System.out.println(set);
    }
}
