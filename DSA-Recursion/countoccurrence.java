public class countoccurrence {
    
    static int CountOcc(int arr[],int key,int index){
        if(index == arr.length){
            return 0;
        }
        int count=CountOcc(arr,key,index +1);
        if(arr[index]==key){
            count++;
        }
        return count;
    }

    static void countocc(int arr[],int key,int index,int count){
        if(index == arr.length){
            System.out.println(count);
            return;
        }
        if(arr[index]==key){
            count++;
        }
        countocc(arr, key, index +1, count);
    }
    public static void main(String[] args) {
        int arr[]={2,4,4,4,4,55,7,8};
        countocc(arr, 4, 0, 0);
        System.out.println(CountOcc(arr,4,0));
    }
}
