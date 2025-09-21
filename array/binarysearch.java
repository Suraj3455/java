public class binarysearch{
    public static int search(int arr[], int key){
        int low = 0;
        int high =arr.length-1;

        while(low<= high){
            int mid = low + (high - low) /2;
            if (arr[mid]==key){
                return mid;
            } else if (arr[mid]<key){
                low = mid +1;
            }else{
                high = mid -1;
        }
        
    } 
    return -1;
}
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80,90};
        int key = 60;

        
        int result = search(arr,key);

        if(result != -1){
            System.out.println("Element found at index: " + result);
        }else{
            System.out.println("Element not found");
        }
    }
}