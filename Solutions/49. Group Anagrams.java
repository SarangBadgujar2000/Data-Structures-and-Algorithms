class Solution {
    public String getKey(String s){
        char[] arr=new char[26];
        for(char i:s.toCharArray()){
            arr[i-'a']++;
        }
        return new String(arr);
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(String c : strs){
            String key=getKey(c);
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<String>());
            }
            map.get(key).add(c);
        }
        return new ArrayList<>(map.values());
    }
}