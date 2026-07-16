class Solution {
    public long gcdSum(int[] nums) {
        int result[]=new int[nums.length];
        int max=-1;
        for(int i = 0 ; i < nums.length ; i++){
            max=Math.max(nums[i],max);
            result[i]=gcd(nums[i],max);
        } 
        long ans = 0;
        Arrays.sort(result);
        int i =0;
        int j = nums.length-1;
        while(i<j){
            ans+= gcd(result[i],result[j]);
            i++;
            j--;
        }
        return ans;
    }
    int gcd(int a , int  b){
        if(b==0){
            return a ;
        }
        return gcd(b,a%b);
    }
}