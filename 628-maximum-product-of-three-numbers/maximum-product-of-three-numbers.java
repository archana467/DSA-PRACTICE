class Solution {
    public int maximumProduct(int[] nums) {
        // int mul=1;

        // for(int i=0;i<nums.length;i++){
        //   mul*=nums[i];
        // }
        // return mul;

        //2nd approach 
        Arrays.sort(nums);
        int n = nums.length;
        int p1=nums[n-1]*nums[n-2]*nums[n-3];
        int p2=nums[0]*nums[1]*nums[n-1];
        return Math.max(p1,p2);
    }
}