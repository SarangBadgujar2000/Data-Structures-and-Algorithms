class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // O(log(m) + log(n))
        // int row=matrix.length;
        // int col=matrix[0].length;
        // int col_left=0;
        // int col_right=row-1;
        // while(col_left<=col_right){
        //     int col_mid=(col_right+col_left)/2;
        //     if(matrix[col_mid][0]<target && matrix[col_mid][col-1]>=target ){
        //         int rowleft=0;
        //         int rowright=col-1;
        //         while(rowleft<=rowright){
        //             int mid=(rowright+rowleft)/2;
        //             if(matrix[col_mid][mid]==target){
        //                 return true;
        //             }
        //             if(target>matrix[col_mid][mid]){
        //                 rowleft=mid+1;
        //             }else{
        //                 rowright=mid-1;
        //             }
        //         }
        //     }
        //     if(matrix[col_mid][0]==target){
        //         return true;
        //     }
        //     if(target>matrix[col_mid][0]){
        //         col_left=col_mid+1;
        //     }else{
        //         col_right=col_mid-1;
        //     }

        // }
        // return false;
        
        //O(log(m*n))
        if (matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        // Get the number of columns in the matrix
        int cols = matrix[0].length;

        // Set the start and end indices for binary search
        int start = 0;
        int end = matrix.length * cols - 1;

        while (start <= end) {
            // Calculate the middle index
            int mid = start + (end - start) / 2;

            // Calculate the row and column indices corresponding to the middle index
            int r = mid / cols;
            int c = mid % cols;

            // Compare the target with the element at matrix[r][c]
            if (target == matrix[r][c]) {
                return true;
            }
            if (target < matrix[r][c]) {
                // Target is smaller, narrow down the search range to the left half
                end = mid - 1;
            } else {
                // Target is larger, narrow down the search range to the right half
                start = mid + 1;
            }
        }

        // Target element not found in the matrix
        return false;
    }
}