class Solution {
    public String mergeCharacters(String s, int k) {
        int n=s.length();
        StringBuilder sb = new StringBuilder(s);

        for(int i=0;i<sb.length();i++){

          for(int j=i+1;j<=i+k;j++){
            if(j>=sb.length()){
                break;

            }
            if(sb.charAt(i)==sb.charAt(j)){
                sb.deleteCharAt(j);
                i=-1;
                break;
            }
          }
        }
    return sb.toString();   
    }
}