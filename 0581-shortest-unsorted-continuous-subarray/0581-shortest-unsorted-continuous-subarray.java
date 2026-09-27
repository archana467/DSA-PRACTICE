class Solution {
    public int findUnsortedSubarray(int[] nums) {
    int n=nums.length;
    int []temp =nums.clone();
    Arrays.sort(temp);
    int j=0;
    int k=n-1;
    while(j<n && nums[j]==temp[j]){
        j++;
    }
    while(k>=0 && nums[k]==temp[k]){
        k--;
    }
    if(j>=k){
        return 0;
    }
    return k-j+1;
     
    }
}