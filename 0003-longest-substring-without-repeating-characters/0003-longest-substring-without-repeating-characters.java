class Solution {
    public int lengthOfLongestSubstring(String s) {
        ArrayList<Character> list = new ArrayList<>();
        int maxLen = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);           
            while (list.contains(ch)) {
                list.remove(0);
            }
            list.add(ch);
            maxLen = Math.max(maxLen, list.size());
        }
        return maxLen;
    }
}
