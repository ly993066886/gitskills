package springaop.impl;

import org.springframework.stereotype.Service;

import springaop.HelloWorld;
@Service
public class HelloWorldImpl2 implements HelloWorld {

	public void printHelloWorld() {
		System.out.println("Enter HelloWorldImpl2.printHelloWorld()");
	}

	public void doPrint() {
		System.out.println("Enter HelloWorldImpl2.doPrint()");
		return;
	}

}
