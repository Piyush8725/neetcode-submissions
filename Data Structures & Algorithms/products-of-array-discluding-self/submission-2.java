class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] p = new int[nums.length];
        int[] s = new int[nums.length];
        int pro = 1;
        p[0]=1;
        s[nums.length-1]=1;
        for (int i = 1; i < nums.length; i++) {
            pro = pro * nums[i - 1];
            p[i] = pro;
        }
        pro = 1;
        for (int j = nums.length-2; j >=0; j--) {
            pro = pro * nums[j +1];
            s[j] = pro;
        }
        for(int k=0;k<nums.length;k++){
            nums[k]=s[k]*p[k];
        }
        return nums;
    }
}
