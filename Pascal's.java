public class pascal {
    public static void main(String[] args){
        int arr[][]= new int[5][];
        for(int i = 0 ; i < 5; i++){
            int arr1[] = new int[i+1];
            for(int j = 0 ; j <= i ; j++){
                if(i==j || j==0){
                    arr1[j]=1;
                }
                else{
                    int value = arr[i-1][j-1]+arr[i-1][j];
                    arr1[j]=value;
                }
            }
            arr[i]=arr1;
        }
        for(int i =0 ; i < arr.length;i++){
            for(int j = 0 ; j < arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
