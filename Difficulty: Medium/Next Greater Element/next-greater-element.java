class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        ArrayList<Integer> nextGreater = new ArrayList<>();
        Stack <Integer> s = new Stack<>();
        for(int i=arr.length-1; i>=0; i--){
            while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nextGreater.add(-1);
            }else{
                nextGreater.add(arr[s.peek()]);
            }
            s.push(i);
        }
        Collections.reverse(nextGreater);
        return nextGreater;
    }
}