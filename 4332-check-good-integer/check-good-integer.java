class Solution {
    public boolean checkGoodInteger(int n) {
      String s=String.valueOf(n);
      int []digits=new int[s.length()] ;
      int [] square=new int[s.length()];
      for(int i=0;i<digits.length;i++){
        digits[i]=s.charAt(i)-'0';
        square[i]=(s.charAt(i)-'0')*(s.charAt(i)-'0');
      }
      int dsum=0;
      int ss=0;
      for(int i=0;i<digits.length;i++){
        dsum+=digits[i];
        ss+=square[i];
        
      }
      int diff=ss-dsum;
      if(diff>=50){
        return true;
      }
      return false;


    }
}