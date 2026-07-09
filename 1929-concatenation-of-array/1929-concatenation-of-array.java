class Solution {
    public int[] getConcatenation(int[] nums) {
        int i=0;
        int k =0;
        int ans[]=new int[nums.length*2];
        while(i < nums.length){
            ans[k]=nums[i];
            k++;
            i++;
        }
        int j =0;
        while(j < nums.length){
            ans[k]=nums[j];
            k++;
            j++;
        }
        return  ans;
    }
}