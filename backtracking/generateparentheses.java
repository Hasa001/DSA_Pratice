public class generateparentheses {

    public static void parentheses(int n,int ocount,int ccount,String str){
        if(str.length() == 2*n){
            System.out.println(str);
            return;
        }
        if(ocount <n){
            str= str+"(";
            parentheses(n, ocount+1, ccount, str);
            str=str.substring(0,str.length()-1);
            
        }
        if(ccount <ocount){
            str=str+")";
            parentheses(n,ocount,ccount+1,str);
            // str=str.substring(0,str.length()-1);
            
        }
        // ocount--;
        // ccount--;
        //   ocount=ocount-1;
    } 
    public static void main(String[] args) {
        parentheses(5, 0, 0,"");
    }
}