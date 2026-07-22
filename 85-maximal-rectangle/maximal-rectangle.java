class Solution {
    public int maximalRectangle(char[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int [] ans=new int[m];
        int maxArea=0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]=='1'){
                    ans[j]++;
                }
                else{
                    ans[j]=0;

                }
                
            }
         int ne=ans.length;
        Stack<Integer> nse=new Stack<>();
        Stack<Integer> pse=new Stack<>();
        int [] prev = new int[ne];
        int [] next=new int[ne];
        //previous smaller element
        for(int k=0;k<ne;k++){
            while(!pse.isEmpty() && ans[pse.peek()]>=ans[k]){
                pse.pop();

            }
            if(!pse.isEmpty()){
                prev[k]=pse.peek();
            }
            else{
                prev[k]=-1;
            }
            pse.push(k);

        }
        //next smaller element
         for(int k=ne-1;k>=0;k--){
            while(!nse.isEmpty() && ans[nse.peek()]>=ans[k]){
                nse.pop();

            }
            if(!nse.isEmpty()){
                next[k]=nse.peek();
            }
            else{
                next[k]=m;
            }
            nse.push(k);

        }
       
        for(int y=0;y<ne;y++){

        int width=next[y]-prev[y]-1;
        int area = ans[y]*width;
        maxArea=Math.max(maxArea,area);
        }
       
          
        }

        
        return maxArea;
    }
}