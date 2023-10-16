class Solution {
    public void recursion(int[] nums, int index, List<Integer> temp, List<List<Integer>> ans) {
        ans.add(new ArrayList<>(temp));  // Add a copy of temp to ans

        for (int i = index; i < nums.length; i++) {
            temp.add(nums[i]);
            recursion(nums, i + 1, temp, ans);
            temp.remove(temp.size() - 1);
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        // for(int i=0;i<nums.length;i++){
        //     List<Integer> temp = new ArrayList<>();
        //     recursion(nums,0,temp,ans);
        //     //ans.add(temp);
        // }
        List<Integer> temp = new ArrayList<>();
        recursion(nums,0,temp,ans);
        return ans;
    }
}