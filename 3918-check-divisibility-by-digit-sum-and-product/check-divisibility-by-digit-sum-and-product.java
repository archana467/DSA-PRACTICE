class Solution {
    public boolean checkDivisibility(int n) {
        int prod=1;
        int sum=0;
        int temp=n;
        while(temp>0){
            int temp1=temp%10;
            sum+=temp1;
            prod*=temp1;
            temp=temp/10;
        }
        int total=sum+prod;

        if(n%total==0){
            return true;
        }
        return false;
        
    }
}