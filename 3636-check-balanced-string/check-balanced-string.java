class Solution {
    public boolean isBalanced(String num) {
        int odx=0;
        int esum=0;
        for(int i=0;i<num.length();i++){
            int number=num.charAt(i)-'0';
          
            if(i%2!=0){
                odx+=number;

            }
            else{
                esum+=number;
            }
        }
        if(esum==odx){
            return true;
        }
        return false;
        
    }
}