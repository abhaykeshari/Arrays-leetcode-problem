class Solution {
    public void nextPermutation(int[] nums) {
        int idx =-1 ;
        for(int i = nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                idx=i;
                break;
            }
        }
        if(idx==-1){
            int k=nums.length-1;
            int j =0;
            while(j<k){
                int temp =nums[k];
                nums[k]=nums[j];
                nums[j]=temp;
                k--;
                j++;

            }
        }
        else{
            int j = idx+1;
            int max=0;
            int k = nums.length-1;
            
            while(j<k){
                int temp = nums[k];
                nums[k]=nums[j];
                nums[j]=temp;
                j++;
                k--;

            }
            for(int i = idx+1; i<nums.length;i++){
                if(nums[idx]<nums[i]){
                    max=i;
                    break;
                }
            }
            int temp = nums[idx];
            nums[idx]=nums[max];
            nums[max]=temp;
        }
    }
}