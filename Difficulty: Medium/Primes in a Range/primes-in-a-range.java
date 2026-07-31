class Solution {
     public static boolean isPrime(int n){
        if(n==1){
            return false;
        }
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    
    public List<Integer> primeRange(int l, int r) {
        // code here
        List<Integer> numbers = new ArrayList<>();
        for(int i=l; i<=r; i++){
            if(isPrime(i)){
                numbers.add(i);
            }
        }
        return numbers;
        
    }
}