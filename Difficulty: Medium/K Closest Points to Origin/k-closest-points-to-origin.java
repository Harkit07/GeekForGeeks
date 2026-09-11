class Solution {
    static class Pair implements Comparable<Pair>{
        int x;
        int y;
        int distSq;
        
        public Pair(int x, int y, int distSq){
            this.x=x;
            this.y=y;
            this.distSq=distSq;
        }
        
        @Override
        public int compareTo(Pair p2){
            return this.distSq - p2.distSq;
        }
    }
    
    public ArrayList<ArrayList<Integer>> kClosest(int[][] points, int k) {
        // code here
        ArrayList<ArrayList<Integer>> ml = new ArrayList<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        
        for(int i=0; i<points.length; i++){
            int distSq = points[i][0]*points[i][0]+points[i][1]*points[i][1];
            pq.add(new Pair(points[i][0], points[i][1], distSq));    
        }
        int j=0;
        while(j<k){
            ArrayList<Integer> list = new ArrayList<>();
            Pair p = pq.poll();
            list.add(p.x);
            list.add(p.y);
            ml.add(list);
            j++;
        }
        return ml;
    }
}