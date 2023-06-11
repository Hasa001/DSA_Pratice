public class invertedmirrorleftpyramid {

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

    static void printinvmirrorleftpyrm(int row,int col){
        if(row == 0){
            return;
        }  
        printblank(col - row);
        printstar(row);
        System.out.println();
        printinvmirrorleftpyrm(row -1 , col);
    }
    public static void main(String[] args) {
        printinvmirrorleftpyrm(5,5);
    } 
}
