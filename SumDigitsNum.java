import java.util.Scanner;

public class SumDigitsInNumber {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter integer: ");
		int number = sc.nextInt();
		
		int sumOfDigits = sumDigitsInNumber(number);
		System.out.println(sumOfDigits);
	}

	public static int sumDigitsInNumber(int number) {
	    int sum = 0;
	    number = Math.abs(number);
		while (number > 0) {
            sum += number % 10; // Extract the last digit
            number /= 10;       // Remove the last digit
        }

        return sum;
	    }
	
	}
