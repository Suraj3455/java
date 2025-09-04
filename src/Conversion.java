public class Conversion {
    public static void main(String[] args) {


      
    
    
    
    
    float f = 10.5f;
    int x = (int) f; // Explicit casting from float to int
    System.out.println(x);
    byte b =  127; // byte range is -128 to 127
    System.out.println(b);
    int a = b; // Implicit casting from byte to int
    System.out.println(a);

    //int b = a; // This would cause a compile-time error due to possible loss of information

    byte c = (byte) a; // Explicit casting from int to byte
    System.out.println(c);

    int z = 257;
    byte y = (byte) z; // Explicit casting from int to byte, results in overflow
    System.out.println(y); // Output will be 1 due to overflow (257 - 256 = 1) perform modulus operation

    float d = 10.5f;
    int e = (int) d; // Explicit casting from float to int
    System.out.println(e); // Output will be 10, decimal part is truncated


    byte p = 100;
    byte q = 28;

    int result = p*q; // Implicit casting from byte to int during arithmetic operation
    System.out.println(result);

    
    }
}
