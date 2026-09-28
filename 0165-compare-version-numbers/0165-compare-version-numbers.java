class Solution {
    public int compareVersion(String version1, String version2) {
    String[]a = version1.split("\\.");
    String[]b = version2.split("\\.");
    int i=0;
    while(i<a.length || i<b.length){
        int num1=0;
        int num2=0;
        if(i<a.length){
            num1=Integer.parseInt(a[i]);
        }
        if(i<b.length){
            num2=Integer.parseInt(b[i]);
        }
        if(num1>num2){
            return 1;
        }
        if(num1<num2){
            return -1;
        }
        i++;
    }   
    return 0; 
    }
}