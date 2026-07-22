class Solution {
    public boolean checkString(String s) {
        int n=s.length();
        int count=0;
        boolean res=true;;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='a'){
                count++;
            }
        }
        if(count==0){
            res=true;
        }
        for(int i=0;i<n-1;i++){
            char ch=s.charAt(i);
            if(ch=='b' && s.charAt(i+1)=='a'){
                res=false;
            }
        }
        return res;
    }
}