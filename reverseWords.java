class Solution {
    public String reverseWords(String s) {
        int n = s.length();
        StringBuilder str = new StringBuilder();
        int i = n-1;
        while(i>=0) {
            while(i>=0 && s.charAt(i)==' ') {
                i--;
            }
            if(i<0) break;
            int end = i;
           while(i>=0 && s.charAt(i) !=' ') {
            i--;
           }
           int start = i+1;
           str.append(s.substring(start,end+1)).append(" ");
        }
        return str.toString().trim();
    }
}   