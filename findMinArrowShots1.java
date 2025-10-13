class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b)->(a[1]-b[1]));
        int ans=0;
        long pos=Long.MIN_VALUE;
        for(int arr[]:points){
            if(pos>=arr[0]&&pos<=arr[1]) continue;
            ans++;
            pos=arr[1];
        }
        return ans;
    }
}