public class linearsearchexampal {
    public static int linearsearch(int arr[] , int key) {
        for (int i=0; i<arr.length; i++){
            if (arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    
public static void main(String[] args) {
    int[]  arr ={10,20,30,40,50,60,70,80,90};
    int key = 60;
    int result = linearsearch(arr ,key);

    if(result!=-1){
        System.out.println("element fount at index:"+ result);   
    }else{
        System.out.println("element not found");
    }
}


    
}
