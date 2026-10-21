// class Solution {
//     public int longestCommonSubsequence(String text1, String text2) {
//         int i =0;
//         int j =0;
//         int n1=text1.length();
//         int n2=text2.length();
//         int count=0;
//         int []arr1 = new int[n1];
//         int[]arr2 =new int[n2];
//         for( i=0;i<n1;i++){
//             for( j=i+1;i<n2;j++){

            
//         if(arr1[i]==arr2[j]){
//             i++;
//             j++;
//             count+=1;
//         }
//         else{
//             i++;
//         }
//             }
//         }
//         return count;
//     }
// }

// class Solution {
//      public int longestCommonSubsequence(String text1, String text2) {
//         int i=0;
//         int j=0;
//         if(i=text1.length()|| text2.length()){
//             return 0;
//         }
//         if(text1.charAt(i)==text2.charAt(j)){
//             return (text1,text2,i+1,j+1);
//         }
//         else{
//             return Math.max(tex1,text2,i+1,j),(tex1,text2,i,j+1);
//         }

//      }
// }

// class Solution {
//      public int longestCommonSubsequence(String text1, String text2) {
//         int n1=text1.length();
//         int n2=text2.length();
//         int memo[][] =new int[n1][n2];
//         return helper(text1,text2,0,0,memo);
//      }
//      private int helper(String s1,String s2,int i,int j,int[][]memo){
//         if(i==s1.length()|| j== s2.length()){
//             return 0;
//         }
//         if(memo[i][j]!=null){
//             return memo[i][j];
//         }
//         if(s1.charAt(i)==s2.charAt(j)){
//             memo[i][j]= 1 + helper(s1,s2,i+1,j+1);
//         }
//         else{
//             memo[i][j]=Math.max(helper(s1,s2,i+1,j),helper(s1,s2,i,j+1));

//         }
//         return memo[i][j];

//      }
// }
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n1 = text1.length();
        int n2 = text2.length();
        Integer[][] memo = new Integer[n1][n2]; // memoization array
        return helper(text1, text2, 0, 0, memo);
    }

    private int helper(String s1, String s2, int i, int j, Integer[][] memo) {
        if (i == s1.length() || j == s2.length()) return 0;

        if (memo[i][j] != null) return memo[i][j];

        if (s1.charAt(i) == s2.charAt(j)) {
            memo[i][j] = 1 + helper(s1, s2, i + 1, j + 1, memo);
        } else {
            memo[i][j] = Math.max(
                helper(s1, s2, i + 1, j, memo),
                helper(s1, s2, i, j + 1, memo)
            );
        }

        return memo[i][j];
    }
}
