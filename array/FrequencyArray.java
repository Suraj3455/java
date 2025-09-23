public class FrequencyArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 3, 4, 2, 5};
        int element = 2; // element to count
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                count++;
            }
        }

        System.out.println("Frequency of " + element + " is: " + count);
    }
}
