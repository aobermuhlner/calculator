package consoleCalculatorTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import consoleCalculatorMain.Calculator;

//addition tests
public class CalculatorTest
{
    Calculator test;
    
    @Test
    public void testSimpleAdd1() {
        test = new Calculator();
        assertEquals(30, test.addition(10, 20));
    }
    
    @Test
    public void testSimpleAdd2() {
        test = new Calculator();
        assertEquals(30, test.addition(20, 10));
    }
    
    @Test
    public void testOneNegative1() {
        test = new Calculator();
        assertEquals(10, test.addition(20, -10));
    }
    
    @Test
    public void testOneNegative2() {
        test = new Calculator();
        assertEquals(-10, test.addition(-20, 10));
    }
    
    @Test
    public void testbothNegatives() {
        test = new Calculator();
        assertEquals(-30, test.addition(-20, -10));
    }
    
    @Test(expected=AssertionError.class)
    public void testToBig1() {
        test = new Calculator();
        assertEquals(2147483637, test.addition(2147483647, 50));
    }
    
    @Test(expected=AssertionError.class)
    public void testToSmall1() {
        test = new Calculator();
        assertEquals(-2147483637, test.addition(-2147483647, -10));
    }
    
    @Test
    public void testOnlyZero() {
        test = new Calculator();
        assertEquals(0, test.addition(0, 0));
    }
}
