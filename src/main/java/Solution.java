import java.util.Arrays;

class Solution {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = 0;
        int p2 = 0;
        int p = 0;
        int[] nums1_copy = new int[n + m];
        System.arraycopy(nums1, 0, nums1_copy, 0, m);


    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 3,0, 0,0};
        int m = 4;
        int[] arr2 = {2, 5, 6};
        int n = 3;
        merge(arr1, m, arr2, n);
        System.out.println(Arrays.toString(arr1));
    }
}