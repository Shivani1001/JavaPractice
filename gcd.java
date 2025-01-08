import java.util.Scanner;

public class GreatestCommonDivisor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Please, enter two numbers separated by space: ");
        String userInput = sc.nextLine();

        // Split the input into two numbers
        String[] inputArgumentsArray = userInput.split("\\s+");
        if (inputArgumentsArray.length != 2) {
            System.out.println("Error: Please enter exactly two numbers separated by a space.");
            return;
        }

        try {
            // Parse the numbers
            int number1 = Integer.parseInt(inputArgumentsArray[0]);
            int number2 = Integer.parseInt(inputArgumentsArray[1]);

            // Compute and print the GCD
            System.out.println("The GCD is: " + gcdRecursive(number1, number2));
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input. Please enter valid integers.");
        }
    }

    // Recursive method to compute the GCD using the Euclidean algorithm
    public static int gcdRecursive(int firstNumber, int secondNumber) {
        if (secondNumber == 0) {
            return Math.abs(firstNumber); // Base case: return the absolute value
        }
        return gcdRecursive(secondNumber, firstNumber % secondNumber); // Recursive step
    }
}
