class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
    int n = nums.length;
    int sum=0;
    HashMap<Integer,Integer> map = new HashMap<>();
    map.put(0,-1);
    for(int i=0;i<n;i++){
        sum+=nums[i];
        int rsum=sum%k;
        if(map.containsKey(rsum)){
            if(i-map.get(rsum)>1){
                return true;
            }
           
        }
        else{
            map.put(rsum,i);
        }
    }
    return false;

    }
}