public class diagonalline {

    static void printblank(int n){
        if(n==0){return;}
        System.out.print(" ");
        printblank(n-1);

    }

    static void printdiagonal(int n){
        if(n==0){
            return;
        }

        printblank(n-1);
        System.out.println(" *");
        printdiagonal(n-1);
    }
public static void main(String[] args) {
    printdiagonal(5);
}
    
}