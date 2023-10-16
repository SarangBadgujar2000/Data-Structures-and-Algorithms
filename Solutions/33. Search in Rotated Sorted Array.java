class Solution {
    public int pivote(int[] nums){
        int start=0;
        int end=nums.length-1;
        int mid=start+(end-start)/2;
        while(start<=end){
            mid=start+(end-start)/2;
            if(nums[start]<nums[end]){
                return start;
            }
            int pre=(mid-1+nums.length)%nums.length;
            int next=(mid+1)%nums.length;
            if(nums[mid]<nums[pre] && nums[mid]<nums[next]){
                return mid;
            }else if(nums[mid]>nums[end]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return mid;
    }
    public int binarySearch(int[] nums, int target,int start,int end){
        int mid=-1;
        while(start<=end){
            mid=start+(end-start)/2;
            if(nums[mid]==target) return mid;
            if(nums[mid]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        int pivote=pivote(nums);
        int ans=-1;
        ans=binarySearch(nums,target,0,pivote-1);
        if(ans!=-1) return ans;
        return binarySearch(nums,target,pivote,nums.length-1);
    }
}