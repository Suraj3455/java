public class MinSumSubarrayFixedWindow {

    // Function to find the minimum sum subarray of size k
    public static int minSumSubarray(int[] arr, int k) {
        int n = arr.length;
        if (n < k) return -1; // edge case: window size > array size

        int windowSum = 0;
        int minSum = Integer.MAX_VALUE;

        // Step 1: Compute sum of the first window
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        minSum = windowSum;

        // Step 2: Slide the window through the array
        for (int i = k; i < n; i++) {
            windowSum += arr[i] - arr[i - k]; // add new, remove old
            minSum = Math.min(minSum, windowSum); // update minimum sum
        }

        return minSum;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;

        int result = minSumSubarray(arr, k);
        System.out.println("Minimum sum of subarray of size " + k + " is: " + result);
    }
}
