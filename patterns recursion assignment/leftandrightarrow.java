public class leftandrightarrow {

    static void printstar(int n){
        if(n<=0){
             return;
        }
        System.out.print("*");
        printstar(n -1);
    }
    static void printblank(int n){
        if(n<=0){return;}
        System.out.print(" ");
        printblank(n- 1);

    }
    static void Lupper(int n){
        if(n ==0){
            return;
        }
            printblank(n);
            printstar(n);
            System.out.println();   
        Lupper(n-1);
    }

    static void Llower(int n){
        if(n ==0){
            return;
        }
            Llower(n-1);
            printblank(n);
            printstar(n);
            System.out.println();   
        
    }

    static void leftarrow(int n){
        System.out.println();
        Lupper(n);
        System.out.println("*");
        Llower(n);
        System.out.println();
    }

    static void Rupper(int n,int i){
        if(n ==0){
            return;
        }
            printblank(2*i);
            printstar(n);
            System.out.println();   
        Rupper(n-1,i+1);
    }

    static void Rlower(int n,int i){
        if(n ==0){
            return;
        }
            Rlower(n-1,i+1);
            printblank(2*i);
            printstar(n);
            System.out.println();   
        
    }

    static void rightarrow(int n){
        System.out.println();
        Rupper(n,0);
        printblank(2*n -1);System.out.println("*");
        Rlower(n,0);
        System.out.println();
    }

   public static void main(String[] args) {
    
     leftarrow(5);
     System.out.println();
     rightarrow(5);
   } 
}
