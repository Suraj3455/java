
public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 5, -1, 7, -3, -1, -2};
        int n = arr.length;
        int k = 4;
        int sum = 0;

        for (int i = 0; i <= n - k; i++) {
            int min = arr[i];
            int max = arr[i];

            // find min & max in current window
            for (int j = 1; j < k; j++) {
                if (arr[i + j] < min) min = arr[i + j];
                if (arr[i + j] > max) max = arr[i + j];
            }
             
            sum += (min + max);
        }

        System.out.println("Sum = " + sum);
    }
}
