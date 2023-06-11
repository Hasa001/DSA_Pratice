
public class leftpyramid {

    static void printstar(int n){
        if(n==0){
            return;
        }
        System.out.print('*');
        printstar(n -1);
    }

    static void LeftPyramid(int n){
        if(n == 0){
            return;
        }
        LeftPyramid(n-1);
        printstar(n);
        System.out.println();
    }

public static void main(String[] args) {
 
   LeftPyramid(5);
}  
}