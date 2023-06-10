public class powernofanum{
// recursion while build
    public static void pown(int n ,int p,int pow){
        if(p==0){
            System.out.println(pow);
            return;
        }
            pow=pow*n;
            pown(n,p-1,pow);
                   
}
// recursion on fall
    public static int pownum(int n,int p){
         if(p == 1){
            return n;
         }
         int pow=n*pownum(n,p-1);

         return pow;
    }
public static void main(String[] args) {
    System.out.println(pownum(2,5));
     pown(2,5,1);
}
}