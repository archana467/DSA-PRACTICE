class Solution {
    public int minSubArrayLen(int target, int[] nums) {
    int n= nums.length;
    int ptr=0;
    int sum=0;
    int l=n+1;
    for(int i=0;i<n;i++){
        sum+=nums[i];
        while(sum>=target){
         l=Math.min(l,i-ptr+1);
         sum-=nums[ptr];
         ptr++;
        }
    }
    if(l==n+1){
        return 0;
    }
    return l;

    }
}