package com.lw.guava.demo.multimap;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

import java.util.*;

public class multimapTest {
    public static void main(String[] args) {
        Map<String,String> cours =new HashMap<String,String>();
        //加入测试数据
        cours.put("改革开放", "邓爷爷");
        cours.put("三个代表", "老江");
        cours.put("科学发展观", "老胡");
        cours.put("和谐社会", "老胡");
        cours.put("八荣八耻", "老胡");
        cours.put("....", "老习");

        //Multimap
        Multimap<String,String> teachers = ArrayListMultimap.create();

        //迭代器
        Iterator<Map.Entry<String,String>> it =cours.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<String,String> entry =it.next();
            String key =entry.getKey(); //课程
            String value =entry.getValue(); //教师

            //教师 -->课程
            teachers.put(value, key);
        }


        //查看Multimap
        Set<String> keyset =teachers.keySet();
        for(String key:keyset){
            Collection<String> col =teachers.get(key);
            System.out.println(key+"-->"+col);
        }


    }
}
