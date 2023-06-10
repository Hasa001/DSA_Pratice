public class ndivnpown {
// recursion during build
static void patternway1(int n , double sum){
    if(n == 0){
        System.out.println(sum);
        return;
    }
    sum=sum + (n/Math.pow(n,n));
    patternway1(n-1, sum);
}
// recursion during fall
static double patternway2(int n){
    if(n == 0){
        return 0;
    }
   double sum= (n/Math.pow(n,n))+patternway2(n-1);

   return sum;
}
    public static void main(String[] args) {
        patternway1(3,0);
        System.out.println(patternway2(3));
    }
}
