//import java.util.ArrayList;

public class diceboardproblem2 {

    static void diceGame(int currentValue, int endValue,String result){
        if(currentValue == endValue ){
          System.out.println(result);

             return ;
        }

        if(currentValue>endValue){
            return ;
        }
        for(int dice = 1; dice<=6; dice++){
            int newValue = currentValue + dice;
            if(newValue<=endValue){
            result = result +dice ;}
            diceGame(newValue, endValue,result); 
            
            if(result.length()>=1){
                result=result.substring(0,result.length()-1);
             }
        }
    }

    public static void main(String[] args) {
         diceGame(0,10,"");
    }
}
    

