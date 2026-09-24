class Solution {
    public String gcdOfStrings(String str1, String str2) {
    int n=str1.length();
    int m=str2.length();
    if(!(str1 +str2).equals(str2+str1)){
        return "";
    }
    int a=n;
    int b=m;
    while(b!=0){
        int temp=b;
        b=a%b;
        a=temp;
    }
    return str1.substring(0,a);
     
     

    }
}