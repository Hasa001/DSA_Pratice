public class leftpascalpyramid {
    static void printstar(int n){
        if(n==0){
            return;
        }
        System.out.print('*');
        printstar(n -1);
    }

    static void printblank(int n){
        if(n==0){
            return;
        }
        System.out.print(" ");
        printblank(n-1);
    }

    static void printlower(int n,int count){
         if(n == 0){
            return;
        }
        printblank(count); 
        printstar(n);
        System.out.println();
        printlower(n-1,count+1);
    }

    static void printupper(int n ,int count){
         if(n == 0 ){
            return;
        } 
        printupper(n-1,count +1);
        printblank(count);
        printstar(n);
        System.out.println();
        return;
    }

    static void leftpascal(int n){
        printupper(n-1,1);
        printlower(n,0);
    }

    public static void main(String[] args) {
        leftpascal(19);
    }
}
