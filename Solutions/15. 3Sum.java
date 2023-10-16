class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>>  list = new ArrayList<>();   
        Arrays.sort(nums);        //nlogn
        boolean ans;
        for(int i=0;i<nums.length;i++){
            if(i==0 || (i>0 && nums[i]!=nums[i-1])){

            
                int left=i+1;
                int right=nums.length-1;
                while(left<right){
                    
                    if(nums[i]+nums[left]+nums[right]==0){
                        list.add(Arrays.asList(nums[i], nums[left], nums[right]));
                        while(left < right && nums[left] == nums[left+1]) left++;
                        while(left < right && nums[right] == nums[right - 1]) right--;
                        
                        left++;
                        right--;                 
                    }
                    else if (nums[i]+nums[left]+nums[right]>0){
                        right--;
                    }
                    else if(nums[i]+nums[left]+nums[right]<0){
                        left++;
                    }
                }
            }
        }
        return list;
    }
}