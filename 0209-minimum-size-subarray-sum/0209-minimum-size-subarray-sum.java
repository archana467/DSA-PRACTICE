class Solution {
    public int minSubArrayLen(int target, int[] nums) {
      int n= nums.length;
      int st=1;
      int end=n;
      int ans=0;
      while(st<=end){
        int mid= st+(end-st)/2;
        int sum=0;
        boolean isValid = false;
        for(int i=0;i<mid;i++ ){
            sum+=nums[i];
        }
            if(sum>=target){
                isValid=true;
            
            }
            else{
                for(int j=mid;j<n;j++){
                    sum+=nums[j]-nums[j-mid];
                     if(sum>=target){
                     isValid=true;
                     break;
            }
                }

                

            }
        if(isValid){
            ans=mid;
            end=mid-1;
        }
        else{
            st=mid+1;
        }
      }
      return ans;

    }
}