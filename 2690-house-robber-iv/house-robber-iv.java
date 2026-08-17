class Solution {
    public int minCapability(int[] nums, int k) {
        int n=nums.length;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(nums[i]>max){
                max=nums[i];
                
            }
            if(nums[i]<min){
                min=nums[i];
            }
        }
        long st=min;
        long end=max;
        long ans=max;
        while(st<=end){
            long mid=st+(end-st)/2;
            long rob=0;
            
            for(int i=0;i<n;i++){
               if(nums[i]<=mid){
                rob++;
                i++;
                
               }
            }
            if(rob>=k){
                ans=mid;
                 end=mid-1;
            }
            else{
                st=mid+1;
            }
        }
        return (int)ans;

        
    }
}