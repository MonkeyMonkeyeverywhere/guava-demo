package com.lw.guava.demo;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;

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
		Map<String,Map<String,List<String>>> map = Maps.newHashMap();

	}

}
