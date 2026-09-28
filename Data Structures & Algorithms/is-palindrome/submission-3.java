class Solution {
    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;
        s = s.toLowerCase();
        if(s.length()<4&&!Character.isLetterOrDigit(s.charAt(0))){
            return true;
        }
        while (r >= l) {
            while (r >=0 && !Character.isLetterOrDigit(s.charAt(r))) {
                r--;
            }
            while (l < s.length()  && !Character.isLetterOrDigit(s.charAt(l))) {
                l++;
            }
            if (r >= 0 && l < s.length() && s.charAt(r) == s.charAt(l)) {
                r--;
                l++;

            } else {
                return false;
            }
        }
        return true;
    }
}
