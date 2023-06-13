public class permutationofstring {

    static void permu(String str, int start, int end)
    {
        if (start == end)
            {System.out.println(str);
                  return;}
        
            for (int i = start; i <= end; i++) {
                 str = swap(str, start, i);
                permu(str, start + 1, end);
              
        }
    } 

        static String swap(String str, int start, int i)
    {
        char temp;
        char[] charArray = str.toCharArray();
        temp = charArray[start];
        charArray[start] = charArray[i];
        charArray[i] = temp;
        return String.valueOf(charArray);
    }

    public static void main(String[] args)
    {
        String str = "ABC";
        int n = str.length();
        permu(str, 0, n - 1);
    }

}  

