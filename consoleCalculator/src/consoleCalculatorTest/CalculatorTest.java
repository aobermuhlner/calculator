package consoleCalculatorTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import consoleCalculatorMain.Calculator;

public class CalculatorTest
{
    Calculator test;

//addition tests
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
    public void testOneNegativeAdd1() {
        test = new Calculator();
        assertEquals(10, test.addition(20, -10));
    }
    
    @Test
    public void testOneNegativeAdd2() {
        test = new Calculator();
        assertEquals(-10, test.addition(-20, 10));
    }
    
    @Test
    public void testbothNegativesAdd() {
        test = new Calculator();
        assertEquals(-30, test.addition(-20, -10));
    }
    
    @Test(expected=AssertionError.class)
    public void testToBig1Add() {
        test = new Calculator();
        assertEquals(2147483637, test.addition(2147483647, 50));
    }
    
    @Test(expected=AssertionError.class)
    public void testToSmall1Add() {
        test = new Calculator();
        assertEquals(-2147483637, test.addition(-2147483647, -10));
    }
    
    @Test
    public void testOnlyZeroAdd() {
        test = new Calculator();
        assertEquals(0, test.addition(0, 0));
    }
    
  //subtraction tests
    @Test
    public void testSimpleSub1() {
        test = new Calculator();
        assertEquals(10, test.subtraction(20, 10));
    }
    
    @Test
    public void testSimpleSub2() {
        test = new Calculator();
        assertEquals(-10, test.subtraction(10, 20));
    }
    
    @Test
    public void testOneNegativeSub1() {
        test = new Calculator();
        assertEquals(30, test.subtraction(20, -10));
    }
    
    @Test
    public void testOneNegativeSub2() {
        test = new Calculator();
        assertEquals(-30, test.subtraction(-20, 10));
    }
    
    @Test
    public void testbothNegativesSub() {
        test = new Calculator();
        assertEquals(-10, test.subtraction(-20, -10));
    }
    
    @Test(expected=AssertionError.class)
    public void testToBigSub1() {
        test = new Calculator();
        assertEquals(2147483637, test.subtraction(2147483647, -50));
    }
    
    @Test(expected=AssertionError.class)
    public void testToSmallSub1() {
        test = new Calculator();
        assertEquals(-2147483637, test.subtraction(-2147483647, 10));
    }
    
    @Test
    public void testOnlyZeroSub() {
        test = new Calculator();
        assertEquals(0, test.subtraction(0, 0));
    }
}
