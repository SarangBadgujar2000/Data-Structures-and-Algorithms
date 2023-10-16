class Solution {
    public void permutation(int[] num,List<List<Integer>> ans,List<Integer> temp){
       
        if(temp.size()==num.length){
            ans.add(new ArrayList(temp));
            return;
        }
        
        for(int i=0;i<num.length;i++){
            if(num[i]!=11){
                temp.add(num[i]);
                int k=num[i];
                num[i]=11;
                //System.out.println(temp);
                permutation(num,ans,temp);
                num[i]=k;
                temp.remove(temp.size()-1);
                //System.out.println(temp);
            }
            
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        permutation(nums,ans,new ArrayList<>());
        return ans;
    }
}