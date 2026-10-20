class Solution {
    public int[] twoSum(int[] numbers, int target) {
                HashMap<Integer,Integer> map = new HashMap<>();

        int a=1;
        int[] b= new int[2];
        for(int i=0;i<numbers.length;i++){
            if(map.containsKey(target-numbers[i])){
                b[0]=map.get(target-numbers[i]);
                b[1]=i+1;
                return b;
            }
            else{
                map.put(numbers[i],i+1);
            }
        }
        return b;
    }
}
