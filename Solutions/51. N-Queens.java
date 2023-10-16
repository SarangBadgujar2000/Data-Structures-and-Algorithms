class Solution {
    public void recursion(char[][] board,int row,int n,List<List<String>> ans){
        if(board.length==row){
        //     List<String> list = new ArrayList<>();
        //     for(int i=0;i<n;i++){
        //         String temp="";
        //         for(int j=0;j<n;j++){
        //             temp+=board[i][j];
        //         }
        //         list.add(temp);
        //     }
        //     ans.add(list);
        //     return ;
        // }
            List<String> list = new ArrayList<>();
            for(char[] ch:board){
                String str = new String(ch);
                list.add(str);
            }
            ans.add(list);
            return ;
        }
        for(int col=0;col<n;col++){
            if(isSafeToPlace(board,row,col,n)){
                board[row][col]='Q';
                recursion(board,row+1,n,ans);
                board[row][col]='.'; //backtrack    
            } 
        }
        return ;
    }
    public boolean isSafeToPlace(char[][] board,int row,int col,int n){
        for(int i=row;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        int row1=row;
        int col1=col;
        while(row1>=0 && col1>=0){
            if(board[row1--][col1--]=='Q'){
                return false;
            }
        }
        row1=row;
        col1=col;
        while(row1>=0 && col1<n){
            if(board[row1--][col1++]=='Q'){
                return false;
            }
        }
        return true;
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans=new ArrayList<>();
        char[][] board = new char[n][n];
        for(char[] row:board){
            Arrays.fill(row,'.');
        }
        recursion(board,0,n,ans);
        return ans;
    }
}