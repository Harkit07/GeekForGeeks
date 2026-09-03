class Solution {
    static int nthFibonacci(int n) {
        if(n==0){
            return 0;
        }
        // code here
       int dp[] = new int[n+1];
       dp[1]=1;
       for(int i=1; i<dp.length; i++){
           if(i==1){
               dp[i]=dp[i]+0;
           }else{
               dp[i]=dp[i-1]+dp[i-2];
           }
       }
        return dp[n];
    }
}