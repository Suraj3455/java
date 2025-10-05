public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int i = 0;  // slow pointer
        for (int j = 1; j < nums.length; j++) {  // fast pointer
            if (nums[i] != nums[j]) {  // found new unique element
                i++;
                nums[i] = nums[j];  // move unique element forward
            }
        }
        return i + 1;  // new length
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 4};
        int length = removeDuplicates(nums);

        System.out.println("New Length: " + length);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
