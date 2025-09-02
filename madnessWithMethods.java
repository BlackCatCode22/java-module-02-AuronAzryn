import java.util.Scanner;
public class madnessWithMethods {

    // Function to get an integer from the user
    public static int getAnIntFromTheUser(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextInt();
    }

    // Function to compare two integers
    public static void compareTwoInts(int a, int b) {
        if (a>b) {
            System.out.println(a + " is greater than " + b);
        } else if (a < b) {
            System.out.println(a + " is less than " + b);
        } else {
            System.out.println(a + " is equal to " + b);
        }
    }

    // Function to sum two integers
    public static int sumTwoInts(int a, int b) {
        return a + b;
    }

    // Main Program
    public static void main(String[] args) {
        int num1 = getAnIntFromTheUser("Enter the first number: ");
        int num2 = getAnIntFromTheUser("Enter the second number: ");

        compareTwoInts(num1, num2);

        int sum = sumTwoInts(num1, num2);
        System.out.println("The sum of the two numbers is: " + sum);
    }
}
