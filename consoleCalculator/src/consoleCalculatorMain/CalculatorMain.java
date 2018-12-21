package consoleCalculatorMain;

public class CalculatorMain
{
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        
        
        System.out.println("Welcome to my Console Calculator");
        System.out.println("--------------------------------------");
        System.out.println();
        int number1 = Integer.parseInt(args[0]);
        int number2 = Integer.parseInt(args[1]);
        
        System.out.println("Summe " + number1 + " + " + number2 + " = " + calculator.subtraction(10, 20));
    }
}
