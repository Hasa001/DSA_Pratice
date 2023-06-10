public class primechecker {
    static void isPrime(int num,int i){
        if(i > num/2){
            System.out.println(true);
        return;}
        
        if(num % i == 0){
            System.out.println(false);
            return;
        }
        isPrime(num,i+1);
    }

    static boolean isprime(int n,int i){
        if(n%i == 0){
            return false;
        }
        if(i>n/2){
            return true;
        }
        
        return isprime(n,i+1);

    }


    public static void main(String[] args) {
        isPrime(6,2);
        
        System.out.println(isprime(6,2));
    }
}
