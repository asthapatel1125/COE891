package LAB1.assignmentTest;

import LAB1.assignment.Triangle;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.Assert;

public class TriangleTest {
	private Triangle t1,t2,t3, t4, t5;
	
	@Before 
	public void init()
	{
		this.t1 = new Triangle(3,4,5);
		this.t2 = new Triangle(5,4,3);
		this.t3 = new Triangle(8,5,5);
		this.t4 = new Triangle(8, -5, -5);
		this.t5 = new Triangle(3,4,100);
	}
	
	//After debugging. Heron's formula corrected
	@Test
	public void testCalculateAreaT1() {
		double s = (3+4+5)*0.5;
		double t1Expected = Math.sqrt(Math.sqrt(s * (s - 3) * (s - 4) * (s - 5)));
		assertEquals(t1Expected,t1.calculateArea(),0.0001);
	}
	
	@Test
	public void testCalculateAreaT2() {
		double s = (5+4+3)*0.5;
		double t2Expected = Math.sqrt(Math.sqrt(s * (s - 5) * (s - 4) * (s - 3)));
		assertEquals(t2Expected,t2.calculateArea(),0.0001);

	}
	
	@Test
	public void testCalculateAreaT3() {
		double s = (8+5+5)*0.5;
		double t3Expected = Math.sqrt(Math.sqrt(s * (s - 8) * (s - 5) * (s - 5)));
		assertEquals(t3Expected,t3.calculateArea(),0.0001);

	}
	
	//test method for if area of t1 == area of t2
	@Test
	public void testTriEqual()
	{
		double areaOfT1 = t1.calculateArea();
		double areaOfT2 = t2.calculateArea();
		
		assertTrue(areaOfT1 == areaOfT2);
	}
	
	//negative test case
	//ERROR: throw an exception in the original method  or negative values.
	//then add a throws exception for this method , it should throw an exception and the test
	//should not succeed.
	@Test
	public void testNeg()
	{
		double s = (8+ (-5) + (-5))*0.5;
		double t4Expected = Math.sqrt(Math.sqrt(s * (s - 8) * (s - (-5)) * (s - (-5))));
		assertEquals(t4Expected, t4.calculateArea(), 0.0001);
	}
	
	//traingle with sides (3,4,100)
	/*@Test
	public void testTriT5()
	{
		double s = (8+ (-5) + (-5))*0.5;
		double t5Expected = Math.sqrt(Math.sqrt(s * (s - 3) * (s - 4) * (s - 100)));
		assertEquals(t5Expected, t5.calculateArea(),0.0001);
	}*/
	
	//NaN(Not a Number) as a result
	//Before debugging
	/*@Test
	public void testCalculateAreaT1() {
		double s = (3+4+5)*0.5;
		double t1Expected = Math.sqrt(Math.sqrt(s * (s - 3) * (s - 4) * (s - 5)));
		Assert.assertEquals(t1Expected,t1.calculateArea(),0.0001);
	}
	
	@Test
	public void testCalculateAreaT2() {
		double s = (5+4+3)*0.5;
		double t2Expected = Math.sqrt(Math.sqrt(s * (s - 5) * (s - 4) * (s - 3)));
		Assert.assertEquals(t2Expected,t2.calculateArea(),0.0001);

	}
	
	@Test
	public void testCalculateAreaT3() {
		double s = (8+5+5)*0.5;
		double t3Expected = Math.sqrt(Math.sqrt(s * (s - 8) * (s - 5) * (s - 5)));
		Assert.assertEquals(t3Expected,t3.calculateArea(),0.0001);

	}*/

}
