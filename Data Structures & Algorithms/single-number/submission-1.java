class Solution {
    public int singleNumber(int[] nums) {
        List<Integer> s = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(s.contains(nums[i])){
                int n=s.indexOf(nums[i]);
                s.remove(n);
            }else{
                s.add(nums[i]);
            }
        }
        int n=s.get(0);
        return n;
    }
}
