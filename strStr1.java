class Solution {
    public int strStr(String haystack, String needle) {
        int n;
        if(haystack.contains(needle)){ // checks the needle is present in the haystack
         n = haystack.indexOf(needle); //identify the index of needle
         return n;
        }else{
            return -1;  // if it is not we can return -1
        }
        
    }
}