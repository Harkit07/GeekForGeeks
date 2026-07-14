class Solution {
    public String sortString(String s) {
        // code here
        char chars[] = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}