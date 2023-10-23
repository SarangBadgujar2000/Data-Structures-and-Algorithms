class Solution {
    public boolean isValidCharacter(char ch){
        if((ch >='a' && ch<='z')||(ch >='A' && ch<='Z')|| (ch>='0' && ch<='9')){
            return true;
        }
        return false;
    }
    public boolean isPalindrome(String s) {
        int low=0;
        int high=s.length()-1;
        while(low<high){
            if(!isValidCharacter(s.charAt(low))){
                low++;
            }else if(!isValidCharacter(s.charAt(high))){
                high--;
            }else if(Character.toLowerCase(s.charAt(low++))!=Character.toLowerCase(s.charAt(high--))){
                return false;
            }
        }
        return true;
    }
}