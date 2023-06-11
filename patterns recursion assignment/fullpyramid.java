public class fullpyramid {

    static void printstar(int n){
        if(n==0){
            return;
        }  
        System.out.print(" *");
        printstar(n-1);
    }
    static void printblank(int n){
        if(n==0){return;}
        System.out.print(" ");
        printblank(n- 1);

    }

    static void printlower(int n,int count){
         if(n == 0){
            return;
        } 
        printblank(count);
        printstar(2*n -1);
        System.out.println();
        printlower(n-1,count+2);

    }

    static void printupper(int n,int count){
         if(n == 0 ){
            return;
        } 
        printupper(n-1,count+2);
        printblank(count);
        printstar(2*n - 1);
        System.out.println();
        

    }

    static void Pyramid(int n){
        int row1=n/2;
        int row2=n/2+1;
        printupper(row1,2);
        printlower(row2, 0);
        
    }

public static void main(String[] args) {
     int n=30;
   Pyramid(n);
}
}
