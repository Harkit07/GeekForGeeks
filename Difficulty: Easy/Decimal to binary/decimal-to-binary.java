class Solution {
    static String decToBinary(int n) {
        // code here
        if (n == 0) return "0";
        StringBuilder sb = new StringBuilder("");
        while(n>0){
            int rem = n%2;
            sb.append(rem);
            n/=2;
        }
        return sb.reverse().toString();
    }
}