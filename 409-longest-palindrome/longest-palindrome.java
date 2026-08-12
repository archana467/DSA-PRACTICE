class Solution {
    public int longestPalindrome(String s) {
       
        int length=0;
        int o=0;
        if(s.length()==0){
            return 0;
        }
        if(s.length()==1){
            return 1;
        }
        HashMap<Character,Integer> map = new HashMap();
        for(char ch :s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
            if(map.get(ch)%2==1){
               o++;
            }
            else{
                o--;
            }
        }
        if(o>1){
        return s.length()-o+1;
       
        }
      return s.length();   
        
    }
}