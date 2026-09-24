class Solution {
    public int[] productExceptSelf(int[] nums) {
    int n= nums.length;
    int[]arr = new int[nums.length];
    int prod=1;
    int zero=0;
    for(int i=0;i<n;i++){
        if(nums[i]==0){
            zero++;
        }
        else{
          prod*=nums[i];
        }
       
       
    } 
    for(int i=0;i<n;i++){
        if(zero>1){
            arr[i]=0;
        }
        else if(zero==1){
            if(nums[i]==0){
                arr[i]=prod;
            }
            else{
                arr[i]=0;

            }

        }
        else{
           arr[i]=prod/nums[i];
        }
      
    }
    return arr; 
    }
}