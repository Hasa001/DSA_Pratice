public class getalleleindex {

    public static void printarr(int arr[]){

        for(int i=0;i<=arr.length-1;i++){

            System.out.println(arr[i]);
        }
    }

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

    static void findindexs(int arr[],int key,int index,int finalarr[],int i){
        if(index == arr.length){
            printarr(finalarr);
            return ;
        }
        if(arr[index]==key){
            finalarr[i]=index;
            i++;
        }
        findindexs(arr,key,index + 1,finalarr,i);

    }
    public static void main(String[] args) {
        int arr[]={2 ,4, 5, 5, 6, 2,21, 1, 1, 1,1,1};
        int finalarr[]=new int[CountOcc(arr, 1, 0)];
        findindexs(arr,1,0,finalarr,0);
    }
}
