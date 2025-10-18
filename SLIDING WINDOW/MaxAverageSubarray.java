public class MaxAverageSubarray {
    public static double findMaxAverage(int[] arr, int K) {
        int n = arr.length;
        int windowSum = 0;

        // calculate sum of first window
        for (int i = 0; i < K; i++) {
            windowSum += arr[i];
        }

        double maxSum = windowSum;

        // slide the window
        for (int i = K; i < n; i++) {
            windowSum += arr[i] - arr[i - K]; // add next element, remove first element of previous window
            if (windowSum > maxSum) {
                maxSum = windowSum;
            }
        }

        return maxSum / K; // return maximum average
    }

    public static void main(String[] args) {
        int[] arr = {1, 12, -5, -6, 50, 3};
        int K = 4;
        System.out.println(findMaxAverage(arr, K));
    }
}
