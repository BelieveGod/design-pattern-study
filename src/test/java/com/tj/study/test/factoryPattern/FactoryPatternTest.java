package com.tj.study.test.factoryPattern;

import java.io.IOException;

import org.dom4j.DocumentException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.test.context.junit4.SpringRunner;

import com.tj.study.factoryPattern.AbstractFactory;
import com.tj.study.factoryPattern.KeyboardFactory;
import com.tj.study.factoryPattern.Product;
import com.tj.study.util.XmlUtils;

@RunWith(JUnit4.class)
public class FactoryPatternTest {
	@Test
	public void testProduce() throws IOException, DocumentException, InstantiationException, IllegalAccessException, ClassNotFoundException{
		// 这里new一个工厂是可以用反射读取配置文件来解耦，但是个人觉得这样可能误导了工厂模式的目的所以不这样写了
		
		String cName=XmlUtils.resolveXml();
		Class<?> c=Class.forName(cName);
		AbstractFactory factory=(AbstractFactory) c.newInstance();
		
//		AbstractFactory factory=new KeyboardFactory();
		Product product=factory.produce();
		product.work();
		
	}
}
