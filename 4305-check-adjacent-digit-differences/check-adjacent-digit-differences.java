class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {
        int [] digit = new int[s.length()];
        for(int i=0;i<s.length();i++){
            digit[i]=s.charAt(i)-'0';
        }
        for(int i=1;i<s.length();i++){
            int val=Math.abs(digit[i-1]-digit[i]);
            if(val>2){
                return false;
            }
        }
        return true;
       
        

        
    }
}