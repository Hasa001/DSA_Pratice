public class invertedleftpyramid {

    static void printstar(int n){
        if(n==0){
             return;
        }
        System.out.print('*');
        printstar(n -1);
    }

    static void invLeftPyramid(int n){
        if(n == 0){
            return;
        }
        
        printstar(n);
        System.out.println();
        invLeftPyramid(n-1);
    }

public static void main(String[] args) {
 
   invLeftPyramid(5);
} 
    
}
