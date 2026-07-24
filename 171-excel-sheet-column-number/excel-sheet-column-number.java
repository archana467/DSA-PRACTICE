class Solution {
    public int titleToNumber(String columnTitle) {
        int ans=0;
        for(int i=0;i<columnTitle.length();i++){
             char c=columnTitle.charAt(i);
             int v=c-'A'+1;
             ans=ans*26+v;
        }
        return ans;
    }
}