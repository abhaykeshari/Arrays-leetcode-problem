class Solution {
    public int[][] generateMatrix(int n) {
        int count=0;
        int minr = 0 ;
        int minc =0;
        int maxc=n-1;
        int maxr=n-1;
        int arr[][]=new int[n][n];
        while(minr <= maxr && minc <= maxc){
            for(int i = minc ; i <= maxc ; i++){
                arr[minr][i]=++count;
            }
            minr++;
            if(minr > maxr || minc > maxc){
                break;
            }
            for(int i = minr ; i <= maxr ; i++){
                arr[i][maxc]=++count;
            }maxc--;
            if(minr > maxr || minc > maxc){
                break;
            }
            for(int i = maxc ; i>= minc ;i--){
                arr[maxr][i]=++count;
            }
            maxr--;
            if(minr > maxr || minc > maxc){
                break;
            }
            for(int i = maxr ; i>= minr; i--){
                arr[i][minc]=++count;
            }
            minc++;
        }
        return arr;
    }
}