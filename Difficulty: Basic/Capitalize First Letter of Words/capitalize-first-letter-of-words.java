class Solution {
    public String convert(String s) {
        StringBuilder sb = new StringBuilder("");
        // code here
        sb.append(Character.toUpperCase(s.charAt(0)));
        for(int i=1; i<s.length(); i++){
            if(i<s.length()-1 && s.charAt(i)==' '){
                sb.append(s.charAt(i));
                i++;
                sb.append(Character.toUpperCase(s.charAt(i)));
            }else{
                 sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
};