package assignmentTests;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertThrows;
import org.junit.Test;
import assignments.Q2Part4;

public class Q2Part4Test {
	
	@Test
	public void test1() throws Exception{
		System.out.println("Test path 1");
		assertThrows(NullPointerException.class, () -> Q2Part4.isPalindrome(null));	
	}

	@Test
	public void test2() {
		System.out.println("Test path 2");
		boolean expected = true;
		boolean actual = Q2Part4.isPalindrome("A");
		assertEquals(expected, actual);
	}
	
	@Test
	public void test3() {
		System.out.println("Test path 3");
		boolean expected = false;
		boolean actual = Q2Part4.isPalindrome("AC");
		assertEquals(expected, actual);
	}
	
	@Test
	public void test4() {
		System.out.println("Test path 4");
		boolean expected = true;
		boolean actual = Q2Part4.isPalindrome("AA");
		assertEquals(expected, actual);
	}
}
