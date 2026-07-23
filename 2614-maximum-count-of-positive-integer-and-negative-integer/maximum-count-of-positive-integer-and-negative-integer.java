class Solution {
    public int maximumCount(int[] nums) {
        int c1=0;
        int c2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                c1++;

            }
            if(nums[i]<0){
                c2++;
            }
        }
        if(c1<c2){
            return c2;
        }
        return c1;
    }
}