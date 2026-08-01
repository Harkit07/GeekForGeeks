class Solution {
    public int subarraySum(int[] arr) {
        // code here
        int n = arr.length;
        int totalSum=0;
        for(int i=0; i<n; i++){
            int countOfSubarray = (i+1)*(n-i);
            totalSum+=arr[i]*countOfSubarray;
        }
        return totalSum;
    }
}
