class Solution {
    public List<String> removeAnagrams(String[] words) {
    ArrayList<String> list = new ArrayList<>();
    String prev="";
    for(String s:words){
        char[]arr=s.toCharArray();
        Arrays.sort(arr);
        String curr= new String(arr);
        if(!curr.equals(prev)){
            list.add(s);
            prev=curr;
        }
    }
    return list;    
    }
}