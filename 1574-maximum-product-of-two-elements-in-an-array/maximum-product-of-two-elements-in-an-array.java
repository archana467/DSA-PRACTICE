class Solution {
    public int maxProduct(int[] nums) {
      Arrays.sort(nums);
      int p1=nums[nums.length-1]  ;
      int p2=nums[nums.length-2];
      int prod=(p1-1)*(p2-1);
      return prod;
    }
}