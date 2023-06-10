public class checkarmstrong {

    static void checkarm(int num,int nsum,int onum){
        if(num == 0){
            if(nsum == onum){
                System.out.println(onum +" is an armstrong number ");
            }
            else{System.out.println(onum +" is not an armstrong number ");}

            return;
        }

        nsum=nsum+(int)Math.pow(num%10,3);
         checkarm(num/10,nsum,onum);
         return;
    }

    static boolean checkArmstrong(int num,int sum){
        if(num == 0){
            return false;
        }
        boolean checker=checkArmstrong(num/10,sum);
        sum=(int)Math.pow(num%10,3)+sum;
        if(sum == num){
            checker=true;
        }        
       return checker;

    }
    
    public static void main(String[] args) {
     checkarm(153,0,153);

        if(checkArmstrong(152,0)){
            System.out.println("it is an armstrong number");
        }
        else{System.out.println("it is not an armstrong number");}
    }
}
