class Solution {
    public void permute(List<List<Integer>> ans,int[] nums,List<Integer> temp,boolean[] visited){
        if(temp.size()==nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }

        for(int i=0;i<nums.length;i++){
            if( i>0 && visited[i-1]!=true && nums[i]==nums[i-1] ){
                continue;
            }
            if(visited[i]==true){
                continue;
            }
            visited[i]=true;
            temp.add(nums[i]);
            permute(ans,nums,temp,visited);
            temp.remove(temp.size()-1);
            visited[i]=false;
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        boolean[] visited=new boolean[nums.length];
        permute(ans,nums,new ArrayList<>(),visited);
        return ans;
    }
}