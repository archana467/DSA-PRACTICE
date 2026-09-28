class Solution {
    static final long MOD = 1000000007;
    public int countAnagrams(String s) {
      long ans=1;
      int n=s.length();
      long [] fact = new long[n+1];
      fact[0]=1;
      for(int i=1;i<=n;i++){
        fact[i]=fact[i-1]*i%MOD;

      }
      for(String word:s.split(" ")){
        int[] freq = new int [26];
        for(char ch:word.toCharArray()){
            freq[ch-'a']++;
        }
        long ways = fact[word.length()];
        for(int count:freq){
            if(count>1){
                ways = ways * power(fact[count],MOD-2)%MOD;
            }
        }
        ans = ans*ways%MOD;
      }
      return (int) ans;
    }
    long power(long a,long b){
        long result=1;
        while(b>0){
            if(b%2==1){
                result = result*a%MOD;
            }
            a=a*a%MOD;
            b/=2;
        }
        return result;
    }
}