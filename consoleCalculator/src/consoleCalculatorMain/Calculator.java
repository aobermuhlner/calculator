package consoleCalculatorMain;
import java.lang.*;

public class Calculator
{
    public int addition(int firstNumber, int secondNumber) {
        int result = Integer.sum(firstNumber, secondNumber);
        checkSizeToLong(result);
        return result;
    }
    
    public int subtraction(int firstNumber, int secondNumber) {
        long result = (long) firstNumber - (long) secondNumber;
        checkSizeToShort(result);
        return (int) result;
    }
    
    public int division(int firstNumber, int secondNumber) {
        long result = (long) firstNumber / (long) secondNumber;
        return (int) result;
    }
    
    public int multiplication(int firstNumber, int secondNumber) {
        long result = (long) firstNumber * (long) secondNumber;
        checkSizeToLong(result);
        return (int) result;
    }
    
    private void checkSizeToLong(long number) {
        if ( number > Integer.MAX_VALUE)
            throw new ArithmeticException("Result too big");
    }
    private void checkSizeToShort(long number) {
        if (number < Integer.MIN_VALUE)
            throw new ArithmeticException("Result too small");
    }
}
