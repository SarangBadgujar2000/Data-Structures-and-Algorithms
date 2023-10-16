class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] array = new int[2];
        Map <Integer,Integer> map = new HashMap<>();

        for(int i=0; i<nums.length;i++){
            int x=target-nums[i];
            if(map.containsKey(x)){
                array[0]=map.get(x);
                array[1]=i;
                return array;
            }
            map.put(nums[i],i);
            
        } 
        return array;
    }
}