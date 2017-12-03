package springaop.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springaop.impl.HelloWorldImpl1;
import springaop.impl.HelloWorldImpl2;

public class MainStart {
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:aop.xml");
		HelloWorldImpl1 h1 = (HelloWorldImpl1) applicationContext.getBean("helloWorldImpl1");
		HelloWorldImpl2 h2 = (HelloWorldImpl2) applicationContext.getBean("helloWorldImpl2");
		h1.printHelloWorld();
		System.out.println();
		h1.doPrint();
		
		System.out.println();
		
		h2.printHelloWorld();
		System.out.println();
		h2.doPrint();
	
	}
}
