class Solution {
    public int maximizeSum(int[] nums, int k) {
    Arrays.sort(nums);
    int n=nums.length;
    int num=nums[n-1];
    int sum=0;
    for(int i=0;i<k;i++){
        sum+=num;
        num=num+1;
    }
    return sum;
    }
}