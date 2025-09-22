public class delet {
        public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int n = arr.length; // current number of elements

        System.out.println("Before deletion: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int pos = 2; // delete element at index 2 (30)

        // Shift elements left
        for (int i = pos; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        n--; // size decreases by 1

        System.out.println("After deletion: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    
}

}
