class Solution {
    public int trap(int[] height) {
        int count=0;
        

        for(int i=0;i<height.length;i++){
            int leftmax=0;
            int rightmax=0;
            for(int j=0;j<=i;j++){
                leftmax=Math.max(height[j],leftmax);
                /*if(currentleftmax<leftmax){
                    currentleftmax=leftmax;
                }*/
            }
            for(int j=i;j<height.length;j++){
                rightmax=Math.max(height[j],rightmax);
                /*if(currentrightmax<rightmax){
                    currentrightmax=rightmax;
                }*/
            }
            count += Math.min(leftmax,rightmax)-height[i];
        }
        return count;        
    }
}