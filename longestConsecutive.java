class Solution {
    public int longestConsecutive(int[] nums) {
        int count = 0;
        int max = 0;
        Set<Integer> map = new HashSet<>();
        for(int n : nums){
            map.add(n);
        }
        for(int i : map){
            if(map.contains(i-1)){
                continue;
            }
            else{
                int c = i;
                while(true){
                    if(map.contains(c)){
                        count++;
                        c++;
                    }else{
                        break;
                    }
                }
                if(count > max){
                    max = count;
                }
                    count = 0;
            }
        }
        return max;
    }
}