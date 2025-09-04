// Demonstration of different numeric literals and character manipulation in Java
public class main {
    public static void main(String[] args) {
        int number = 5;
        int a = 0b101; // Binary representation of 5
        int b = 0x5;   // Hexadecimal representation of 5

        int num =1000_0000_00; // Using underscores for readability
        double num1 = 12e10; // Scientific notation
        float num2 = 12;// Implicit casting from int to float

        char c = 'A'; // Character
        c++; // Increment character to 'B'
        
   
        System.out.println(number);
        System.out.println(a);
        System.out.println(b);
        System.out.println(num);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(c);


        //javac main.java
        //java main
    }
}

