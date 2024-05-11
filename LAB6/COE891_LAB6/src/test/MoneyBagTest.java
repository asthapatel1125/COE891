package test;


import junit.framework.TestCase;
import main.IMoney;
import main.Money;
import main.MoneyBag;

public class MoneyBagTest extends TestCase {
    private Money f12CHF;
    private Money f14CHF;
    private Money f7USD;
    private Money f21USD;
    private Money f0USD;
    private Money f5CAD;
    private Money f0CHF;
    private Money f0EUR;
    
    
    private IMoney fMB1;
    private IMoney fMB2;

    public static void main(String args[]) {
        junit.textui.TestRunner.run(MoneyBagTest.class);
    }

    protected void setUp() {
        f12CHF = new Money(12, "CHF");
        f14CHF = new Money(14, "CHF");
        f7USD = new Money(7, "USD");
        f21USD = new Money(21, "USD");
        f0USD = new Money(0, "USD");
        f5CAD = new Money(5, "CAD");
        f0CHF = new Money(0, "CHF");
        f0EUR = new Money(0, "EUR");

        fMB1 = MoneyBag.create(f12CHF, f7USD);
        fMB2 = MoneyBag.create(f14CHF, f21USD);
    }

    protected void tearDown() throws Exception {
        // call toString, guranteed to be only called from here.
        // this is for testing, coverage by test.
        fMB1.toString();
    }

    public void testBagMultiply() {
        // {[12 CHF][7 USD]} *2 == {[24 CHF][14 USD]}
        IMoney expected = MoneyBag.create(new Money(24, "CHF"), new Money(14, "USD"));
        assertEquals(expected, fMB1.multiply(2));
        assertEquals(fMB1, fMB1.multiply(1));
        assertTrue(fMB1.multiply(0).isZero());
    }

    public void testBagNegate() {
        // {[12 CHF][7 USD]} negate == {[-12 CHF][-7 USD]}
        IMoney expected = MoneyBag.create(new Money(-12, "CHF"), new Money(-7, "USD"));
        assertEquals(expected, fMB1.negate());
    }

    public void testBagSimpleAdd() {
        // {[12 CHF][7 USD]} + [14 CHF] == {[26 CHF][7 USD]}
        IMoney expected = MoneyBag.create(new Money(26, "CHF"), new Money(7, "USD"));
        assertEquals(expected, fMB1.add(f14CHF));
    }

    public void testBagSubtract() {
        // {[12 CHF][7 USD]} - {[14 CHF][21 USD] == {[-2 CHF][-14 USD]}
        IMoney expected = MoneyBag.create(new Money(-2, "CHF"), new Money(-14, "USD"));
        assertEquals(expected, fMB1.subtract(fMB2));
    }

    public void testBagSumAdd() {
        // {[12 CHF][7 USD]} + {[14 CHF][21 USD]} == {[26 CHF][28 USD]}
        IMoney expected = MoneyBag.create(new Money(26, "CHF"), new Money(28, "USD"));
        assertEquals(expected, fMB1.add(fMB2));
    }

    public void testIsZero() {
        assertTrue(fMB1.subtract(fMB1).isZero());
        assertTrue(MoneyBag.create(new Money(0, "CHF"), new Money(0, "USD")).isZero());
    }

    public void testMixedSimpleAdd() {
        // [12 CHF] + [7 USD] == {[12 CHF][7 USD]}
        IMoney expected = MoneyBag.create(f12CHF, f7USD);
        assertEquals(expected, f12CHF.add(f7USD));
    }

    public void testBagNotEquals() {
        IMoney bag = MoneyBag.create(f12CHF, f7USD);
        assertFalse(bag.equals(new Money(12, "DEM").add(f7USD)));
    }

    public void testMoneyBagEquals() {
        assertFalse(fMB1.equals(null));
        assertEquals(fMB1, fMB1);
        IMoney equal = MoneyBag.create(new Money(12, "CHF"), new Money(7, "USD"));
        assertTrue(fMB1.equals(equal));
        assertFalse(fMB1.equals(f12CHF));
        assertFalse(f12CHF.equals(fMB1));
        assertFalse(fMB1.equals(fMB2));
    }

