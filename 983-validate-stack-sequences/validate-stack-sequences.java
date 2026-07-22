class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        if(pushed.length!=popped.length){
            return false;
        }
       Stack<Integer> st= new Stack<>();
       int left=0;
       for(int val:pushed){
        st.push(val);
        while(!st.isEmpty() && st.peek()==popped[left]){
            st.pop();
            left++;
        }
       }
       if(st.isEmpty()){
        return true;
       }
       return false;

    }
}