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
        assertEquals(Integer.MAX_VALUE, test.addition(Integer.MAX_VALUE, 50));
    }
    
    @Test(expected=AssertionError.class)
    public void testToSmall1Add() {
        test = new Calculator();
        assertEquals(Integer.MIN_VALUE, test.addition(Integer.MIN_VALUE, -10));
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
    public void testToBigSub() {
        test = new Calculator();
        assertEquals(2147483637, test.subtraction(Integer.MAX_VALUE, -50));
    }
    
    @Test(expected=AssertionError.class)
    public void testToSmallSub() {
        test = new Calculator();
        assertEquals(Integer.MIN_VALUE-10, test.subtraction(Integer.MIN_VALUE, 10));
    }
    
    @Test
    public void testOnlyZeroSub() {
        test = new Calculator();
        assertEquals(0, test.subtraction(0, 0));
    }
    
  //division tests
    @Test
    public void testSimplediv1() {
        test = new Calculator();
        assertEquals(10, test.division(30, 3));
    }
    
    @Test
    public void testSimplediv2() {
        test = new Calculator();
        assertEquals(6, test.division(62, 10));
    }
    
    @Test
    public void testSimplediv3() {
        test = new Calculator();
        assertEquals(0, test.division(6, 10));
    }
    
    @Test(expected=ArithmeticException.class)
    public void testDividebyZero() {
        test = new Calculator();
        assertEquals(0, test.division(10, 0));
    }
    
    @Test
    public void testDividebyNegative() {
        test = new Calculator();
        assertEquals(-4, test.division(20, -5));
    }
    
    @Test
    public void testNegDividedByPos() {
        test = new Calculator();
        assertEquals(-4, test.division(-20, 5));
    }
    
    @Test
    public void testDivNegWithNeg() {
        test = new Calculator();
        assertEquals(4, test.division(-20, -5));
    }
    
    @Test(expected=ArithmeticException.class)
    public void testDivideZeroByZero() {
        test = new Calculator();
        assertEquals(0, test.division(0, 0));
    }
    
    //multiplication tests
    

    @Test
    public void testSimpleMul1() {
        test = new Calculator();
        assertEquals(30, test.multiplication(10, 3));
    }
    
    @Test
    public void testSimpleMul2() {
        test = new Calculator();
        assertEquals(30, test.multiplication(3, 10));
    }
    
    @Test
    public void testMulByZero() {
        test = new Calculator();
        assertEquals(0, test.multiplication(10, 0));
    }
    
    @Test
    public void testMulOneNegative() {
        test = new Calculator();
        assertEquals(-200, test.multiplication(10, -20));
    }
    
    @Test
    public void testMulTwoNegatives() {
        test = new Calculator();
        assertEquals(200, test.multiplication(-10, -20));
    }

    @Test(expected=AssertionError.class)
    public void testToBigMul() {
        test = new Calculator();
        assertEquals(2*Integer.MAX_VALUE, test.subtraction(Integer.MAX_VALUE, 2));
    }

    @Test(expected=AssertionError.class)
    public void testToSmallMul() {
        test = new Calculator();
        assertEquals(2*Integer.MIN_VALUE, test.subtraction(-Integer.MIN_VALUE, 2));
    }

    @Test
    public void testmultiplyTwoZeroes() {
        test = new Calculator();
        assertEquals(0, test.subtraction(0, 0));
    }
    
  
}








