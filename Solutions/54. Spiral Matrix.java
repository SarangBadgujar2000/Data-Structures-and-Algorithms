class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list=new ArrayList<Integer>();
        int n = matrix.length;
        int m = matrix[0].length;
        int sr=0;
        int sc=0;
        int er=n-1;
        int ec=m-1;
        int count=0;
        int x=n*m;
        while(count<x){
            for(int col=sc;col<=ec && count<x;col++){
                list.add(matrix[sr][col]);
                count++;
            }
            sr++;
            for(int row=sr;row<=er && count<x;row++){
                list.add(matrix[row][ec]);
                count++;
            }
            ec--;
            for(int col=ec;col>=sc && count<x;col--){
                list.add(matrix[er][col]);
                count++;
            }
            er--;
            for(int row=er;row>=sr && count<x;row--){
                list.add(matrix[row][sc]);
                count++;
            }
            sc++;
        }
        return list;
    }
}