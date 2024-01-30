package LAB1.assignmentTest;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import LAB1.assignment.RE;

public class RETest {
	
	private RE test;

	@Before
	public void init()
	{
		this.test = new RE();
	}
	
	@Test
	public void test1() 
	{
		assertTrue(test.checkPhoneNumber("(123)123 - 1234"));
	}
	
	@Test
	public void test2()
	{
		assertTrue(test.checkPhoneNumber("(123) 123 - 1234"));
	}
	
	@Test
	public void test3()
	{
		//should fail test since parenthesis are required
		assertFalse(test.checkPhoneNumber("123 123 - 1234"));
	}

}
