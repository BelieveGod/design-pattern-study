package com.tj.study.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class XmlUtils {
	public static void readXml() throws IOException{
		byte[] buf=new byte[1024];
		int line=0;
		String text=null;
		try(InputStream in=XmlUtils.class.getClassLoader().getResourceAsStream("config/class.xml");
	        InputStreamReader reader=new InputStreamReader(in);
	        BufferedReader bufferedReader=new BufferedReader(reader);){
			while((text=bufferedReader.readLine())!=null){
				System.out.println(++line+":"+text);
			}
		}
	    
	    
	}

	public static String resolveXml() throws DocumentException{
		 URL url = XmlUtils.class.getClassLoader().getResource("");
//		 System.out.println("url:"+url.toString());
		 String path = url.getPath();
//		 System.out.println("path:"+path);
		 String file = url.getFile();
//		 System.out.println("file:"+file);
		 String[] split = System.getProperty("java.class.path").split(";");
		 //1.创建Reader对象
	        SAXReader reader = new SAXReader();
	        //2.加载xml
	        Document document = reader.read(new File(path+"config/class.xml"));
	        Element rootElement = document.getRootElement();
//	        Iterator iterator = rootElement.elementIterator();
	        List elements = rootElement.elements();
	        Element element=(Element) elements.get(0);
	        String stringValue = element.getStringValue();
	        System.out.println(stringValue);
	        
	        return stringValue;
	}
}
