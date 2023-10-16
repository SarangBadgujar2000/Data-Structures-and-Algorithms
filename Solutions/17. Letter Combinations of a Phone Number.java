class Solution {
    public void backTrack(String digits,HashMap<Character,String> map,int currLevel,StringBuilder sb,List<String> ans){
        if(currLevel==digits.length()){
            ans.add(sb.toString());
            return;
        }
        
        String keys=map.get(digits.charAt(currLevel));

        for(int i=0;i<keys.length();i++){
            sb.append(keys.charAt(i));
            backTrack(digits,map,currLevel+1,sb,ans);
            sb.deleteCharAt(sb.length()-1);
        }
    }
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0) return new ArrayList<>();
        List<String> ans = new ArrayList<>();
        HashMap<Character,String> map=new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        backTrack(digits,map,0,new StringBuilder(),ans);
        return ans;
    }
}