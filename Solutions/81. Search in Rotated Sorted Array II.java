class Solution {
    public int pivote(int[] nums){
        int left=0;
        int right=nums.length-1;
        while(left<right){
            while(left< right && nums[left]==nums[left+1]){
                left++;
            }
            while(left< right && nums[right]==nums[right-1]){
                right--;
            }
            int mid=left+(right-left)/2;
            int pre=(mid-1+nums.length)%nums.length;
            int next=(mid+1)%nums.length;

            if(nums[mid]<nums[pre] && nums[mid]<nums[next]){
                return mid;
            }
            if(nums[mid]>nums[right]){
                left=mid+1;
            }else{
                right=mid;
            }
        }
        return right;
    }
    public boolean binarySearch(int[] nums,int target,int left,int right){
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target) return true;
            if(nums[mid]>target){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return false;
    }
    public boolean search(int[] nums, int target) {
        int pivote=pivote(nums);
        System.out.println(pivote);
        return binarySearch(nums,target,0,pivote-1) || binarySearch(nums,target,pivote,nums.length-1);
    }
}