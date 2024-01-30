package LAB1.assignmentTest;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import LAB1.assignment.Fibonacci;

@RunWith(Theories.class)
public class Q8_5 {

	private Fibonacci fib;
	
	@Before
	public void init()
	{
		this.fib = new Fibonacci();
	}
	
	@DataPoints
	public static int[][] dataValsFibonacci()
	{
		return new int[][] {{0, 0},{1, 1},{2, 1},{3, 2},
            {4, 3},{5, 5},{6, 8},{7, 13},
            {8, 21},{9, 34}};
	}
	
	@Theory
	public void testFibonacci(int[] input)
	{
		//theories are tested to be true or false
		assertTrue(fib.compute(input[0]) == input[1]);
	}
	

}
