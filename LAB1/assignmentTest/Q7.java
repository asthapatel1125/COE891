package LAB1.assignmentTest;

import static org.junit.Assert.*;
import org.junit.Assume;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;
import org.junit.Test;


@RunWith(Theories.class)
public class Q7 {

	/*
	@DataPoints
	//provide data points for the test
	public static int[] dataPoints1()
	{
		return new int[]{1,2,307,400567};
	}*/
	
	/*
	@DataPoints
	//tests should fail for both theory1 and theory2 without ASSUMPTION 
	public static int[] dataPoints2()
	{
		return new int[]{0, -1, -10, -1234, 1, 10, 6789};
	}*/

	
	/*
	@Theory
	public void theroy1(int a, int b)
	{
		assertTrue(a + b > a);
		assertTrue(a + b > b);
	}
	
	
	@Theory
	public void theory2(int a, int b)
	{
		assertTrue(a + b == b + a);
	}*/
	
	
	
	@DataPoints
	public static int[] dataPoints3()
	{
		return new int[]{0, -1, -10, -1234, 1, 10, 6789, Integer.MAX_VALUE, Integer.MIN_VALUE};
	}
	
	@Theory
	public void theory1(int a, int b)
	{
		Assume.assumeTrue( a > 0 && b > 0);
		assertTrue(a + b > a);
		assertTrue(a + b > b);
	}
	
	@Theory
	public void theory2(int a, int b)
	{
		assertTrue(a + b == b + a);
	}
}
