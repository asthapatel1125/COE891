package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.TriClass;

public class TriClassTest {

	@Before
	public void setUp(){
		System.out.println("Testing Started");
	}

	@After
	public void tearDown(){
		System.out.println("Testing Finished");
	}

	@Test
	public void testEquilateral() {
		System.out.println("Test 1 started");
		assertEquals("Equilateral", TriClass.classify(5,5,5));
		System.out.println("Test 1 finished");
	}
	
	@Test
	public void testIsoceles()
	{
		System.out.println("Test 2 started");
		assertEquals("Isoceles", TriClass.classify(5,5,7));
		System.out.println("Test 2 finished");
	}
	
	@Test
	public void testScalene()
	{
		System.out.println("Test 3 started");
		assertEquals("Scalene", TriClass.classify(7,5,6));
		System.out.println("Test 3 finished");
	}
	
	@Test
	public void testInvalidTri()
	{
		System.out.println("Test 4 started");
		assertEquals("Invalid", TriClass.classify(-5,-5,3));
		assertEquals("Invalid", TriClass.classify(1,2,-3));
		System.out.println("Test 4 finished");	
	}

}
