public class relationl {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        boolean result = a == b; // Equal to
        System.out.println("a == b: " + result);

        System.out.println("a == b: " + (a == b)); // Equal to
        System.out.println("a != b: " + (a != b)); // Not equal to
        System.out.println("a > b: " + (a > b));   // Greater than
        System.out.println("a < b: " + (a < b));   // Less than
        System.out.println("a >= b: " + (a >= b)); // Greater than or equal to
        System.out.println("a <= b: " + (a <= b)); // Less than or equal to

        // Chained relational expressions
        int c = 15;
        System.out.println("a < c && c < b: " + (a < c && c < b)); // true if both conditions are true
        System.out.println("a < c || c > b: " + (a < c || c > b)); // true if at least one condition is true
    }
}
