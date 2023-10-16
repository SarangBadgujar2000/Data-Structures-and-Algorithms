class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        if(grid[m-1][n-1]==1) return 0;
        int[][] dp=new int[m][n];
        boolean flag1=true;
        boolean flag2=true;
        for(int i=n-1;i>=0;i--){
            if(grid[m-1][i]==0  && flag1){
                dp[m-1][i]=1;
            }else{
                flag1=false;
                dp[m-1][i]=0;
            }
        }
        for(int j=m-1;j>=0;j--){
            if(grid[j][n-1]==0 && flag2){
                dp[j][n-1]=1;
            }else{
                flag2=false;
                dp[j][n-1]=0;
            }
        }
        for(int i=m-2;i>=0;i--){
            for(int j=n-2;j>=0;j--){
                if(grid[i][j]==1){
                    dp[i][j]=0;
                }else{
                    dp[i][j]=dp[i+1][j]+dp[i][j+1];
                }
            }
        }        
        return dp[0][0];
    }
}