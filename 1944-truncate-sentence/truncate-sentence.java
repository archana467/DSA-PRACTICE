class Solution {
    public String truncateSentence(String s, int k) {
        String [] arr=s.split("\\s+");
    StringBuilder ans = new StringBuilder();  
    for(int i=0;i<k;i++){
        if(i>0){
            ans.append(" ");
        }
        ans.append(arr[i]);
    }
    return ans.toString();
    }
}