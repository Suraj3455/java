public class MaxSubarraySimple {
    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        printMaxSubarrays(arr, k);
    }

    static void printMaxSubarrays(int[] arr, int k) {
        int n = arr.length;

        // Loop for each window
        //So its starting point (i) should be at most n - k.
        for (int i = 0; i <= n -k; i++) {
            int max = arr[i];

            // Find max inside current window
            for (int j = 1; j < k; j++) {
                if (arr[i + j] > max) {
                    max = arr[i + j];
                }
            }

            // Print max of this window
            System.out.print(max + " ");
        }
    }
}
