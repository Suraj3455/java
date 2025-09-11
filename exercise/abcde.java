import java.util.Scanner;
public class abcde {


public static double get ( double radius){
    return 2 * 3.14 * radius ;

}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle");
        double radius = sc.nextDouble();
        System.out.println("The circumference of circle is " + get(radius));
        sc.close();
        
    }
}