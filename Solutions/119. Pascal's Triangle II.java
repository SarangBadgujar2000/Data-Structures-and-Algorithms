class Solution {
    public List<Integer> getRow(int row) {
        List<Integer> pre = new ArrayList<>(Arrays.asList(1,1));

        for(int i=1;i<row;i++){
            List<Integer> curr = new ArrayList<>();
            curr.add(1);
            for(int j=0;j<i;j++){
                curr.add(pre.get(j)+pre.get(j+1));
            }
            curr.add(1);
            pre=curr;
        }
        return row==0?new ArrayList(Arrays.asList(1)):pre;
    }
}