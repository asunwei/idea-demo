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
        list.add("one");
        list.add("one");
        list.add("one");
        list.add("two");
        list.add("two");
        list.add("two");
        System.out.println(list);

        List<String> list3 = new ArrayList<String>();
        list3.add("one");
        list3.add("one");
        list3.add("one");
        list3.add("two");
        list3.add("two");
        list3.add("two");
        list3.add("1");
        list3.add("1");
        list3.add("1");
        list3.add("1");
        list3.add("2");
        list3.add("3");
        System.out.println(list3);

        Set<String> set = new HashSet<String>();
        set.add("qaaaq");
        System.out.println(set);
<<<<<<< HEAD

        System.out.println("111");
=======
        System.out.println("finish");
>>>>>>> demo-20180906
    }
}
