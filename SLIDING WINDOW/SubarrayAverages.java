public class SubarrayAverages {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int K = 3;

        for (int i = 0; i <= arr.length - K; i++) {  // start of subarray
            int sum = 0;
            
            for (int j = i; j < i + K; j++) {        // sum elements in subarray
                sum += arr[j];
            }
            
            double average = (double) sum / K;       // calculate average
            System.out.println(average);             // print it
        }
    }
}
