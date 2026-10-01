class Solution {
    public String lexSmallest(String s) {
        int n = s.length();
        String ans = s;
        String prefix = s.substring(0, 1);
        String suffix = s.substring(n - 1, n);

        for (int i = 1; i < n; i++) {
            prefix = s.charAt(i) + prefix; 
            String str = prefix + s.substring(i + 1);
            if (ans.compareTo(str) > 0) ans = str;
        }

      
        for (int i = n - 2; i >= 0; i--) {
            suffix = suffix + s.charAt(i); 
            String str = s.substring(0, i) + suffix;
            if (ans.compareTo(str) > 0) ans = str;
        }

        return ans;
    }
}