public class numberRightandLeft {

    static void printLnum(int n,int count){
        if(count>n){
            return;
        }
        System.out.print(count);
        printLnum(n,count +1);
    }

    static void printRnum(int n){
        if(n==0){
            return;
        }
        System.out.print(n);
        printRnum(n-1);
    }
    static void printblank(int n){
        if(n<=0){return;}
        System.out.print(" ");
        printblank(n- 1);

    }

    static void LeftandRightnum(int n,int index){
        if(index >n){
            return;
        }
        printLnum(index,1);
        if(index<9){
            int count=9-index;
            printblank(4*(n-index)-(2*count));
        }
        else{
            printblank(4*(n-index));
        }
        printRnum(index);
        System.out.println(); 
        LeftandRightnum(n,index+1); 
    }

   public static void main(String[] args) {
    
    LeftandRightnum(25, 1);
   } 
}
