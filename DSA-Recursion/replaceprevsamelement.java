public class replaceprevsamelement {

    static void replaceRepElem(String s,int index,String nstring){
        if(index == s.length()){
            System.out.println(nstring);
            return;
        }
        if(index == 0){
            nstring = nstring+s.charAt(0);
        }  
        else{
             if(s.charAt(index)== s.charAt(index-1) ){
                 nstring=nstring+"#";
             }
             else{
               //  prev = s.charAt(index);
                 nstring=nstring+s.charAt(index);
             }
        }
        replaceRepElem(s,index + 1 , nstring);
        return;
    }
    public static void main(String[] args) {
        String s="aaaabbcc",nstr=""; 
        replaceRepElem(s,0,nstr);
    }
}
