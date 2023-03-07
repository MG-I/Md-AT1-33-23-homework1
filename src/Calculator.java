import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double num1 = getDouble();
        double num2 = getDouble();
        char operation = getOperation();
        double result = calc(num1, num2, operation);
        System.out.println("Result of operation: " + result);
    }


    public static double getDouble() {
        System.out.println("Enter number: ");
        double num;
        if (scanner.hasNextDouble()) {
            num = scanner.nextDouble();
        } else {
            System.out.println("Wrong number, try again.");
            scanner.next();
            num = getDouble();
        }
        return num;
    }


    public static char getOperation() {
        System.out.println("Choose operation + - * / ");
        char operation = 0;
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        }

        return operation;
    }


    public static double calc(double num1, double num2, char operation) {
        double result = 0;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Wrong operation, try again.");
                result = calc(num1, num2, getOperation());
                return result;
        }
        return result;
    }

}


