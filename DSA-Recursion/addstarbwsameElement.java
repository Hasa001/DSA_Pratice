public class addstarbwsameElement {

    static void addStarBWsameE(String s,int index,String newstr){
        if(index == s.length()){
            System.out.println(newstr);
            return;
        }

        if(index == 0){
            newstr=newstr+s.charAt(0);
        }
         else{
              if(s.charAt(index)==s.charAt(index-1)){
                  newstr=newstr+'*'+s.charAt(index);
             }
              else{
                  newstr=newstr+s.charAt(index);
             }
        }
        addStarBWsameE(s, index +1, newstr);
    }
    public static void main(String[] args) {
        addStarBWsameE("aabbcc", 0, "");
    }
}
