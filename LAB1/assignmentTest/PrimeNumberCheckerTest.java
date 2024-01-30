package LAB1.assignmentTest;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import LAB1.assignment.PrimeNumberChecker;


@RunWith(value = Parameterized.class)
public class PrimeNumberCheckerTest {

	private PrimeNumberChecker primeNum;
	private int input;
	private boolean expected;
	
	public PrimeNumberCheckerTest(int input, boolean expected)
	{
		this.input = input;
		this.expected = expected;
	}
	
	@Parameters
	 public static Collection<Object[]> data() 
	 {
		  // Define the test cases with input and expected output
		  return Arrays.asList(new Object[][] {
			  		//{input,expected}
	                {2, true}, {6, false}, {19 , true},
	                {22,false}, {23 , true}});
	 }
	
	@Before
	public void init()
	{
		this.primeNum = new PrimeNumberChecker();
	}
	
	@Test
	public void testIsPrime() {
		
		boolean result = primeNum.isPrime(input);
		assertEquals(expected,result);	
	}
}

