public class sum {
    public static void main(String[] args) {

        int [] arr = {34,55,67,23,13,75,89};
        // int n = arr.length;

        int sum = 0;

        for (int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        System.out.println("Sum of array elements is : " + sum);
    }
   
}