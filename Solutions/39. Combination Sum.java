class Solution {
    public void backTracking(int idx,int[] candidates,int target, List<List<Integer>> ans,List<Integer> temp){
        if(target<=0){
            if(target==0){
                ans.add(new ArrayList<>(temp));
            }
            return;
        }
        for(int i=idx;i<candidates.length;i++){
            temp.add(candidates[i]);
            backTracking(i,candidates,target-candidates[i],ans,temp);
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        backTracking(0,candidates,target,ans,new ArrayList<>());
        return ans;
    }
}