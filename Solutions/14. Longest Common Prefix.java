class Solution {
    public String longestCommonPrefix(String[] strs) {
        int min=Integer.MAX_VALUE;
        String s="";
        if(strs.length==1) return strs[0];
        for(int i=0;i<strs.length;i++){
            min=Math.min(strs[i].length(),min);
        }
        for(int i=0;i<min;i++){
            for(int j=1;j<strs.length;j++){
                if(strs[0].charAt(i)!=(strs[j].charAt(i))){
                   return s;
                }
            }
            s=""+s+strs[0].charAt(i);
        }
        Runtime.getRuntime().gc();
        System.gc();
        return s; 
    }
}