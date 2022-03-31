package com.tcs.service;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldImpl implements HelloWorld{

  public String printHelloWorld(String msg) {
	  System.out.println("hello :" + msg);
	  return "hello" + msg;
  }

}
