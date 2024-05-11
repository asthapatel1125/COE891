package assignmentTests;
import org.junit.Test;

import assignments.Q4;

import static org.junit.Assert.*;

public class Q4Test {

    @Test
    public void testPrintPrimesWithZero() {
        try {
            Q4.printPrimes(0);
        } catch (Exception e) {
            fail("Unexpected exception: " + e);
        }
    }

    @Test
    public void testPrintPrimesWithOne() {
        try {
            Q4.printPrimes(1);
        } catch (Exception e) {
            fail("Unexpected exception: " + e);
        }
    }

    @Test
    public void testPrintPrimesWithTwo() {
        try {
            Q4.printPrimes(2);
        } catch (Exception e) {
            fail("Unexpected exception: " + e);
        }
    }

    @Test
    public void testPrintPrimesWithThree() {
        try {
            Q4.printPrimes(3);
        } catch (Exception e) {
            fail("Unexpected exception: " + e);
        }
    }
}

