class Solution {
    public boolean isBalanced(String num) {
        int evenSum =0;
        int oddSum=0;
        for(int i =0;i<num.length();i++){
            int ch = num.charAt(i)-'0';
            if(i%2==0){
                evenSum+=ch;
            }
            else{
                oddSum +=ch;
            }
        }
        return evenSum==oddSum;
           
       
    }
}