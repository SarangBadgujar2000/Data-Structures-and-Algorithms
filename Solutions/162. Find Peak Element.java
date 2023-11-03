class Solution {
    public int findPeakElement(int[] nums) {
        int start=1;
        int end=nums.length-2;
        int mid=0;
        if(nums.length==1) return 0;
        if(nums[0]>nums[1]){
            return 0;
        }else if(nums[nums.length-1]>nums[nums.length-2]){
            return nums.length-1;
        }
        while(start<=end){
            mid=start+(end-start)/2;
            // int pre=(mid-1+nums.length)%nums.length;
            // int next=(mid+1)%nums.length;
            if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]){
                return mid;
            }else if(nums[mid+1]>nums[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return mid;
    }
}