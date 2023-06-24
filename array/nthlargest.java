import java.util.Arrays;

public class nthlargest {

    static void nthlarge(int arr[],int n){

    if(n>arr.length){
        System.out.print("element not available");
    }
    else{
    Arrays.sort(arr);
    System.out.print(arr[arr.length-n]);
    }
}
    
 public static void main(String[] args) {
 
    int arr[]={3,2,5,6,7,1,11,2,9};
        nthlarge(arr,1);
    }

}
