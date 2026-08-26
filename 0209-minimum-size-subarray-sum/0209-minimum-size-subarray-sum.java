class Solution {
    public int minSubArrayLen(int target, int[] nums) {
     int n= nums.length;
     int st=1;
     int end=n;
     int ans=0;
     while(st<=end){
        int mid=st+(end-st)/2;
        if(isValid(mid,nums,target)){
            ans=mid;
            end=mid-1;
        }
        else{
            st=mid+1;
        }

     }  
     return ans;
    } 
     public boolean isValid(int mid,int [] nums,int target){
        int n=nums.length;
        int sum=0;
        int j=0;
        int length=n+1;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            while(i-j+1>mid){
               sum-=nums[j];
                 j++;
            }
            if(sum>=target){
                return true;
                
            }
        }
        return false;

     }
    
}