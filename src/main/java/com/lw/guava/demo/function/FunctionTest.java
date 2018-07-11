package com.lw.guava.demo.function;

import com.google.common.base.Function;
import com.google.common.base.Functions;
import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Set;

public class FunctionTest {

    public static void main(String[] args) {
        // 组合函数
        //composeFun();

        // Guava 过滤器
        //filter();
        // Guava 函数
        functionApp();
    }

    private static void composeFun() {
        //组合式函数编程
        //确保容器中的字符串长度不超过5，超过进行截取，后全部大写
        List<String> list = Lists.newArrayList("bjsxt","good","happiness");

        //功能1：确保容器中的字符串长度不超过5，超过进行截取
        Function<String,String> f1 =new Function<String,String>(){

            @Override
            public String apply(String input) {
                return input.length()>5?input.substring(0,5):input;
            }

        };
        //功能2：转成大写
        Function<String,String> f2 =new Function<String,String>(){

            @Override
            public String apply(String input) {
                return input.toUpperCase();
            }

        };

        //String =f2(f1(String))   组合上面定义的两个功能
        Function<String,String> f = Functions.compose(f1, f2);
        Collection<String> resultCol = Collections2.transform(list, f);

        for(String temp:resultCol){
            System.out.println(temp);
        }

    }
    /**
     * 函数 使用Guava Function 函数
     * 转换
     */
    public static void functionApp(){
        //类型转换
        Set<Long> timeSet = Sets.newHashSet();
        timeSet.add(10000000L);
        timeSet.add(99999999999L);
        timeSet.add(333311L);

        Collection<String> timeStrCol =Collections2.transform(timeSet, new Function<Long,String>(){

            @Override
            public String apply(Long input) {
                Date date = new Date(input);
                return new SimpleDateFormat("yyyy-MM-dd").format(date);
            }});

        for(String temp:timeStrCol){
            System.out.println(temp);
        }

    }
    /**
     * 过滤器 使用Guava Predicate 断言
     * 此案例中， 过滤数组中 字符串为回文的集合 并打印输出这些单词
     * 结果：
     *  moom
     dad
     refer
     */
    public static void filter(){
        //创建List 静态初始化
        List<String> list =Lists.newArrayList("moom","son","dad","bjsxt","refer");
        //找出回文 palindrome  backwords  mirror words
        // Predicate 表示断言的意思
        //匿名内部类对象: 匿名内部类，同时创建类对象
        Collection<String> palindromeList =Collections2.filter(list, new Predicate<String>(){

            @Override
            public boolean apply(String input) {
                //业务逻辑
                return new StringBuilder(input).reverse().toString().equals(input);
            }

        });

        for(String temp:palindromeList){
            System.out.println(temp);
        }
    }
}
