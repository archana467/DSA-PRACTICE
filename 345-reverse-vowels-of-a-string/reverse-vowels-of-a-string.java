class Solution {
    public String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch =Character.toLowerCase(s.charAt(i));
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                sb.append(s.charAt(i));
            }
        }
        sb.reverse();
        String rev=sb.toString();
        StringBuilder res=new StringBuilder();
        int j=0;
        for(int i=0;i<s.length();i++){
            char ch1=s.charAt(i);
            if(ch1=='a' || ch1=='e' || ch1=='i' || ch1=='o' || ch1=='u'||
            ch1=='A' || ch1=='E' || ch1=='I' || ch1=='O' || ch1=='U'
            ){
                res.append(rev.charAt(j));
                j++;

            }
            else{
                res.append(s.charAt(i));
            }
        }
        return res.toString();
        
    }
}