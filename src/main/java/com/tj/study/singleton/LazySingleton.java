package com.tj.study.singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LazySingleton {
    private static volatile LazySingleton instance=null;
    private final  static Logger log=LoggerFactory.getLogger(LazySingleton.class);
    
    private LazySingleton(){
    	log.info("单例对象被创建了");
    }
    public static synchronized LazySingleton getInstance(){
    	if(instance==null){
    		instance =new LazySingleton();
    	}
    	log.info("单例对象被获取了");
    	return instance;
    }
}
