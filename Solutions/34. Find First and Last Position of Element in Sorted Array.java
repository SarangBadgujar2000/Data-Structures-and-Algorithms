class Solution {
    public int[] searchRange(int[] nums, int target) {
        int [] arr = new int[2];
        arr[0]=-1;
        arr[1]=-1;
        int start=0;
        int end=nums.length-1;
        int mid;
        while(start<=end){
            mid=start+(end-start)/2;
            if(nums[mid]==target){
                arr[0]=mid;
                end=mid-1;
            }
            else if(nums[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        start=0;
        end=nums.length-1;
        
        while(start<=end){
            mid=start+(end-start)/2;
            if(nums[mid]==target){
                arr[1]=mid;
                start=mid+1;            }
            else if(nums[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }

            return arr;
        
    }
}