public class mazepathproblem3 {

    static void getMazePos(int currentRow , int currentCol, int endRow, int endCol,String path){

        // Positive Case
        if(currentCol == endCol && currentRow == endRow){
                System.out.println(path);
            return ;
        }
        // Negative Case
        if(currentCol>endCol || currentRow>endRow){

            return ;
        }
        
        path=path+"R";
        getMazePos(currentRow, currentCol+1, endRow, endCol,path);

        path=path.substring(0, path.length()-1);
        path=path+"D";
        getMazePos(currentRow+1, currentCol, endRow, endCol,path);

        path=path.substring(0, path.length()-1);
        path=path+"T";
        getMazePos(currentRow+1, currentCol+1, endRow, endCol,path);
    }
    public static void main(String[] args) {
        getMazePos(0, 0, 2, 2, "");
    }
}
