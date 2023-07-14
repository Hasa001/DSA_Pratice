public class nqueen{


static boolean isSafe(char board[][],int row ,int col){

    // checking row
    for(int i=row-1;i>=0;i--){
           if(board[i][col] == 'Q'){
            return false;
           }
    }
     
    // checking left diagonal
    for(int i=row-1,j=col+1;i>=0 && j<board[0].length ;i--,j++){
             if(board[i][j]=='Q'){
                return false;
             }
    }

    for(int i=row-1,j=col-1;i>=0 && j>=0 ;i--,j--){
             if(board[i][j]=='Q'){
                return false;
             }
    }

    return true;
}
    static void Nqueen(char board[][],int n){
         if(n== board.length){
            printboard(board);
            System.out.println();
            return;
         }
         
        for(int i=0;i<board[0].length;i++){

            if(isSafe(board,n,i)){
            board[n][i]='Q';
            Nqueen(board, n+1);
            board[n][i]='.';
        }
        }
    }


    static void printboard(char board[][]){

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }       
    }

    public static void main(String[] args) {
        int n=9;
        char board[][]=new char[n][n];

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                board[i][j]='.';
            }
        }

        Nqueen(board, 0);
    }
}