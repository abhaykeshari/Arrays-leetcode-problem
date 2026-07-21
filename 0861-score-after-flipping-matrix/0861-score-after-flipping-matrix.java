class Solution {
    public int matrixScore(int[][] grid) {
        for(int i = 0 ; i < grid.length ;i++){
            if(grid[i][0]==0){
                for(int j = 0; j < grid[i].length ; j++){
                    grid[i][j]=1-grid[i][j];
                }
            }
        }   
        for(int i = 1 ; i < grid[0].length; i++){
            int one = 0;
            for(int j = 0 ; j < grid.length ; j++){
                if(grid[j][i]==1){
                    one++;
                }
            }
            if(one < grid.length-one){
                for (int j = 0; j < grid.length; j++) {
                    grid[j][i] = 1 - grid[j][i];
                }
            }
        }
        int sum = 0 ;
        for(int i = 0 ; i < grid.length ; i++){
            int x =0;
            for(int j = 0 ; j < grid[i].length   ;j++){
                
                    x = x *2+ grid[i][j];
                
            }
                sum+=x;
        }
        return sum;
    }
}