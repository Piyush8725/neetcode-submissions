class Solution {
    public boolean isAnagram(String s, String t) {
        int a[]= new int[26];
        for(int i=0;i<s.length();i++){
            int x=s.charAt(i)-'a';
            a[x]++;
        }
        for(int j=0;j<t.length();j++){
            int x=t.charAt(j)-'a';
            a[x]--;
        }
        for(int k=0;k<a.length;k++){
            if(a[k]==0){
            }
           else{
            return false;
           } 
        }
        return true;
    }
}
