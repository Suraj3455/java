public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 30, 30, 30, 40, 50, 50};
        int n = arr.length;

        if (n == 0) return; // empty array

        int j = 0; // index of last unique element

        // Traverse from second element
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[j]) {
                j++;         // move to next position
                arr[j] = arr[i]; // store unique element
            }
        }

        // j+1 is the new size of array without duplicates
        System.out.println("Array after removing duplicates:");
        for (int i = 0; i <= j; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
