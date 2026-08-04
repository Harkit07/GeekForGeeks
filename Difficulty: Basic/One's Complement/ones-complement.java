class Solution {
    static int onesComplement(int n) {
        // code here
        int mask = 0;
        int temp=n;
        while(temp>0){
            mask = (mask<<1)|1;
            temp=temp>>1;
        }
        return n^mask;
    }
}