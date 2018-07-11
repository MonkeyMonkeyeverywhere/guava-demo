package com.lw.guava.demo;

import com.google.common.collect.Sets;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Objects;
import java.util.Optional;
import java.util.Set;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GuavaDemoApplicationTests {

	@Test
	public void testOption() {
//		Integer a = new Integer(12);
//		Integer b = null;
		Optional<Integer> a = Optional.of(null);
		Optional<Integer> b = Optional.of(new Integer(12));
		System.out.println(sum(a,b));
	}

	public Integer sum(Optional<Integer> a,Optional<Integer> b){
		return a.get()+b.get();
	}

	public Integer sum(Integer a,Integer b){
		return a+b;
	}

	@Test
	public void testUnion(){
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
