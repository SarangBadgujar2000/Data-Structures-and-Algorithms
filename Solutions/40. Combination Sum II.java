class Solution {
    public void backTracking(int idx,int[] candidates, int target,List<List<Integer>> ans,List<Integer> temp){
        if(target<=0){
            if(target==0){               
                ans.add(new ArrayList<>(temp));  
            }
            return;
        }
        for(int i=idx;i<candidates.length;i++){
            // if(i>idx && candidates[i]==candidates[i-1] ){
            //     continue;
            // }
            if(i==idx || candidates[i]!=candidates[i-1]){
                if(target-candidates[i]<0) break;
                temp.add(candidates[i]);
                backTracking(i+1,candidates,target-candidates[i],ans,temp);
                temp.remove(temp.size()-1);
            }
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        backTracking(0,candidates,target,ans,new ArrayList<>());
        return ans;
    }
}