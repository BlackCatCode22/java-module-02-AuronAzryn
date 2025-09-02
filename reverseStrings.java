import java.util.Scanner;

public class reverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for user input
        System.out.println("Enter a word to reverse: ");
        String input = scanner.nextLine();

        // Reverse the string using StringBuilder
        String reversed = new StringBuilder(input).reverse().toString();

        // Output the reversed string
        System.out.println("Reversed word: " + reversed);

        scanner.close();
        }
    }
