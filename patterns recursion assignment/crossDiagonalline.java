public class crossDiagonalline {

    static void printblank(int n){
        if(n<=0){return;}
        System.out.print(" ");
        printblank(n- 1);
    }

    static void lowerPyramid(int n,int index,int count){
        if(index ==0){
            return;
        }
        lowerPyramid(n,index -1,count+1);
        if(index==1){
            printblank(count);
          System.out.print("*"); 
            System.out.println();   
        }
        else{
            printblank(count);
            System.out.print("*");
            printblank(2*index-3);
            System.out.print("*");
            System.out.println();
        } 
    }
    static void upperPyramid(int n,int index,int count){
        if(index <=n/2+1){
            return;
        }
            printblank(count);
            System.out.print("*");
           
           printblank(2*index-n-2);

            System.out.print("*");
            System.out.println();
        upperPyramid(n,index -1,count+1); 
    }

    static void printhollowDiamond(int n){
        upperPyramid(n, n, 0);
        lowerPyramid(n/2+1, n/2+1, 0);
        
    }


public static void main(String[] args) {
     printhollowDiamond(9);
}
        
}
