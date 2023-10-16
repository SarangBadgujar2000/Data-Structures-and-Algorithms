class Solution {
    public int firstMissingPositive(int[] nums) {
        for (int i = 0; i < nums.length; i++){
			if(nums[i] <= 0 ){
				nums[i] = nums.length+1;
			}
	    }

        for(int i = 0; i < nums.length; i++){
            int val = Math.abs(nums[i]);
            if(val >= 1 && val <= nums.length && nums[val - 1] > 0){
                nums[val - 1] = nums[val - 1] * -1;
            }
        }

        for (int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                return i + 1;
            }
        }
        System.gc();
	    return nums.length + 1;
    }
}