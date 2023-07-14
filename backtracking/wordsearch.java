public class wordsearch {

    static boolean helper(char[][] board,int i,int j,int k,String ch){

        if(k == ch.length()){
            return true;
        }
    
        if(i==board.length){
            return false;
        }


        board[i][j]='.';

         
        if(i!=0 && board[i-1][j]==ch.charAt(k)&& board[i-1][j]!='.'){

         return helper(board, i-1, j, k+1, ch);

        }
        else if(j!=board[i].length-1 && board[i][j+1]==ch.charAt(k)&& board[i][j+1]!='.'){
            
          return helper(board, i, j+1, k+1, ch);
        }
        else if(i!=board.length-1 && board[i+1][j]==ch.charAt(k)&& board[i+1][j]!='.'){
            
         return helper(board, i+1, j, k+1, ch);
        }
        else if (j != 0 && board[i][j-1]== ch.charAt(k)&& board[i][j-1]!= '.'){
            
         return helper(board, i, j-1, k+1, ch);
        }

        board[i][j]=ch.charAt(k-1);
        return false ;

    }
    static boolean exist(char[][] board, String word){

        for(int i=0;i<board.length;i++){
          for(int j=0;j<board[0].length;j++){
          if(word.charAt(0)==board[i][j]){
             if(helper(board,i,j,1,word)){return true;}}
    }
 }
      
       return false;
    }

    public static void main(String[] args) {
            char board[][]={{'A','F','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
            System.out.print(exist(board,"ADEE"));

         } 
    }

