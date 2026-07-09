class Solution {
    public int search(int[] nums, int target) {
        
        int j =0;
        while (j<nums.length){
            if(nums[j]==target){
                return j;
            }
            j++;
        }
        return -1;
    }
}