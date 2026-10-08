class Solution {
    public String removeOuterParentheses(String s) {
         Stack<Character> st = new Stack();
        
        
        StringBuilder sb = new StringBuilder();
        char[] arr=s.toCharArray();
        for(int i =0;i<s.length();i++){
            if(arr[i]=='('){
                if(!st.isEmpty()){
                    sb.append(arr[i]);
                }
                st.push(arr[i]);
                
                
                
            }
            
            else{
                
                st.pop();
                if(!st.isEmpty()){
                    sb.append(arr[i]);
                }
            }
            }
            
            


      
        return sb.toString();
    }
}