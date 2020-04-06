package com.niit.techno.mockitodemo;


import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;

public class HelloWorldTest {

	IHelloWorld d;

	@Before
	public void setupMock() {
		d = mock(IHelloWorld.class);
		when(d.greet()).thenReturn("Hello World");
	}

	@Test
	public void fooGreets() {
		System.out.println("Demo greet:" + d.greet());
		assertEquals("Hello World", d.greet());
	}

	@Test
	public void barGreets() {
		Bar bar = new Bar();
		assertEquals("Hello World", bar.greet(d));
	}
}