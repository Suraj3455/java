public class FirstNegativeInWindow {
    public static void main(String[] args) {
        int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3;

        printFirstNegative(arr, k);
    }

    static void printFirstNegative(int[] arr, int k) {
        int n = arr.length;

        // Loop for each window
        for (int i = 0; i <= n - k; i++) {
            int firstNeg = 0; // default if no negative in window

            // Scan the window
            for (int j = 0; j < k; j++) {
                if (arr[i + j] < 0) {
                    firstNeg = arr[i + j];
                    break; // stop after finding the first negative
                }
            }

            System.out.print(firstNeg + " ");
        }
    }
}
