class Solution {
    public String removeKdigits(String num, int k) {
    char[]arr =num.toCharArray();
    Stack<Character> st = new Stack<>();
    int remove =k;
    for(int i=0;i<arr.length;i++){
        while(!st.isEmpty() && st.peek()>arr[i] && remove>0){
            st.pop();
            remove--;
        }
        st.push(arr[i]);
    }
    while(!st.isEmpty() && remove>0){
        st.pop();
        remove--;
    } 
    StringBuilder sb = new StringBuilder();

    for(char ch:st){
        sb.append(ch);
    }
    int index=0;
    while(index<sb.length() && sb.charAt(index)=='0'){
        index++;
    } 
    sb.delete(0,index);
    if(sb.length()==0){
        return "0";
    }
    return sb.toString();
    }
}