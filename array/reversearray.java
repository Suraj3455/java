public class reversearray {
    public static void main(String[] args) {

        int arr[] =  {1,5,6,3,7,8};
        int n = arr.length;

        System.out.println("Original Array is :");
        for(int num : arr){
            System.out.print(num +" ");
        }
        int start =0;
        int end = n - 1;

        while(start < end){
             int temp = arr[start];
             arr[start] = arr[end];
             arr[end]= temp;
             start++;
             end--;
        }
       
        
        System.out.println("\n Reversed Array is :");

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

        
    }
    
}
