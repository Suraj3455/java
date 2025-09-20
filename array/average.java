public class average {
    
    public static void main(String[] args) {

        int [] arr = {34,33,56,89,35,76,26,45};
        int n = arr.length;

        int sum = 0;

        for (int num : arr){
            sum += num;
        
        }
        double average = (double)sum /n;
        System.out.println("Average of array elements is : " + average);
        
    }
}
