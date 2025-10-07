public class SlidingWindowExample {

    // Function to find maximum sum subarray of size k
    public static int maxSumSubarray(int[] arr, int k) {
        int n = arr.length;
        if (n < k) return -1;  // edge case: window larger than array

        int windowSum = 0;                   // sum of current window
        int maxSum = Integer.MIN_VALUE;      // maximum sum found

        // Step 1: sum of first window of size k
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        maxSum = windowSum;

        // Step 2: slide the window from index k to n-1
        for (int i = k; i < n; i++) {
            windowSum += arr[i] - arr[i - k];  // add new element, remove old element
            maxSum = Math.max(maxSum, windowSum);  // update max sum
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;

        int result = maxSumSubarray(arr, k);
        System.out.println("Maximum sum of subarray of size " + k + " is: " + result);
    }
}
