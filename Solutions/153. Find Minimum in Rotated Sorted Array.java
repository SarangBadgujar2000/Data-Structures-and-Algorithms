class Solution {
    public int findMin(int[] nums) {
        int start=0;
        int end=nums.length-1;
        int N=nums.length;
        int mid=0;;
        int next;
        int prev;
        while(start<=end){
            mid=start+(end-start)/2;
            if(nums[start]<=nums[end]){
                return nums[start];
            }
            next=(mid+1)%N;
            prev=(mid-1+N)%N;
            if(nums[mid]<nums[next] && nums[mid]<nums[prev]){
                return nums[mid];
            }
            else if(nums[mid]>=nums[start]){
                start=mid+1;
            }
            else if(nums[mid]<nums[end]){
                end=mid-1;
            }
        }
        return nums[mid];
    }
}