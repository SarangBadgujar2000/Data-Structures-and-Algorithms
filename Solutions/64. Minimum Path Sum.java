class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][] dp=new int[m][n];
        dp[m-1][n-1]=grid[m-1][n-1];
        for(int i=n-2;i>=0;i--){
            //grid[m-1][i]+=grid[m-1][i+1];
            dp[m-1][i]=grid[m-1][i]+dp[m-1][i+1];
        }
        for(int j=m-2;j>=0;j--){
            //grid[j][n-1]+=grid[j+1][n-1];
            dp[j][n-1]=grid[j][n-1]+dp[j+1][n-1];
        }
        for(int i=m-2;i>=0;i--){
            for(int j=n-2;j>=0;j--){
                dp[i][j]=grid[i][j]+Math.min(dp[i+1][j],dp[i][j+1]);
            }
        }
        return dp[0][0];
    }
}