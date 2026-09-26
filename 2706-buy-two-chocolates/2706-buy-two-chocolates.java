class Solution {
    public int buyChoco(int[] prices, int money) {
     Arrays.sort(prices);
     int a=prices[0];
     int b= prices[1];
     int sum=a+b;
     if(sum<=money){
        int diff=money-sum;
        return diff;
     }
     return money;
    }
}