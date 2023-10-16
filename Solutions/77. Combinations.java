class Solution {
    public void backTracking(int n,int k, int idx,List<List<Integer>> ans,ArrayList<Integer> temp){
        if(temp.size()==k){
            ans.add(new ArrayList<>(temp));
            return;
        }

        for(int i=idx;i<=n;i++){
            temp.add(i);
            backTracking(n,k,i+1,ans,temp);
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans=new ArrayList<>();
        backTracking(n,k,1,ans,new ArrayList<>());
        return ans;
    }
}