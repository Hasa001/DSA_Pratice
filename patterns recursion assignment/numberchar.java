public class numberchar {

    static void printnum(int n,int count){
        if(n==0){
            return;
        }
        System.out.print(" "+count);
        printnum(n -1,count+1);
    }

    static void printupper(int n ,int index,int count){
         if(index >n ){
            return;
        }

        printnum(index,count);
        count=count+index;
        System.out.println();
        printupper(n,index +1,count);   
    }
  public static void main(String[] args) {
    printupper(5,1,1);
  }  
}
