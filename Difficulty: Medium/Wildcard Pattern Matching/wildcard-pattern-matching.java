class Solution {
    public boolean wildCard(String txt, String pat) {
        // code here
        int n = txt.length();
        int m = pat.length();
        
        boolean dp[][]=new boolean[n+1][m+1];
        dp[0][0]=true;
        
        for(int i=1; i<dp.length; i++){
            dp[i][0]=false;
        }
        for(int i=1; i<dp[0].length; i++){
            if(pat.charAt(i-1) == '*'){
                dp[0][i]=dp[0][i-1];
            }
        }
        
        for(int i=1; i<dp.length; i++){
            for(int j=1; j<dp[0].length; j++){
                if(txt.charAt(i-1) == pat.charAt(j-1) || pat.charAt(j-1)=='?'){
                    dp[i][j]=dp[i-1][j-1];
                }else if(pat.charAt(j-1)=='*'){
                    dp[i][j]=dp[i-1][j] || dp[i][j-1];
                }else{
                    dp[i][j]=false;
                }
            }
        }
        
        return dp[n][m];
    }
}