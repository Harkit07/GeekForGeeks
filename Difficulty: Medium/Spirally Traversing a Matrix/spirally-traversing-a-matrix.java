class Solution {
    public ArrayList<Integer> spirallyTraverse(int[][] mat) {
        // code here
        ArrayList<Integer> nums = new ArrayList<>();
        
        int startRow=0, startCol=0;
        int endRow=mat.length-1, endCol=mat[0].length-1;
        
        while(startRow<=endRow && startCol<=endCol){
            for(int i=startCol; i<=endCol; i++){
                nums.add(mat[startRow][i]);
            }
            for(int i=startRow+1; i<=endRow; i++){
                nums.add(mat[i][endCol]);
            }
            if(startRow<endRow){
                for(int i=endCol-1; i>=startCol; i--){
                nums.add(mat[endRow][i]);
                }
            }
            if(startCol<endCol){
                for(int i=endRow-1; i>=startRow+1; i--){
                nums.add(mat[i][startCol]);
                }
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        return nums;
    }
}
