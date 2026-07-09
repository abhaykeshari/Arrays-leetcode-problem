class Solution {
    public int[] shuffle(int[] nums, int n) {
        int i =0;
        int j =0;
        int k =nums.length/2;
        int ans[]=new int[nums.length];
        while(i < nums.length){
            if(i%2==0){
                ans[i]=nums[j];
                i++;
                j++;
            }
            else{
                ans[i]=nums[k];
                i++;
                k++;
            }
        }
        return ans;
    }
}