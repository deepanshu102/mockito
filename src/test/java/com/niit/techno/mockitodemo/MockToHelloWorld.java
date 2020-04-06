package com.niit.techno.mockitodemo;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class MockToHelloWorld {
	@Test
	public void demoGreets() {
		IHelloWorld d = mock(IHelloWorld.class);// Create mock IHelloWorld Object
		when(d.greet()).thenReturn("HELLO_WORLD");//Add Behaviour
		System.out.println("Demo greets: " + d.greet());
		assertEquals(d.greet(), "HELLO_WORLD");
	}
}
