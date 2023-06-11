public class hollodiamondstar {

    static void printstar(int n){
        if(n<=0){
             return;
        }
        System.out.print("*");
        printstar(n -1);
    }
    static void printblank(int n){
        if(n<=0){return;}
        System.out.print(" ");
        printblank(n- 1);

    }

    static void upperPyramid(int n,int index,int count){
        if(index ==0){
            return;
        }
        upperPyramid(n,index -1,count+1);
        if(index==1){
            printstar(count);
            printstar(count-1);
          //  printstar(2*index -1);
            System.out.println();   
        }
        else{
            printstar(count);
           // System.out.print("*");
           // int temp=count-1;
            printblank(2*index-3);
            printstar(count);
            //System.out.print("*");
            System.out.println();
        } 
    }
    static void lowerPyramid(int n,int index,int count){
        if(index ==0){
            return;
        }
        
        if(index==1){
            printstar(count);
            printstar(count-1);
          //  printstar(2*index -1);
            System.out.println();   
        }
        else{
            printstar(count);
           // System.out.print("*");
           // int temp=count-1;
            printblank(2*index-3);
            printstar(count);
            //System.out.print("*");
            System.out.println();
        }
        lowerPyramid(n,index -1,count+1); 
    }

    static void printhollowDiamond(int n){
        upperPyramid(n, n, 1);
        lowerPyramid(n, n, 1);
    }
    public static void main(String[] args) {
        printhollowDiamond(19);
    }
    
}
