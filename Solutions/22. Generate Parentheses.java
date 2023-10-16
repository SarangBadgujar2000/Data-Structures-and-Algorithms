class Solution {
    public void generate(int n,int open,int close, List<String> ans, StringBuilder sb){
        if(open==close && open==n){
            ans.add(sb.toString());
            return;
        }
        if(open<n){
            sb.append('(');
            generate(n,open+1,close,ans,sb);
            sb.deleteCharAt(sb.length()-1);
        }
        if(open>close && open<=n){
            sb.append(')');
            generate(n,open,close+1,ans,sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        generate(n,0,0,ans,new StringBuilder());
        return ans;
    }
}