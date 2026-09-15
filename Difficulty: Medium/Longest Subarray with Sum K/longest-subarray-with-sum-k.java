class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int sum = 0;
        int len = 0;
        
        for(int j=0; j<arr.length;  j++){
            sum+=arr[j];
            if(map.containsKey(sum-k)){
                len=Math.max(len, j-map.get(sum-k));
            }
            if(!map.containsKey(sum)){
                map.put(sum, j);
            }
        }
        
        return len;
    }
}
