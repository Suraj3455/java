public class Ternary {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Using ternary operator to find the maximum of two numbers
        int max = (a > b) ? a : b; 
        System.out.println("Maximum of a and b: " + max);

        // Using ternary operator to check if a number is even or odd
        int number = 15;
        String result = (number % 2 == 0) ? "Even" : "Odd";// if number is divisible by 2 then even else odd
        System.out.println("The number " + number + " is: " + result);
    }
}
