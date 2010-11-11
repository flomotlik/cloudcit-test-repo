package com.leanvienna.testproject;

import junit.framework.Assert;

import org.junit.Test;

public class HelloWorldTest {

	@Test
	public void testHelloWorld() {
		HelloWorld world = new HelloWorld();
		Assert.assertEquals("Hello World", world.helloWorld());
	}
}
