class Solution {
    public int largestRectangleArea(int[] ht) {
        int[] leftMin = new int[ht.length];
        int[] rightMin = new int[ht.length];

        Stack<Integer> st = new Stack<>();

        for(int i=0;i<ht.length;i++){
            while(!st.isEmpty() && ht[i]<=ht[st.peek()]){
                st.pop();
            }
            if(!st.isEmpty()){
                leftMin[i]=st.peek();
            }else{
                leftMin[i]=-1;
            }
            st.push(i);
        }
        st.clear();
        for(int i=ht.length-1;i>=0;i--){
            while(!st.isEmpty() && ht[i]<=ht[st.peek()]){
                st.pop();
            }
            if(!st.isEmpty()){
                rightMin[i]=st.peek();
            }else{
                rightMin[i]=ht.length;
            }
            st.push(i);
        }
        int maxArea=ht[0];
        for(int i=0;i<ht.length;i++){
            maxArea=Math.max(maxArea,ht[i]*(rightMin[i]-leftMin[i]-1));
        }
        return maxArea;
    }
}