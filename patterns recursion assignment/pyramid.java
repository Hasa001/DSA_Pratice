public class pyramid {
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

    static void Pyramid(int n,int count){
        if(n == 0){
            return;
        }
        
        Pyramid(n-1,count+1);
        printblank(count);
        printstar(n);
        System.out.println();
        
    }

public static void main(String[] args) {
 
   Pyramid(5,0);
}
}
