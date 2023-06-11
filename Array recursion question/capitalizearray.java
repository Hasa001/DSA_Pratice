public class capitalizearray {
    static String[] capitalize(String arr[],int index){
        if(index == arr.length){
            return arr;
        }

        capitalize(arr,index +1);
        arr[index]= arr[index].toUpperCase();

        return arr;
    } 

    static void print(String arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
    }
    public static void main(String[] args) {
        String arr[]={"foo","bar","world"};
        capitalize(arr, 0);
        print(arr);
    }
}
