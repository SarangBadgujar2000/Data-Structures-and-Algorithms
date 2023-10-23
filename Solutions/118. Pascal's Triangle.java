class Solution {
    public List<List<Integer>> generate(int numRows) {
        if(numRows==0)return new ArrayList<>();
        List<List<Integer>> ans =new ArrayList<>();
        ans.add(Arrays.asList(1));
        if(numRows==1)return ans;
        ans.add(Arrays.asList(1,1));
        for(int i=2;i<numRows;i++){
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            for(int j=1;j<i;j++){
                temp.add(ans.get(i-1).get(j-1) + ans.get(i-1).get(j));
            }
            temp.add(1);
            ans.add(temp);            
        }
        return ans;
    }
}