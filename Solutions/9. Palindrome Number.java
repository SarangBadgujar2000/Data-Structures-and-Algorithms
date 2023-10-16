class Solution {
    public boolean isPalindrome(int x) {
        // String s=String.valueOf(x);//convart int into string & then traverse
        // int n=s.length();
        // for(int i=0;i<n/2;i++){
        //     if(s.charAt(i)!=s.charAt(n-i-1)){
        //         return false;
        //     }
        // }
        // return true;
        int n=x;
        int temp=0;
        while(n>0){
            temp=temp*10+n%10;
            n=n/10;
        }
        return temp==x;
    }
}