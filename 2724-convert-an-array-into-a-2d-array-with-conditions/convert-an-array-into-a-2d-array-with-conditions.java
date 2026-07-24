class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        int n=nums.length;
         List<List<Integer>> list= new ArrayList<>();
         int[]freq=new int[nums.length+1];
       for(int num:nums){
           freq[num]++;
           int row=freq[num]-1;
           if(row==list.size()){
            list.add(new ArrayList<>());
           }
           list.get(row).add(num);
       }
        return list;
    }
}