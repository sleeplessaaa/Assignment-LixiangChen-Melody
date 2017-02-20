package assignment5;

public class Merge {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
        int runner = m + n - 1, runner1 = m - 1, runner2 = n - 1;
        
        while (runner >= 0) {
            if (runner1 < 0) {
                nums1[runner] = nums2[runner2];
                runner--;
                runner2--;
                continue;
            } else if (runner2 < 0) {
                nums1[runner] = nums1[runner1];
                runner--;
                runner1--;
                continue;
            }
            
            if (nums1[runner1] > nums2[runner2]) {
                nums1[runner] = nums1[runner1];
                runner1--;
            } else {
                nums1[runner] = nums2[runner2];
                runner2--;
            }
            runner--;
        }
    }
}
