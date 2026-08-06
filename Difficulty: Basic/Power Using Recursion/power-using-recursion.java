class Solution {
    public int recursivePower(int n, int p) {
        // code here
        if(p==0){
            return 1;
        }
        int halfPow = recursivePower(n, p/2);
        int halfPowSq = halfPow*halfPow;
        if(p%2!=0){
            halfPowSq*=n;
        }
        return halfPowSq;
    }
}
