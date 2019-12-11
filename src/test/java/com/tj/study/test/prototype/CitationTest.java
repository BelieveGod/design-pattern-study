package com.tj.study.test.prototype;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import com.tj.study.prototype.Citation;

@RunWith(SpringRunner.class)
public class CitationTest {

	@Test
	public void testClone(){
		Citation citation=new Citation("小李", "获得三好学生", "网络学院");
		Citation citation2=(Citation)citation.clone();
		citation2.setName("小张");
		System.out.println(citation.toString());
		System.out.println(citation2.toString());
	}
}
