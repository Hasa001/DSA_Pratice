public class salarytax {
    static double[] newSalary(int arr[],int index,double[] newSalary){
        if(index == arr.length){
            return newSalary;
        }
        newSalary(arr,index +1,newSalary);
        newSalary[index]= arr[index]  + (arr[index]*0.1) ;

        return newSalary;
    }

    static void print(double arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[]={30000,40000,80000,20000,50000};
        double nsalary[]=new double[arr.length];
        newSalary(arr, 0, nsalary);
        print(nsalary);
    }
}
