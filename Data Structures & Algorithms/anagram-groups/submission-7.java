class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        
        boolean[] used = new boolean[strs.length];
        for (int i = 0; i < strs.length; i++) {
            List<String> slist = new ArrayList<>();
            if (used[i]) continue;
            String a = strs[i];
            slist.add(a);
            used[i] = true;
            for (int j = i + 1; j < strs.length; j++) {
                if (!used[j] && a.length() == strs[j].length() && Va(a, strs[j])) {
                    slist.add(strs[j]);
                    used[j] = true;
                }
            }

            list.add(slist);
            
        }
        return list;
    }
    public Boolean Va(String s, String t) {
        int a[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int x = s.charAt(i) - 'a';
            a[x]++;
        }
        for (int j = 0; j < t.length(); j++) {
            int x = t.charAt(j) - 'a';
            a[x]--;
        }
        for (int k = 0; k < a.length; k++) {
            if (a[k] == 0) {
            } else {
                return false;
            }
        }
        return true;
    }
}
