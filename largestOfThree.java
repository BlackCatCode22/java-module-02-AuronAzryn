import java.util.Scanner;

public class largestOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for three numbers
        System.out.print("Enter the first number (num1): ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number (num2): ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number (num3): ");
        int num3 = scanner.nextInt();

        int largest;
        String source = "";

        // Nested if statements to determine the largest
        if (num1 >= num2) {
            if (num1 >= num3) {
                largest = num1;
                source = "num1";
            } else {
                largest = num3;
                source = "num3";
            }
        } else {
            if (num2 >= num3) {
                largest = num2;
                source = "num2";
            } else {
                largest = num3;
                source = "num3";
            }
        }

        // Enhanced output statement
        System.out.println("You entered the value of " + largest + " for " + source +
                " and that was the largest of the three integers!");

        scanner.close();
    }
}
