class Solution {
    public int minSubArrayLen(int target, int[] nums) {
    int n =nums.length;
    int sum=0;
    int length=n+1;
    int j=0;
    for(int i=0;i<n;i++){
        sum+=nums[i];
        while(sum>=target){
          length=Math.min(length,i-j+1);
          sum-=nums[j];
          j++;
        }
    } 
    if(length==n+1){
        return 0;
        
    } 
    return length; 
    }
}