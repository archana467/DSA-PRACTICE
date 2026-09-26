class Solution {
    public String sortSentence(String s) {
    String[] arr = s.split(" ");
    String[] res = new String[arr.length];
    for(String w:arr){
        int n=w.length();
        int i = w.charAt(n-1)-'0'-1;
        res[i]=w.substring(0,n-1);
    }
    return String.join(" ",res) ;   
    }
}