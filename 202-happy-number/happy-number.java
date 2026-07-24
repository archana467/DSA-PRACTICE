class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set=new HashSet<>();
        while(n!=1 && !set.contains(n)){
            set.add(n);
            int totalSum=0;
        while(n>0) {
            int d=n%10;
            totalSum+=d*d;
            n /=10;
        }
        n=totalSum;
        } 
        if(n==1){
            return true;
        }
        return false;
        
    }
}