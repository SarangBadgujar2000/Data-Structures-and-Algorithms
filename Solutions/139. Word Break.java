class Solution {
    private Boolean[] memoization;
    public boolean helper(String s,int idx, HashSet<String> set){
        if(idx==s.length()){
            return true;
        }
        if(memoization[idx] != null){
            return memoization[idx];
        }
        
        for( int i=idx;i<s.length();i++){
            String word=s.substring(idx,i+1);
            if(set.contains(word) && helper(s,i+1,set)){
                return memoization[idx]=true;
            }
        }
        return memoization[idx]=false;

    }
    public boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> set=new HashSet<>();
        memoization=new Boolean[s.length()];

        for(String i:wordDict){
            set.add(i);
        }
        return helper(s,0,set);
    }
}