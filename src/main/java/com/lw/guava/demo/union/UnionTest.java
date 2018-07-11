package com.lw.guava.demo.union;

import com.google.common.collect.Sets;

import java.util.Set;

public class UnionTest {
    public static void main(String[] args) {
        Set<String> set1 = Sets.newHashSet("张三","李四","王五","赵柳");
        Set<String> set2 = Sets.newHashSet("赵四","王五","张三","刘二");
        System.out.println("差集为:");
        Sets.SetView<String> difference = Sets.difference(set1, set2);
        difference.forEach(s -> System.out.println(s));
        System.out.println("交集为:");
        Sets.SetView<String> intersection = Sets.intersection(set1, set2);
        intersection.forEach(s -> System.out.println(s));
        System.out.println("并集为:");
        Sets.SetView<String> union = Sets.union(set1, set2);
        union.forEach(s -> System.out.println(s));
    }
}
