import java.util.Scanner;

public class Main {

    // Function to return the greater of two numbers
    public static int getGreater(int a, int b) {
        return (a > b) ? a : b; // ternary operator
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Calling function
        int greater = getGreater(num1, num2);

        // Printing result
        System.out.println("Greater number is: " + greater);

        sc.close(); // close scanner
    }
}
