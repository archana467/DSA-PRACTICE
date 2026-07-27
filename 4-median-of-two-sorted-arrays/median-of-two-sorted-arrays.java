import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        double[] temp = new double[n1 + n2];
        for (int i = 0; i < n1; i++) {
            temp[i] = nums1[i];
        }
        for (int i = 0; i < n2; i++) {
            temp[n1 + i] = nums2[i];
        }
        Arrays.sort(temp);
        int totalLen = temp.length;
        int mid = totalLen / 2;
        if (totalLen % 2 != 0) {
            return temp[mid];
        } else {        
            return (temp[mid - 1] + temp[mid]) / 2.0;
        }
    }
}