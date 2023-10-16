class Solution {
    public int helper(int n,int[] memo){
        if(n==0) return 1;
        if(n<0) return 0;
        if(memo[n]!=-1){
            return memo[n];
        }

        int step1=helper(n-1,memo);
        int step2=helper(n-2,memo);
        memo[n]=step1+step2;
        return step1+step2;
    }
    public int climbStairs(int n) {
        int[] memo = new int[n+1];
        Arrays.fill(memo,-1);
        return helper(n,memo);    
    }
}