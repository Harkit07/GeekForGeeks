class Solution {
    static class Pair implements Comparable<Pair>{
        int val;
        int idx;
        
        public Pair(int val, int idx){
            this.val=val;
            this.idx=idx;
        }
        @Override
        public int compareTo(Pair p2){
            return p2.val-this.val;
        }
    }
    
    public ArrayList<Integer> maxOfSubarrays(int[] arr, int k) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for(int i=0; i<k; i++){
            pq.add(new Pair(arr[i], i));
        }
        list.add(pq.peek().val);
        for(int i=k; i<arr.length; i++){
            while(pq.size()>0 && pq.peek().idx<=(i-k)){
                pq.remove();
            }
            pq.add(new Pair(arr[i], i));
            list.add(pq.peek().val);
        }
        return list;
    }
}