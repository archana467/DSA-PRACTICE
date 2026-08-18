class Solution {
    public int maxDistinct(String s) {
     char[]c =s.toCharArray();
     Arrays.sort(c);
     int count=1;
     for(int i=1;i<s.length();i++){
        if(c[i]!=c[i-1]){
         count++;
        }
     } 
     return count;  
    }
}