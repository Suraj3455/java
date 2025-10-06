public class SortColorsDNF {
    public static void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                // put 0 to the left region
                int tmp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = tmp;
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                // 1 is in the middle region
                mid++;
            } else { // nums[mid] == 2
                // put 2 to the right region
                int tmp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = tmp;
                high--;
                // note: don't increment mid here
            }
        }
    }

    // quick test
    public static void main(String[] args) {
        int[] arr = {2, 0, 2, 1, 1, 0};
        sortColors(arr);
        for (int x : arr) System.out.print(x + " ");
        // expected: 0 0 1 1 2 2
    }
}
