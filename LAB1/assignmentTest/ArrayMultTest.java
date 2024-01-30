package LAB1.assignmentTest;


import LAB1.assignment.ArrayMult;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import org.junit.Assert;


public class ArrayMultTest {

	private ArrayMult arrMult;//Initialize the instance variable
    @Before
    public void init() {
        this.arrMult = new ArrayMult(); //create object
    }
	
	@Test
	public void testMult() {
		
		int[] testArr1 = {1,2,3,4};
		int[] testArr2 = {5,6,7,8,9};
		int[] testArr3 = {4,3,2,1,0};
		int[] expected1 = {5,12,21,32,9};//testArr1.length > testArr2.length
		int[] expected2 = {1,4,9,16};//testArr1.length == testArr1.length
		int[] expected3 = {4,6,6,4,0};//testArr3.length > testArr1.length
		
		assertArrayEquals(expected3, arrMult.mult(testArr3, testArr1));//testArr3.length < testArr1.length
		assertArrayEquals(expected1, arrMult.mult(testArr1, testArr2)); //testArr1.length < testArr2.length
		assertArrayEquals(expected2, arrMult.mult(testArr1, testArr1));//testArr1.length == testArr1.length
	}

}

