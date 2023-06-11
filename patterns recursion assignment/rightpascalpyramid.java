public class rightpascalpyramid{
    static void printstar(int n){
        if(n==0){
            return;
        }
        System.out.print('*');
        printstar(n -1);
    }

    static void printlower(int n){
         if(n == 0){
            return;
        } 
        printstar(n);
        System.out.println();
        printlower(n-1);

    }

    static void printupper(int n){
         if(n == 0 ){
            return;
        } 
        printupper(n-1);
        printstar(n);
        System.out.println();
        

    }

    static void rightpascal(int n){
      //  int mid=n/2;
        printupper(n-1);
        printlower(n);
    }
    public static void main(String[] args) {
        rightpascal(6);
    }
}