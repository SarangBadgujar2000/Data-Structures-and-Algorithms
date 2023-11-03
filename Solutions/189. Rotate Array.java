class Solution {
    public void rotate(int[] nums, int k) { 
        k=k%nums.length;
        reverse(nums,0,nums.length);
        reverse(nums,0,k);
        reverse(nums,k,nums.length+k);
        System.gc();
    }
    public void reverse(int[] nums,int start,int end){
        int temp=0;
        for(int i=start;i<end/2;i++){
            temp=nums[i];
            nums[i]=nums[end-i-1];
            nums[end-i-1]=temp;
        }
    }
    
}