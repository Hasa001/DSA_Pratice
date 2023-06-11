public class hollowinvpyramid {

    static void printstar(int n){
        if(n==0){
             return;
        }
        System.out.print("*");
        printstar(n -1);
    }
    static void printblank(int n){
        if(n==0){return;}
        System.out.print(" ");
        printblank(n- 1);

    }

    static void invPyramid(int n,int index,int count){
        if(index ==0){
            return;
        }
        
        if(index==1 || index==n){
            printblank(count);
            printstar(2*index -1);
            System.out.println();   
        }
        else{
            printblank(count);
            System.out.print("*");
           // int temp=count-1;
            printblank(2*index-3);
            System.out.print("*");
            System.out.println();
        }

        invPyramid(n,index -1,count+1);
        
    }
    public static void main(String[] args) {
        invPyramid(10, 10, 1);
    }
}
