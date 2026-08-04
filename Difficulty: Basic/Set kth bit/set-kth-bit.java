class Solution {
    static int setKthBit(int n, int k) {
        // code here
        int bitMask = 1<<k;
        return n|bitMask;
    }
}