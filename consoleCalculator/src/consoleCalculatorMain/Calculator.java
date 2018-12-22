package consoleCalculatorMain;
import java.lang.*;

public class Calculator
{
    public int addition(int firstNumber, int secondNumber) {
        int result = Integer.sum(firstNumber, secondNumber);
        return result;
    }
    
    public int subtraction(int firstNumber, int secondNumber) {
        long result = (long) firstNumber - (long) secondNumber;
        return (int) result;
    }
    
    public int division(int firstNumber, int secondNumber) {
        long result = (long) firstNumber / (long) secondNumber;
        return (int) result;
    }
    
    public int multiplication(int firstNumber, int secondNumber) {
        long result = (long) firstNumber * (long) secondNumber;
        return (int) result;
    }
    
}
