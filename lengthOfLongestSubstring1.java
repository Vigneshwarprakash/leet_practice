class Solution {
    public int lengthOfLongestSubstring(String s) {
        int [] arr = new int[128];
        Arrays.fill(arr,-1);
        int left  = -1;
        int right = 0;
        int curLen = 0;
        int maxLen = 0;
        int len = s.length();
        for(right = 0;right< len;right++){

            if(arr[s.charAt(right)] != -1 && left <arr[s.charAt(right)]){

                maxLen = Math.max(curLen,maxLen);
                left = arr[s.charAt(right)];
                arr[s.charAt(right)] = right;
                
            }
            else{
                curLen = right-left;
                arr[s.charAt(right)] = right;
            }
        }
        return Math.max(curLen,maxLen);
    }
}