    public void testMoneyBagHash() {
        IMoney equal = MoneyBag.create(new Money(12, "CHF"), new Money(7, "USD"));
        assertEquals(fMB1.hashCode(), equal.hashCode());
    }

    public void testMoneyEquals() {
    	assertFalse(f12CHF.equals(null));
        Money equalMoney = new Money(12, "CHF");
        assertEquals(f12CHF, f12CHF);
        assertEquals(f12CHF, equalMoney);
        assertEquals(f12CHF.hashCode(), equalMoney.hashCode());
        assertFalse(f12CHF.equals(f14CHF));
    }

    public void testMoneyHash() {
    	assertFalse(f12CHF.equals(null));
        Money equal = new Money(12, "CHF");
        assertEquals(f12CHF.hashCode(), equal.hashCode());
    }

    public void testSimplify() {
        IMoney money = MoneyBag.create(new Money(26, "CHF"), new Money(28, "CHF"));
        assertEquals(new Money(54, "CHF"), money);
    }

    public void testNormalize2() {
        // {[12 CHF][7 USD]} - [12 CHF] == [7 USD]
        Money expected = new Money(7, "USD");
        assertEquals(expected, fMB1.subtract(f12CHF));
    }

    public void testNormalize3() {
        // {[12 CHF][7 USD]} - {[12 CHF][3 USD]} == [4 USD]
        IMoney ms1 = MoneyBag.create(new Money(12, "CHF"), new Money(3, "USD"));
        Money expected = new Money(4, "USD");
        assertEquals(expected, fMB1.subtract(ms1));
    }

    public void testNormalize4() {
        // [12 CHF] - {[12 CHF][3 USD]} == [-3 USD]
        IMoney ms1 = MoneyBag.create(new Money(12, "CHF"), new Money(3, "USD"));
        Money expected = new Money(-3, "USD");
        assertEquals(expected, f12CHF.subtract(ms1));
    }

    public void testPrint() {
        assertEquals("[12 CHF]", f12CHF.toString());
    }

    public void testSimpleAdd() {
        // [12 CHF] + [14 CHF] == [26 CHF]
        Money expected = new Money(26, "CHF");
        assertEquals(expected, f12CHF.add(f14CHF));
    }

    public void testSimpleBagAdd() {
        // [14 CHF] + {[12 CHF][7 USD]} == {[26 CHF][7 USD]}
        IMoney expected = MoneyBag.create(new Money(26, "CHF"), new Money(7, "USD"));
        assertEquals(expected, f14CHF.add(fMB1));
    }

    public void testSimpleMultiply() {
        // [14 CHF] *2 == [28 CHF]
        Money expected = new Money(28, "CHF");
        assertEquals(expected, f14CHF.multiply(2));
    }

    public void testSimpleNegate() {
        // [14 CHF] negate == [-14 CHF]
        Money expected = new Money(-14, "CHF");
        assertEquals(expected, f14CHF.negate());
    }

    public void testSimpleSubtract() {
        // [14 CHF] - [12 CHF] == [2 CHF]
        Money expected = new Money(2, "CHF");
        assertEquals(expected, f14CHF.subtract(f12CHF));
    }
    
    public void testMoneyBagNotEquals() {
    	IMoney newMoneyBag = MoneyBag.create(new Money(26,"CHF"),new Money(15, "CAD"));
    	assertFalse(newMoneyBag.equals(f5CAD.add(fMB1)));
    }
    
    
    public void testMoneyZero() {
    	assertFalse(f0USD.equals(f5CAD));
    }
    
    public void testMoneyZero1() {
    	IMoney fMB3 = MoneyBag.create(new Money(10,"CAD"), new Money(15,"EUR"));
    	assertFalse(f0USD.equals(fMB3));
    }
    
    public void testMoneyBagZero() {
    	IMoney zeroMoneyBag = MoneyBag.create(f0CHF, f0EUR);
    	assertTrue(zeroMoneyBag.equals(f0CHF));
    }
    

}