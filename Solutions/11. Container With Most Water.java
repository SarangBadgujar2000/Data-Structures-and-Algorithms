class Solution {
    public int maxArea(int[] height) {
        int currMax=0;
        int max=0;
        int left=0;
        int right=height.length-1;
        while(left<=right){
            currMax=0;
            currMax=Math.min(height[left],height[right])*(right-left);
            if(currMax>max){
                max=currMax;
            }
            if(height[left]<=height[right]){
                left++;
            }else{
                right--;
            }
        }
        return max;
    }
}