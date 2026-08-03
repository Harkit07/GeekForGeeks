class Solution {
    public String compressString(String s) {
        // code here
        String str = s.toLowerCase();
        StringBuilder sb = new StringBuilder("");
       
        for(int i=0; i<str.length(); i++){
            int count=1;
            char ch = str.charAt(i);
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(ch);
            sb.append(count);
            
        }
        return sb.toString();
    }
}