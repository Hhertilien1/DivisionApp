//Herby Hertilien
//COP-3330C-24680
//02/02/2024
//This program is designed to prompt the user to input two integers, perform division on them, and then output the result.
//This program is to perform division between two integers provided by the user and handle potential errors gracefully. It ensures that division by zero does not occur and provides appropriate error messages if such an attempt is made.

import java.util.Scanner;

public class DivisionApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt the user to enter two integers
            System.out.print("Enter the first integer: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter the second integer: ");
            int num2 = scanner.nextInt();

            // Divide and output the result
            double result = divideNumbers(num1, num2);
            System.out.printf("%d / %d = %.2f\n", num1, num2, result);

        } catch (ArithmeticException e) {
            // Handle division by zero exception
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            // Handle other exceptions
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    /**
     * Divides two numbers.
     *
     * @param num1 the dividend
     * @param num2 the divisor
     * @return the result of the division
     * @throws ArithmeticException if attempting to divide by zero
     */
    private static double divideNumbers(int num1, int num2) {
        if (num2 == 0) {
            // Throw ArithmeticException if attempting to divide by zero
            throw new ArithmeticException("Cannot divide by zero");
        }
        return (double) num1 / num2;
    }
}


