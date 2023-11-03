class Solution {
    public String reverseWords(String s) {
        StringBuilder ans=new StringBuilder();
        StringBuilder temp=new StringBuilder();
        temp.append(s);
        temp.reverse();
        int l=0;
        int h=0;
        String word="";

        while(h<temp.length()){
            if(temp.charAt(h)!=' '){
                h++;
            }else{
                word="";
                if(temp.charAt(h)==' ' && l==h){
                    l++;
                    h++;
                    continue;
                }
                for(int j=h-1;j>=l;j--){
                    word+=temp.charAt(j);
                }
                ans.append(word);
                h=h+1;
                l=h;
                while(h<temp.length() && temp.charAt(h)==' '){
                    l++;
                    h++;
                }
                if(h!=temp.length()){
                    ans.append(" ");
                }
            }
        }
        word="";
        for(int j=h-1;j>=l;j--){
            word+=temp.charAt(j);
        }
        ans.append(word);
        return ans.toString();
    }
}