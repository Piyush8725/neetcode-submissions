class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        Arrays.sort(nums);
        int count = 0;
        int max=0;
        for(int n:nums){
            set.add(n);
        }
        List<Integer> list=new ArrayList<>(set);
        Collections.sort(list);
        Iterator it = set.iterator();
        for(int i=0;i<list.size()-1;i++){
            int a=list.get(i);
            int b=list.get(i+1);
            if(b-a==1){
                ++count;
            }else{
                count=0;
            }
            if(max<count)max=count;
        }
        if(list.size()==0)return 0;
        return max+1;
    }
}
