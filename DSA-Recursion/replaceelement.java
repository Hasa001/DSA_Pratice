public class replaceelement {

    static int[] replace(int arr[],int key,int replacekey,int index){
        if(index == arr.length){
            return arr;
        }

        replace(arr,key,replacekey,index  +1);
        if(arr[index] == key){
            arr[index]=replacekey;
        }
        return arr;
    }

    static void Replace(int arr[],int key,int replacekey,int index){
        if(index == arr.length){
            printarr(arr);
            return;
        }

        if(arr[index]== key){
            arr[index]=replacekey;
        }
        Replace(arr, key, replacekey, index +1);
    }

    public static void printarr(int arr[]){

        for(int i=0;i<=arr.length-1;i++){

            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[]={2,3,4,5,2,5,2};
        printarr(replace(arr,2,1,0));
        System.out.println();

        Replace(arr, 2, 1, 0);
    }
}
