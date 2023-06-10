public class sumofnnum {
// recursion during build
static void sumofn(int n,int sum){
    if(n == 1){
        System.out.println(sum+1);
        return;
    }

    sum= sum+n;
    sumofn(n-1,sum);

}

// recursion during fall
static int sumofnaturaln(int n){
    if(n == 1){
    return 1;
    }
    return n+sumofnaturaln(n-1);
}
    public static void main(String[] args) {
        sumofn(5,0);
        System.out.println(sumofnaturaln(5));
        
    }
}
