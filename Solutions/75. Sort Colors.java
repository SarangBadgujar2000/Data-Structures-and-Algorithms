class Solution {
    public void sortColors(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            int lowest=i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]<nums[lowest]){
                    lowest=j;
                }
            }
            if(lowest!=i){
                int temp=nums[i];
                nums[i]=nums[lowest];
                nums[lowest]=temp; 
            }
        }
    }
}