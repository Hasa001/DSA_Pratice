public class hollowsquare {
 
    static void printstar(int n){
        if(n==0){
            return;
        }
        System.out.print('*');
        printstar(n -1);
    }

    static void printblank(int n){
        if(n==0){return;}

        System.out.print(" ");
        printblank(n- 1);
    }
    static void printhollowSqr(int row,int col,int index){
        if(index > row ){
            return;
        }
        if(index == 1 || index == row ){
            printstar(col);
        }
        else{
            System.out.print('*');
            printblank(col - 2);
            System.out.print('*');
        }
        System.out.println();
        printhollowSqr( row , col,index + 1);
    }

    
    public static void main(String[] args) {
        printhollowSqr(8,5,1);
    }
}
