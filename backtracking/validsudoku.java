public class validsudoku {

    static boolean isValid(int board[][],int row ,int col,int val){
        //checking row
        for(int i=row+1;i<8;i++){
            if(board[i][col]== val){
                return false;
            }
        }

        //checking col
        for(int i=0;i<=8;i++){
            if(board[row][i]== val && i != col){
                return false;
            }
        }
        //checking 3 x 3 grid
    int sr=(row/3)*3;
    int sc=(col/3)*3;

        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if(board[i][j] == val && j != col){
                    return false;
                }
            }
        }
        return true;
    }
    static boolean checkSudoku(int board[][],int row){
      if(row==9){return true;}
     for(int i=0;i<=8;i++){
        if(board[row][i] !=0){

           if(isValid(board, row,i,board[row][i] )){
           }
           else{System.out.println(row);return false;}
        // System.out.println(result);
        }
     }     
          return checkSudoku(board,row+1);
    }


    static void printboard(int board[][]){

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }       
    }
    public static void main(String[] args) {
        int board[][] ={{5,3,0,0,7,0,0,0,0},{6,0,0,1,9,5,0,0,0},{0,9,8,0,0,0,0,6,0},{8,0,0,0,6,0,0,0,3},{4,0,0,8,0,3,0,0,1},{7,0,0,0,2,0,0,0,6},{0,6,0,0,0,0,2,8,0},{0,0,0,4,1,9,0,0,5},{0,0,0,0,8,0,0,7,9}};


        // char ch='4';
        // int i= (ch-'0');
        // System.out.println(ch+" -> "+i);
        //  printboard(board);

           System.out.print( checkSudoku(board,0));
    }
}
