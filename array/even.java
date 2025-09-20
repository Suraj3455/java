public class even {
    public static void main(String[] args) {
        int [] arr = {23,456,787,4,533,55,66,88,33,90};
       
        int count= 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] % 2 == 0){
                
                count++;
            }
        }
        System.out.println("Count of even numbers in the array is : " + count);
    }
    
}
