class Solution {
    public int minCost(int[] arr) {
        // code here
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int cost = 0;
        for(int i=0; i<arr.length; i++){
            pq.add(arr[i]);
        }
        while(pq.size()>1){
            int cost1= pq.remove();
            int cost2= pq.remove();
            cost+=cost1+cost2;
            pq.add(cost1+cost2);
        }
        return cost;
    }
}