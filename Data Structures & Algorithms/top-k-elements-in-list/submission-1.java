class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] a = new int[k];
        Map<Integer, Integer> map = new HashMap<>();
        int count = 1;
        for (int n : nums) {
            if (map.containsKey(n)) {
                int x = map.get(n);
                map.put(n, ++(x));
            } else
                map.put(n, count);
        }
        List<Integer> list = new ArrayList<>(map.values());
        List<Integer> l = new ArrayList<>(map.keySet());
        int max = Collections.max(list);
        int u = 0;
        while (u < k) {
            if (list.contains(max)) {
                int i = list.indexOf(max);
                a[u] = l.get(i);
                u++;
                list.remove(i);
                l.remove(i);
            } else
                max--;
        }

        return a;
    
}
}
