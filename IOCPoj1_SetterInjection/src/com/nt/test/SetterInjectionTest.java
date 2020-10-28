package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.nt.beans.WishMessageGeneratoer;

public class SetterInjectionTest {

	public static void main(String[] args)throws Exception {
		
		
		System.out.println("SetterInjectionTest.main()");
	
		Resource res=null;
		BeanFactory factory=null;	
		WishMessageGeneratoer generator=null;
	
	    Object obj=null;
	    String result=null;
	    //hold name and location of spring bean cfg file 
	    res=new FileSystemResource("src/com/nt/cfgs/applicationContext.xml");
	    //create BeansFactory IOc Container
	    factory=new XmlBeanFactory(res);
	    //get target bean class object
	    obj=factory.getBean("wmg");
	    //typcasting 
	    generator=(WishMessageGeneratoer)obj;
	    //invoke the method 
	    result=generator.genarateWishMassage("Natraz sir");
      System.out.println("Message::"+result);

	}
	}
