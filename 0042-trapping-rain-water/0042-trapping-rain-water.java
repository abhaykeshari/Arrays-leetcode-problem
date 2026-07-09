class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int pre =-1;
        int arr1[]=new int[n];
        for(int i = 0 ; i<n ; i++){
            arr1[i]=pre;
            pre=Math.max(pre,height[i]);
        }
        pre = -1;
        for(int i = n-1 ; i>=0 ; i--){
            if(pre<arr1[i]){
                arr1[i]=pre;
            }
            pre=Math.max(pre,height[i]);
        }
        int sum =0;
        for(int i = 1 ; i < n-1;i++){
            if(arr1[i]>height[i]){
                sum+=arr1[i]-height[i];
            }
        }
        return sum;
    }
}