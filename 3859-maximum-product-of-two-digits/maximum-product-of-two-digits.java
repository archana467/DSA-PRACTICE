class Solution {
    public int maxProduct(int n) {
      String st=String.valueOf(n);
      int[] arr=new int[st.length()];
      for(int i=0;i<arr.length;i++){
        arr[i]=st.charAt(i)-'0';
      }
      Arrays.sort(arr);
      int prod=arr[arr.length-1]*arr[arr.length-2];
      return prod;
    }

}