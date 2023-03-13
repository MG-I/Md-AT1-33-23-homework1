public class CalculatorInputUtils {
    public static double getDouble() {
        System.out.println("Enter number: ");
        double num;
        if (Calculator.SCANNER.hasNextDouble()) {
            num = Calculator.SCANNER.nextDouble();
        } else {
            System.out.println("Wrong number, try again.");
            Calculator.SCANNER.next();
            num = getDouble();
        }
        return num;
    }

    public static char getOperation() {
        System.out.println("Choose operation + - * / ");
        char operation = 0;
        if (Calculator.SCANNER.hasNext()) {
            operation = Calculator.SCANNER.next().charAt(0);
        }
        return operation;
    }
}
