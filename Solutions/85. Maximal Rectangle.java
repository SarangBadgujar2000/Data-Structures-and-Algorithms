class Solution {
    public int maximalHistogram(int[] temp,int col){
        Stack<Integer> st=new Stack<>();
        int[] lse=new int[col];
        int[] rse=new int[col];

        for(int i=0;i<col;i++){
            while(!st.isEmpty() && temp[i]<=temp[st.peek()]){
                st.pop();
            }
            lse[i]=st.isEmpty()?-1:st.peek();
            st.push(i);
        }

        st.clear();

        for(int i=col-1;i>=0;i--){
            while(!st.isEmpty() && temp[i]<=temp[st.peek()]){
                st.pop();
            }
            rse[i]=st.isEmpty()?col:st.peek();
            st.push(i);
        }
        int maxRectangle =0;
        for(int i=0;i<col;i++){
            maxRectangle=Math.max(maxRectangle,temp[i]*(rse[i]-lse[i]-1));
        }

        return maxRectangle;

    }
    public int maximalRectangle(char[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        int[] temp=new int[col];
        int maxArea=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]=='1'){
                    temp[j]+=1;
                }else{
                    temp[j]=0;
                }
            }
            maxArea=Math.max(maxArea,maximalHistogram(temp,col));
        }
        return maxArea;        
    }
}