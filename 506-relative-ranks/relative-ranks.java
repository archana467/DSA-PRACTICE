class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n=score.length;
        int []copy=score.clone();
        Arrays.sort(copy);
        HashMap<Integer,Integer> map = new HashMap<>();
        int rank=1;
        for(int i=n-1;i>=0;i--){
            map.put(copy[i],rank);
            rank++;
        }
        String[] s=new String[score.length];
         
     
        for(int j=0;j<score.length;j++){
            int i=map.get(score[j]);
          
            if(i==1){
            s[j]="Gold Medal";
            }
            else if(i==2){
            s[j]="Silver Medal";
            }
            else if(i==3){
                s[j]="Bronze Medal";
            }
            else{
                s[j]=String.valueOf(i);
            }
    
        }
        return s;
        
        
    }
}