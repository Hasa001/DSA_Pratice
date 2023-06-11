public class heart {

    static void printstar(int n){
        if(n==0){
             return;
        }
        System.out.print(" *");
        printstar(n -1);
    }
    static void printblank(int n){
        if(n<=0){return;}
        System.out.print(" ");
        printblank(n- 1);

    }

   static void upper(int n,int count,int i){
    if(n==i){
        return;
    }
    upper(n-1,count +2,i);
    printblank(count -1);
    printstar(2*n -1);
    printblank(count-1);
    printblank(count+1);
    printstar(2*n-1);
    System.out.println();
   } 

    static void lower(int n,int count){
        if(n == 0){
            return;
        }
    
        printblank(count);
        printstar(2*n -1);
        System.out.println();
        lower(n-1,count+2);
        
    }

    static void addlines(int n,int count){
        if(count == 0){
            return;
        }
    printstar(4*n-1);
    System.out.println();
    addlines(n,count-1);

    }

static void printHeart(int n){
    upper(n , 1,n/2);
    addlines(n, n/3);
    lower(2*n, 0);
}
   public static void main(String[] args) {
       printHeart(14);
   } 
}
