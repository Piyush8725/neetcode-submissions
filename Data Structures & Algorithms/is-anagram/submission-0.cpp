class Solution {
public:
    bool isAnagram(string s, string t) {
        int counts[26]={0};
        if(s.length()!=t.length())return false;
        for(int i=0;i<s.length();i++){
            char x=s[i];
            int index=x-'a';
            counts[index]++;
        }
        for(int j=0;j<t.length();j++){
            int x=t[j];
            char index=x-'a';
            counts[index]--;
            if(counts[index]<0)return false;
        }
        
        return true;
    }
};
