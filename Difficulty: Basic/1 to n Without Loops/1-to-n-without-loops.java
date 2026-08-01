class Solution {
    public void printTillN(int n) {
        // code here
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        printTillN(n-1);
        System.out.print(n+" ");
    }
}