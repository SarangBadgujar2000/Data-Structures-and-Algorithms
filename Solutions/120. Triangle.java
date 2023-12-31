class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int[] temp=new int[triangle.size()];
        for(int i=0;i<triangle.size();i++){
            temp[i]=triangle.get(triangle.size()-1).get(i);
        }
        for(int i=triangle.size()-2;i>=0;i--){
            for(int j=0;j<=i;j++){
                temp[j]=triangle.get(i).get(j)+Math.min(temp[j],temp[j+1]);
            }
        }
        return temp[0];
    }
}