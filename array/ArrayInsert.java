public class ArrayInsert {
    public static void main(String[] args) {
        int[] arr = new int[6];  // Array of size 6 (extra space for new element)
        arr[0] = 10; arr[1] = 20; arr[2] = 30; arr[3] = 40; arr[4] = 50;
        int n = 5; // current number of elements

        System.out.println("Before insertion: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int pos = 2;   // insert at index 2 (third position)
        int newValue = 99;

        // Shift elements to the right (from last to pos)
        for (int i = n; i > pos; i--) {
            arr[i] = arr[i - 1];
        }
        arr[pos] = newValue;  // place new value at position
        n++; // size increases by 1

        System.out.println("After insertion: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
