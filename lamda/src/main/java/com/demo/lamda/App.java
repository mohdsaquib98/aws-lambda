package com.demo.lamda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

/**
 * Hello world!
 *
 */
public class App implements RequestHandler<Object,Object>
{
  
	@Override
	public Object handleRequest(Object input, Context context) {
		System.out.println("Hello World");
		return null;
	}
}
 