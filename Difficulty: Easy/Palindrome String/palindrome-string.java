class Solution {
    boolean isPalindrome(String s) {
        // code here
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) != s.charAt(s.length()-i-1)){
                return false;
            }
        }
        return true;
    }
}