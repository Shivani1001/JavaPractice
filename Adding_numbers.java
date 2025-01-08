public class AddNumbers {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Please provide exactly two arguments.");
            return;
        }

        try {
            // Try parsing the inputs as double
            double num1 = Double.parseDouble(args[0]);
            double num2 = Double.parseDouble(args[1]);

            // Check if both numbers are integers
            if (num1 == (int) num1 && num2 == (int) num2) {
                // If both are integers, print the result as an integer
                System.out.println(((int) num1 + (int) num2));
            } else {
                // Otherwise, print the result as a floating-point number
                System.out.println((num1 + num2));
            }
        } catch (NumberFormatException e) {
            // Handle invalid inputs
            System.out.println("Please provide valid numbers as arguments.");
        }
    }
}
