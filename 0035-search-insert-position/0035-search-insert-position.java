class Solution {
    public int searchInsert(int[] nums, int target) {
        int result=0;
        if(target>nums[nums.length-1]){
            return nums.length;
        }
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i]==target){
                result =i;
                break;
            }
            if(nums[i]>target){
                result = (i);
                break;
            }
        }
        return result;
    }
}