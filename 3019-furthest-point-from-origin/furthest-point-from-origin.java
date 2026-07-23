class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int left=0;
        int right=0;
        int space=0;
        char []ch=moves.toCharArray();
        for(char c:ch){
            if(c=='L'){
                left++;
            }
            else if(c=='R'){
                right++;
            }
            else{
                space++;
            }
        }
        int lm=(left+space)-right;
        int rm=(right+space)-left;
        if(lm>rm){
            return lm;
        }
        return rm;
        
    }
}