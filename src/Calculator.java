import java.util.Scanner;

public class Calculator {
    static Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        double num1 = CalculatorInputUtils.getDouble();
        double num2 = CalculatorInputUtils.getDouble();
        char operation = CalculatorInputUtils.getOperation();
        double result = Calculation.calculate(num1, num2, operation);
        System.out.println("Result of operation: " + result);
    }
}


