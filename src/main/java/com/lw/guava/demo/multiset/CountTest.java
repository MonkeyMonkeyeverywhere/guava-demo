package com.lw.guava.demo.multiset;

import com.google.common.collect.HashMultiset;

import java.util.Set;

public class CountTest {
    public static void main(String[] args) {
        String str ="this is a cat and that is a mice where is the food";
        //分割字符串  
        String[] strArray =str.split(" ");
        HashMultiset<String> sets = HashMultiset.create();
        for (String s : strArray){
            sets.add(s);
        }
        Set<String> set = sets.elementSet();
        set.forEach(s -> System.out.println(s+"--->"+sets.count(s)));
    }
}
