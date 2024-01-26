package test;

import main.Greeting;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class GreetingTest {
	Greeting  g;
	
	//runs before each @Test method
	@Before
	public void init()
	{g = new Greeting();}
	
	@Test
	public void testSayHello(){
		assertEquals("Hello", g.sayHello());
	}

}
