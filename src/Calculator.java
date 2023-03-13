public class Calculator {
    public static void main(String[] args) {
        double num1 = CalculatorInputUtils.getDouble();
        double num2 = CalculatorInputUtils.getDouble();
        char operation = CalculatorInputUtils.getOperation();
        double result = calculate(num1, num2, operation);
        System.out.println("Result of operation: " + result);
    }

    public static double calculate(double valueOne, double valueTwo, char operation) {
        double result;
        switch (operation) {
            case '+':
                result = Calculation.fold(valueOne, valueTwo, operation);
                break;
            case '-':
                result = Calculation.subtract(valueOne, valueTwo, operation);
                break;
            case '*':
                result = Calculation.multiplication(valueOne, valueTwo, operation);
                break;
            case '/':
                result = Calculation.divide(valueOne, valueTwo, operation);
                break;
            default:
                System.out.println("Wrong operation, try again.");
                result = calculate(valueOne, valueTwo, CalculatorInputUtils.getOperation());
                return result;
        }
        return result;
    }


}


