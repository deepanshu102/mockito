package com.niit.techno.mockitodemo;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class MockToHelloWorld {
	@Test
	public void demoGreets() {
		IHelloWorld d = mock(IHelloWorld.class);
		when(d.greet()).thenReturn("HELLO_WORLD");
		System.out.println("Demo greets: " + d.greet());
		assertEquals(d.greet(), "HELLO_WORLD");
	}
}
