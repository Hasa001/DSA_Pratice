public class starsquare{
   static void printStar(int n){
     if(n == 0){
        return;
     }
     System.out.print('*');
     printStar(n-1);
   }
    static void squarePattern(int row,int col){
       if(row == 0 ){
        return;
       }
       squarePattern(row -1,col);
       printStar(col);
       System.out.println();
       
    }
    public static void main(String[] args) {
        squarePattern(5,5);
    }
}