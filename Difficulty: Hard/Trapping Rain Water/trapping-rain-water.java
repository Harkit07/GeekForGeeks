class Solution {
    public int maxWater(int arr[]) {
        int n = arr.length;
        // code here
        int leftMax[] = new int[n];
        leftMax[0]=arr[0];
        for(int i=1; i<n; i++){
            leftMax[i]= Math.max(leftMax[i-1], arr[i]);
        }
        
        int rightMax[] = new int[n];
        rightMax[n-1]=arr[n-1];
        for(int i=n-2; i>=0; i--){
            rightMax[i]= Math.max(rightMax[i+1], arr[i]);
        }
        
        int waterTrapped = 0;
        for(int i=0; i<n; i++){
            int waterLevel = Math.min(rightMax[i], leftMax[i]);
            waterTrapped+=waterLevel-arr[i];
        }
        return waterTrapped;
    }
}
