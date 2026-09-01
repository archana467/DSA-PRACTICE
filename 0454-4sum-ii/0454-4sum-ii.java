class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
    HashMap<Integer,Integer> map = new HashMap<>();
    int sum=0;
    int c=0;
    for(int n1:nums1){
        for(int n2:nums2){
            sum=(n1+n2);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
    } 
    for(int n3:nums3){
        for(int n4:nums4){
            sum=-(n3+n4);
            if(map.containsKey(sum)){
                c+=map.get(sum);
            }
        }
    }
    return c;  
    }
}