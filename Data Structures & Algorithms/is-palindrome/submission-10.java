class Solution {
    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;
        s = s.toLowerCase();
        while (l<r) {
            while (l<r&& !Character.isLetterOrDigit(s.charAt(r))) {
                r--;
            }
            while (l<r && !Character.isLetterOrDigit(s.charAt(l))) {
                l++;
            }
             if (l<r&& s.charAt(r) != s.charAt(l)){return false;}
            if (l<r&& s.charAt(r) == s.charAt(l)) {
                r--;
                l++;

            }
        }
        return true;
    }
}
