class Solution {
    
    public int nCr(int n, int r) {
        // code here
       if (r > n || r < 0) {
            return 0;
        }
        
        long result = 1;
        for (int i = 0; i < r; i++) {
            result = result * (n - i) / (i + 1);
        }
        
        return (int) result;
    }
}