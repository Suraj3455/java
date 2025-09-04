public class arithmetic {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int sum = a + b; // Addition
        int difference = b - a; // Subtraction
        int product = a * b; // Multiplication
        int quotient = b / a; // Division
        int remainder = b % a; // Modulus

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

        // Demonstrating operator precedence
        int result = a + b * 2; // Multiplication has higher precedence than addition
        System.out.println("Result of a + b * 2: " + result);

        result = (a + b) * 2; // Parentheses change the order of operations
        System.out.println("Result of (a + b) * 2: " + result);
        int num = 5;
        num++; // post-Increment operator
        System.out.println("Incremented num: " + num);
        num--; // post -Decrement operator
        System.out.println("Decremented num: " + num);
        num += 10; // Compound assignment operator
        System.out.println("After adding 10: " + num);
        ++num; // Pre-increment
        System.out.println("After pre-increment: " + num);
    }
}
