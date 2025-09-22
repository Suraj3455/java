public class update {
    
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};  
        // Initial array of size 5

        System.out.println("Before update: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();

        int index = 2;  // update at index 2 (third element)
        int newValue = 99;

        arr[index] = newValue;  
        // Replace element at index 2 (old value 30) with 99

        System.out.println("After update: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    
}

}
