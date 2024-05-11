package test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import main.Function;

public class FunctionTest {

	Function func;
	
	@Before
	public void init()
	{
		this.func = new Function();
	}
	
	@Test
	public void testFunc1() {
		assertEquals(1, func.func(2,3));//b>a : b = b - a = 3 - 2 = 1
	}

	@Test
	public void testFunc2() {
		assertEquals(1, func.func(3,2));//a>b : b = a - b = 3 - 2 = 1
	}
	
	@Test
	public void testFunc3() {
		assertEquals(0, func.func(2,2)); //b-a == a-b
	}
}
