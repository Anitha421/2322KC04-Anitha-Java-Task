import java.util.Scanner;

public class StringAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        
        String[] words = sentence.trim().split("\\s+");
        int wordCount = words.length;

        
        int charCount = 0;
        for (char ch : sentence.toCharArray()) {
            if (ch != ' ') {
                charCount++;
            }
        }

        
        String reversed = "";
        for (int i = sentence.length() - 1; i >= 0; i--) {
            reversed += sentence.charAt(i);
        }

       
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        
        System.out.println("Word count: " + wordCount);
        System.out.println("Character count (excluding spaces): " + charCount);
        System.out.println("Reversed sentence: " + reversed);
        System.out.println("Longest word: " + longestWord);

        scanner.close();
    }
}
