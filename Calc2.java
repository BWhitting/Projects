import java.util.Scanner;

public class Calc {
    private double num1;
    private double num2;

    public Calc(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    @Override
    public String toString() {
        return "Num1: " + num1 + "\nNum2: " + num2;
    }

    public double add() {
        return num1 + num2;
    }

    public double subtract() {
        return num1 - num2;
    }

    public double multiply() {
        return num1 * num2;
    }

    public double divide() {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            throw new ArithmeticException("Cannot divide by zero");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstNumber = getValidNumber(scanner, "Please enter the first number: ");
        double secondNumber = getValidNumber(scanner, "Please enter the second number: ");

        Calc calc = new Calc(firstNumber, secondNumber);
        System.out.println("Displaying private data fields using toString():");
        System.out.println(calc.toString());
        System.out.println("Calling num1 get method: " + calc.getNum1());
        System.out.println("Calling num2 get method: " + calc.getNum2());
        System.out.println("The sum is: " + calc.add());
        System.out.println("The difference is: " + calc.subtract());
        System.out.println("The product is: " + calc.multiply());
        System.out.println("The quotient is: " + calc.divide());
    }

    private static double getValidNumber(Scanner scanner, String prompt) {
        double number;
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextDouble()) {
                number = scanner.nextDouble();
                break;
            } else {
                System.out.println("Invalid input. Please enter a numeric value.");
                scanner.next(); // Clear the invalid input
            }
        }
        return number;
    }
}
