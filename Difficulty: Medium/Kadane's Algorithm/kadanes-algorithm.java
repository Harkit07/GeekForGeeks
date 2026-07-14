class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
         int cs = 0;
         int ms = Integer.MIN_VALUE;
         for(int i=0; i<arr.length; i++){
            cs+=arr[i];
            ms = Math.max(cs, ms);
            if(cs<0){
             cs=0;
            }
            
         }
        return ms;
    }
}
