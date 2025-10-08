class Solution {
    public List<String> summaryRanges(int[] nums) {
        int n = nums.length;
        ArrayList<String> str = new ArrayList<>();
        if (n == 0) return str; 

        for( int i = 0; i < n; i++ ) {
            StringBuilder sb = new StringBuilder();
            int start = nums[i];

            while( (i + 1) < n && ( nums[i + 1] - nums[i] ) == 1  ) {
                i += 1;
            }

            if( start != nums[i] ) {
                sb.append(start);
                sb.append("->");
                sb.append(nums[i]);

            }
            else{
                sb.append(start);
            }
            str.add(sb.toString());
        }      

        return str;

    }
}