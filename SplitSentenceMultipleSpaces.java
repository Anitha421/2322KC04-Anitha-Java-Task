import java.util.Scanner;

public class SplitSentenceMultipleSpaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

      
        String[] words = sentence.trim().split("\\s+");

        System.out.println("The words in the sentence are:");
        for (String word : words) {
            System.out.println(word);
        }

        scanner.close();
    }
}
