class Solution {
    public boolean check(int[] nums) {
      int n=nums.length;
      boolean isError =false;
      for(int i=0;i<nums.length;i++){
        if(nums[i]>nums[(i+1)%n]){
             if(isError){
             return false;
            }
            isError=true;
        }
      }  
     
    return true;
    }
}