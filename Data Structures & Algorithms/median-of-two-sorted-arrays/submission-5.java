class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length + nums2.length];
        if(nums1.length>0) for (int i = 0; i < nums1.length; i++) {
            res[i] = nums1[i];
        }
        if(nums2.length>0) for (int j = 0; j < nums2.length; j++) {
           res[j + nums1.length] = nums2[j];
        }
        Arrays.sort(res);
        int b = (res.length-1) / 2;
        System.out.println(res.length);
        
        
        if (res.length % 2 == 0) {
            double a = (double)(res[b] + res[b + 1]) / 2 ;
            return a;
        } else
            return res[res.length / 2];
    }
}
