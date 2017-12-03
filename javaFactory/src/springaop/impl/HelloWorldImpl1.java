package springaop.impl;

import org.springframework.stereotype.Service;

import springaop.HelloWorld;
@Service
public class HelloWorldImpl1 implements HelloWorld {

	public void printHelloWorld() {
		System.out.println("Enter HelloWorldImpl1.printHelloWorld()");
	}

	public void doPrint() {
		System.out.println("Enter HelloWorldImpl1.doPrint()");
		return;
	}
}
