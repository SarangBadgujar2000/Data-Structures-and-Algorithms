class Solution {
    public void pivote(int[] nums){
        int j=0;
        for(int i=nums.length-1;i>0;i--){
            if(nums[i]>nums[i-1]){
                j=i-1;
                break;
            } 
        }
        for(int i=nums.length-1;i>j;i--){
            if(nums[j]<nums[i]){
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                //System.out.println(j+1 +""+nums.length);
                Arrays.sort(nums,j+1,nums.length); 
                break;
            }
        }
    }
    public void nextPermutation(int[] nums) {
       int count=0;
       for(int i=0;i<nums.length-1;i++){
           if(nums[i]>=nums[i+1]){
               count++;
           }
       }
       if(count==nums.length-1){
           Arrays.sort(nums);
       }else{
            pivote(nums);
       } 
        
    }
}