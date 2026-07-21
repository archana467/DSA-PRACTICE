class Solution {
    public int findPoisonedDuration(int[] nums, int k) {
        int n=nums.length;
        int total=n*k;
        int diff=0;
        for(int i=0;i<nums.length-1;i++){
         if(nums[i]+k>=nums[i+1]){
           diff+=nums[i]+k-nums[i+1];
         }
        }
        return total-diff;
    }
}