class Solution {
    public int lengthOfLongestSubstring(String s) {
        int first = 0;
        int sec = 1;
        int count = 1;
        int max = 0;
        if (s.length() == 0)
            return 0;

        if (s.length() == 1)
            return 1;
        Set<Character> a = new HashSet<>();
        a.add(s.charAt(0));
        while (sec < s.length()) {
            if (a.add(s.charAt(sec))) {
                count++;
                sec++;
            } else {
                a.clear();
                first++;
                a.add(s.charAt(first));
                sec = first + 1;
                count = 1;
            }
            if (max < count)
                max = count;
        }
        return max;
    }
}
