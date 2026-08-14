class Solution {
    public static int getMaxArea(int arr[]) {
        // code here
        int maxArea = 0;
        int nsr[] = new int[arr.length];
        int nsl[] = new int[arr.length];
        Stack<Integer> s = new Stack<>();
        for(int i=arr.length-1; i>=0; i--){
            while(!s.isEmpty() &&arr[s.peek()]>=arr[i]){
                s.pop();
            }
            nsr[i] = s.isEmpty() ? arr.length : s.peek();
            s.push(i);
        }
        s= new Stack<>();
        for(int i=0; i<arr.length; i++){
             while(!s.isEmpty() &&arr[s.peek()]>=arr[i]){
                s.pop();
            }
            nsl[i] = s.isEmpty() ? -1 : s.peek();
            s.push(i);
        }
        
        for(int i=0; i<arr.length; i++){
            int height=arr[i];
            int width=nsr[i]-nsl[i]-1;
            int currArea = height*width;
            maxArea=Math.max(currArea, maxArea);
        }
        return maxArea;
    }
}
