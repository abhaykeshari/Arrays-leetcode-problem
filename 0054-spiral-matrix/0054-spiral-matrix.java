class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int maxRow=matrix.length-1;
        int minRow = 0;
        int maxC=matrix[0].length-1;
        int minC=0;
        while(minRow<=maxRow && minC <= maxC){
            for(int j = minC ; j <= maxC ; j++){
                result.add(matrix[minRow][j]);
            }
            minRow++;
            if(minRow>maxRow ||  minC > maxC){
                break;
            }
            for(int i = minRow ; i <= maxRow ; i++){
                result.add(matrix[i][maxC]);
            }
            maxC--;
            if(minRow>maxRow ||  minC > maxC){
                break;
            }
            for(int j = maxC ; j >= minC ; j--){
                result.add(matrix[maxRow][j]);
            }
            maxRow--;
            if(minRow>maxRow ||  minC > maxC){
                break;
            }
            for(int i = maxRow ; i >= minRow ; i--){
                result.add(matrix[i][minC]); 
            }
            minC++;
        }
        return result;
    }
}