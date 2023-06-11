public class productofnoinarray{

    static int productArray(int arr[],int index){
        if(index == arr.length){
            return 1;
        }

        return arr[index]*productArray(arr, index + 1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,2};
       System.out.print( productArray(arr, 0));
    }
}