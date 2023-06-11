public class invertedpyramid {

    static void printstar(int n){
        if(n==0){
             return;
        }
        System.out.print("* ");
        printstar(n -1);
    }
    static void printblank(int n){
        if(n==0){return;}
        System.out.print(" ");
        printblank(n- 1);

    }

    static void invPyramid(int n,int count){
        if(n == 0){
            return;
        }
        
        
        printblank(count);
        printstar(2*n -1);
        System.out.println();
        invPyramid(n-1,count+2);
        
    }
    public static void main(String[] args) {
        invPyramid(5, 0);
    }
}
