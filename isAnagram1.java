class Solution {
    public boolean isAnagram(String s, String t) {
        int[] mapS = new int[26];
        int[] mapT = new int[26];
        if (s.length() != t.length()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            mapS[s.charAt(i) - 'a']++;
            mapT[t.charAt(i) - 'a']++;
        }
        return Arrays.equals(mapS, mapT);
    }
}