import java.util.*;
public  class thirdlargest{


    public static void main(String[] args) {
 
    int arr[]={2,55,23,23,5,67,2,87,55};
    Arrays.sort(arr);
    System.out.print(arr[arr.length-3]);
    }
}