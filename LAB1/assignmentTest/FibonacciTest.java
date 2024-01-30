package LAB1.assignmentTest;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import LAB1.assignment.Fibonacci;


@RunWith(value = Parameterized.class)
public class FibonacciTest {

	private final int input;
	private final int expected;
	    
	//create constructor
	public FibonacciTest(int input, int expected) 
	{
	   this.input = input;
	   this.expected = expected;
	}

	 //parameters method
	 @Parameters
	  public static Collection<Object[]> data() 
	 {
		  // Define the test cases with input and expected output
		  return Arrays.asList(new Object[][] {
			  		//{input,expected}
	                {0, 0},{1, 1},{2, 1},{3, 2},
	                {4, 3},{5, 5},{6, 8},{7, 13},
	                {8, 21},{9, 34}});
	 }

	  @Test
	  public void testCompute() 
	  {
		  int result = Fibonacci.compute(input);
		  assertEquals(expected, result);
	  }
}

