public class checkpalindrome {
    static String reverse(String str){
        if(str == ""){
            return "";
        }
        String newstr=str.charAt(str.length()-1)+reverse(str.substring(0,str.length()-1));
        return newstr;
    }
    static void checkpalin(String s){
         if(s.equals(reverse(s))){
            System.out.println("a palindrome");
         }
         else{System.out.println(" not a palindrome");}
    }

    public static void main(String[] args) {
        System.out.println(reverse("harshit"));
        checkpalin("harshit");
    }
}
