class Solution {
public:
    vector<int> findAnagrams(string s, string p) {
        int i=0,j=0;
        vector<int> p1(26,0), s1(26,0),result;
        if (s.length() < p.length()) {
            return result;}
        for (char ch: p){
            p1[ch-'a']++;
        }
        while(j<s.length()){
            s1[s[j]-'a']++;
            if(j-i+1==p.length()){
                if(s1==p1){
                    result.push_back(i);
                }
                s1[s[i]-'a']--;
                i++;
            }
            j++;
        }
        return result;
    }
};