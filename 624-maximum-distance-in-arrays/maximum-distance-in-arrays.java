class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
     int dist=0;
     int min=arrays.get(0).get(0);
     int max=arrays.get(0).get(arrays.get(0).size()-1);
     for(int i=1;i<arrays.size();i++){
        List<Integer> curr=arrays.get(i);
        int currMin=curr.get(0);
        int currMax=curr.get(curr.size()-1);
        dist=Math.max(dist,Math.abs(currMax-min));
        dist=Math.max(dist,Math.abs(max-currMin));
        min=Math.min(currMin,min);
        max=Math.max(currMax,max);
     }  
     return dist; 
    }
}