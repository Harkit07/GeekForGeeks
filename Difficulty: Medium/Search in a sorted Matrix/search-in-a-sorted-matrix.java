class Solution {
    public boolean searchMatrix(int[][] mat, int x) {
        // code here
        int row=0, col=mat[0].length-1;
        while(row<mat.length && col>=0){
            if(mat[row][col]==x){
                return true;
            }else if(x<mat[row][col]){
                col--;
            }else{
                row++;
            }
        }
        return false;
    }
}
