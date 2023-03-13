public class Calculation {
    public static double calculate(double valueOne, double valueTwo, char operation) {
        double result = 0;
        switch (operation) {
            case '+':
                result = valueOne + valueTwo;
                break;
            case '-':
                result = valueOne - valueTwo;
                break;
            case '*':
                result = valueOne * valueTwo;
                break;
            case '/':
                result = valueOne / valueTwo;
                break;
            default:
                System.out.println("Wrong operation, try again.");
                result = calculate(valueOne, valueTwo, CalculatorInputUtils.getOperation());
                return result;
        }
        return result;
    }
}
