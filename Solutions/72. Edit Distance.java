class Solution {
    public int recursion(String word1, String word2,int i,int j,int[][] dp){
        if(i<0) return j+1;
        if(j<0) return i+1;
        if(dp[i][j]>-1) return dp[i][j];
        int ans=Integer.MAX_VALUE;
        int ans1=Integer.MAX_VALUE;

        if(word1.charAt(i)==word2.charAt(j)){
            ans=recursion(word1,word2,i-1,j-1,dp);
        }else{
            int ans2=1+recursion(word1,word2,i-1,j,dp);
            int ans3=1+recursion(word1,word2,i,j-1,dp);
            int ans4=1+recursion(word1,word2,i-1,j-1,dp);
            ans1=Math.min(ans2,Math.min(ans3,ans4));
        }
        dp[i][j]=Math.min(ans,ans1);
        return Math.min(ans,ans1);
    }
    public int minDistance(String word1, String word2) {
        int[][] dp = new int[word1.length()][word2.length()];
        for(int[] row :dp){
            Arrays.fill(row,-1);
        }
        return recursion(word1,word2,word1.length()-1,word2.length()-1,dp);
    }
}