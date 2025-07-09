class Solution {
    public int search(int[] nums, int target) {
        //find n to define initial search space
        int n = nums.length;
        //initial search space defined
        int low=0;
        int high=n-1;

        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid]>target){
                //shift to left subspace
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return -1;
    }
}