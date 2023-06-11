public class maxinanarray {

    static void maxElement(int arr[],int index,int max){
        if(index == arr.length){
            System.out.println(max);
            return;
        }

        if(arr[index]>max){
            max=arr[index];
        }
        maxElement(arr, index +1, max);
        return;
    } 
    public static void main(String[] args) {
        int max=Integer.MIN_VALUE;
        int arr[]={-1,-2,-3,-5,-6};
       maxElement(arr, 0, max);
    }
    
}
