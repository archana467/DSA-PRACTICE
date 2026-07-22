class Solution {
    public boolean isFascinating(int n) {
        String s="" + n + (2 * n) + (3 * n);
        if (s.length()!=9) {
            return false;
        } 
        int[] count = new int[10];
        for (char c:s.toCharArray()) {
            int digit=c-'0';        
            if (digit==0 || count[digit]>0) {
                return false;
            }
            count[digit]++;
        }
        
        return true;
    }
}