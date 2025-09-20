public class maxmin {
    
    public static void main(String[] args) {
        int arr[] = { 1,4,6,2,99,6,5};
        int n =arr.length;
        int max = arr[0];
        int min = arr[0];

        for (int i=1; i<n; i++){
            if (arr[i] > max){
                max = arr[i];
            }
            if (arr[i] < min){
                min = arr[i];
            }
          
        }
        System.out.println("Maximum value is : " + max);
        System.out.println("Minimum value is : " + min);

    }
}
