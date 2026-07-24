class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        Arrays.sort(nums);
        int []ans=new int[k];
        int count=0;
        for(int i=nums.length-1;i>=0;i--){
            if(count==k){
                break;
            }
            if(i==nums.length-1 || nums[i]!=nums[i+1]){
                ans[count]=nums[i];
                count++;
            }
        }

       int[] result=new int[count];
        for (int i=0;i<count;i++) {
            result[i]=ans[i];
        }

        return result;
        
    }
}