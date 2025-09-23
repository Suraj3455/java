public class SecondLargest {
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6,7,8,9};
        if (arr.length < 2) {
            System.out.println("Array must have at least 2 elements");
            return;
        }

        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        
        for (int num : arr){
            if (num > largest){
                secondlargest = largest;
                largest = num;
            }else if(num > secondlargest && num!=largest){
                secondlargest =num;
            }
                  if (num < smallest) {
                secondSmallest = smallest; // old smallest becomes second smallest
                smallest = num;            // update smallest
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;      // update second smallest
            }
            
            
        }
        
        if (secondlargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element");
        } else {
            System.out.println("Second Largest: " + secondlargest);
        }
        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.println("No second smallest element");
        } else {
            System.out.println("Second Smallest: " + secondSmallest);
        }
    }
}