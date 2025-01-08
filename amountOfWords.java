import java.util.Scanner;

public class AmountOfWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter any text: ");
	
	    String text = sc.nextLine();
	    int amountOfWords = getWordsAmount(text);
	
		System.out.println("Amount of words in your text: " + amountOfWords);
	}

	public static int getWordsAmount(String text) {
	    if (text == null || text.trim().isEmpty()) {
            return 0; // Return 0 for null or empty input
        }

        // Split the text by spaces and count the resulting elements
        String[] words = text.trim().split("\\s+");
        return words.length;
		
	}
}
