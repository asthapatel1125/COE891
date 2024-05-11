package test;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;
import main.Money;
import main.MoneyBag;
import main.IMoney;
/**
 * This is a trivial test which only tests the Money class.
 * If you modify the MoneyBag class, and run Clover with optimization, this test will not be run.
 */
public class MoneyTest extends TestCase {
    
    @Before
    public void testAdd() throws InterruptedException {
        Money tenEuro = new Money(10, "EURO");
        assertEquals(10, tenEuro.amount());
        assertEquals("EURO", tenEuro.currency());
        System.out.println("Tests taking too long? Try Clover's test optimization.");
        Thread.sleep(3000);
    }
    
}