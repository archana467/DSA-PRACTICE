class Solution {
    public int[] findOriginalArray(int[] changed) {
        if (changed.length % 2 != 0) {
            return new int[0];
        }
        Arrays.sort(changed);
        Map<Integer, Integer> count = new HashMap<>();
        for (int x : changed) {
            count.put(x, count.getOrDefault(x, 0) + 1);
        }
        int[] result = new int[changed.length / 2];
        int idx = 0;
        for (int x : changed) {
            if (count.get(x) == 0) {
                continue;
            }
            int doubleV = x * 2;
            if (count.getOrDefault(doubleV, 0) == 0) {
                return new int[0];
            }
            if (x == 0 && count.get(x) < 2) {
                return new int[0];
            }
            result[idx++] = x;
            count.put(x, count.get(x) - 1);
            count.put(doubleV, count.get(doubleV) - 1);
        }

        return result;
    }
}