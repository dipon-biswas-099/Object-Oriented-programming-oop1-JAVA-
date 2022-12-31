import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        // Declare variables to store the input numbers and the result
        double num1, num2, result;

        // Prompt the user for the input numbers and the operation
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        num1 = input.nextDouble();
        System.out.print("Enter the second number: ");
        num2 = input.nextDouble();
        System.out.print("Enter the operation (+, -, *, /): ");
        char operation = input.next().charAt(0);

        // Perform the specified operation and store the result
        result = calculate(num1, num2, operation);

        // Print the result to the console
        System.out.println("The result is: " + result);
    }

    public static double calculate(double num1, double num2, char operation) {
        // Perform the specified operation and return the result
        switch (operation) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return num1 / num2;
            default:
                System.out.println("Invalid operator");
                return 0;
        }
    }
}
