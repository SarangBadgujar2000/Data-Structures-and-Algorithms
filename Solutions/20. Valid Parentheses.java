class Solution {
    public boolean isValid(String s) {
    //     Stack<Character> stack = new Stack<Character>();
    //     for(int i=0;i<s.length();i++){
    //         if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
    //             stack.push(s.charAt(i));
    //         }else {
    //             if(stack.empty()) {
    //                 return false;
    //             }else if(s.charAt(i)==')'&& stack.peek()!='(' || s.charAt(i)==']' && stack.peek()!='[' || s.charAt(i)=='}'&& stack.peek()!='{'){
    //                 return false;
    //             }
    //             stack.pop();
    //         }
    //     }
        
    //     return stack.empty() ? true : false;
    // }
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '('){
                stack.push(')');
            }else if(c == '{'){
                stack.push('}');
            }else if(c == '['){
                stack.push(']');
            }else if(stack.isEmpty() || stack.pop() != c){
                return false;
            }
        }
        return stack.isEmpty();
    }

}