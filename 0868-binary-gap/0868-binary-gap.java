class Solution {
    public int binaryGap(int n) {
    String s = Integer.toBinaryString(n);
    int last=-1;
    int max=0;
    for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='1'){
            if(last!=-1){
                max=Math.max(max,i-last);
            }
        last=i;
        }
    } 
    return max; 
    }
}