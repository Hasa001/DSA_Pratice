public class countzeroinnum {
// recursion during build
    static void countzero(int num,int count){
           if(num==0){
                System.out.println(count);
                return;
           }
            int dig = num%10;
            if(dig == 0){
                count++;
            }
            countzero(num/10,count);
    }

//recursino during fall
    static int countO(int num){
        if(num == 0){
            return 0;
        }
        
        int dig=num%10;
        if(dig == 0){
            return 1+countO(num/10);
        }
        else{return countO(num/10);}

    }
     public static void main(String[] args) {
        countzero(102030,0);
        System.out.println(countO(102030));
     }
    
}
