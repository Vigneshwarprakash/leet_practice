class Solution {
    public int hIndex(int[] citations) {
        int paper = citations.length;
        int[] cites = new int[paper + 1];
        for(int i: citations) cites[Math.min(i, paper)]++;
        int total = 0;
        for(int i = paper; i >= 0; i--) {
            total += cites[i];
            if(total >= i) return i;
        }
        return 0;
    }
}