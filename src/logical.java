public class logical {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        boolean result = (a < b) && (a != b); // Logical AND  if both conditions are true then true
        System.out.println("a < b && a != b: " + result);

        boolean d = (a < b) || (a == b); // Logical OR  if any one true then true 
        System.out.println("a < b || a == b: " + d);

       boolean f = !(a < b); // Logical NOT
        System.out.println("!(a < b): " + f);
    }
}
