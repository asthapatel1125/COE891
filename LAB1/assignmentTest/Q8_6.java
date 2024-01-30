package LAB1.assignmentTest;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import LAB1.assignment.PrimeNumberChecker;

@RunWith(Theories.class)
public class Q8_6 {

	
	private PrimeNumberChecker primeNum;
	
	@Before
	public void init()
	{
		this.primeNum = new PrimeNumberChecker();
	}
	
	@DataPoints
	public static Object[][] primeNumInputs()
	{
		return new Object[][] {{2, true}, {6, false}, {19 , true},
            {22,false}, {23 , true}};
	}
	
	@Theory
	public void test1(Object[] input)
	{
		assertTrue(primeNum.isPrime((int)input[0]) == (boolean)input[1]);
	}
}

