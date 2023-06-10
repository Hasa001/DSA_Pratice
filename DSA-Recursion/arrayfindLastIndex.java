public class arrayfindLastIndex {

    static void lastindex(int arr[],int key,int index,int lastidx){
        if(index == arr.length){
            System.out.println(lastidx);
            return;
        }  
        if(arr[index]==key){
            lastidx =index;
        }
        lastindex(arr,key,index+1,lastidx);
        return;
    }

    static int LastIndex(int arr[],int key,int index){
        if(index == arr.length){
            return -1;
        }
        int lastidx = LastIndex(arr, key, index +1);
        if(key == arr[index] && lastidx<index){
            lastidx = index;
        } 
        return lastidx;
    }

    public static void main(String[] args) {
        int arr[]={2,4,43,3,1,1,6,1,6,7};
        lastindex(arr,1, 0,-1);
    }
}
