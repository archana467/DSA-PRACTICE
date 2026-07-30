class Solution {
    public int minimumPushes(String word) {
        int n=word.length();
        int min=0;
        for(int i=0;i<n;i++){
            min+=(i/8)+1;
        }
        return min;
    }
}