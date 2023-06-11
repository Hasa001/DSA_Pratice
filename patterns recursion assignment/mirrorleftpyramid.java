public class mirrorleftpyramid {

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

    static void printmirrorleftpyrm(int row,int col){
        if(row == 0){
            return;
        }
        printmirrorleftpyrm(row -1 , col);
        printblank(col - row);
        printstar(row);
        System.out.println();
        
    }
    public static void main(String[] args) {
        printmirrorleftpyrm(5,5);
    }
}
