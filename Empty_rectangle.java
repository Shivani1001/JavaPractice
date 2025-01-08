import java.util.Scanner;
public class EmptyRectangle {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter height of rectangle: ");
		int height = sc.nextInt();
		System.out.print("Please, enter width of rectangle: ");
		int width = sc.nextInt();
		
		drawRectangle(height, width);
	}

	public static void drawRectangle(int height, int width) {
		for (int i = 1; i <= height; i++) {
            if (i == 1 || i == height) {
                // Print the full width for the first and last row
                for (int j = 1; j <= width; j++) {
                    System.out.print("*");
                }
            } else {
                // Print hollow rows for the middle rows
                System.out.print("*"); // Start with a star
                for (int j = 2; j < width; j++) {
                    System.out.print(" "); // Add spaces in between
                }
                if (width > 1) {
                    System.out.print("*"); // End with a star
                }
            }
            System.out.println(); // Move to the next row
        }
	}
}
