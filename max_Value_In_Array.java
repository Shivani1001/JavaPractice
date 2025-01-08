import java.util.Arrays;
import java.util.Scanner;

public class FindMaxInt {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter integer numbers separated by space: ");
		
		// Read the input line and split it into an array of integers
		String input = sc.nextLine();
		String[] inputNumbers = input.split(" ");
		int[] intArray = new int[inputNumbers.length];
		
		try {
			// Parse input numbers into an integer array
			for (int i = 0; i < inputNumbers.length; i++) {
				intArray[i] = Integer.parseInt(inputNumbers[i]);
			}
			
			// Call the method to find the max value
			int maxInt = findMaxIntInArray(intArray);

			// Print the results
			System.out.println("*** Initial Array ***");
			System.out.println(Arrays.toString(intArray));
			System.out.println("*** Max number in array ***");
			System.out.println(maxInt);
		} catch (NumberFormatException e) {
			System.out.println("Invalid input. Please enter only integers separated by spaces.");
		} finally {
			sc.close();
		}
	}

	// Method to find the maximum value in an array
	public static int findMaxIntInArray(int[] intArray) {
		if (intArray.length == 0) {
			throw new IllegalArgumentException("Array cannot be empty.");
		}
		
		int max = intArray[0]; // Initialize with the first element
		for (int num : intArray) {
			if (num > max) {
				max = num;
			}
		}
		return max;
	}
}
