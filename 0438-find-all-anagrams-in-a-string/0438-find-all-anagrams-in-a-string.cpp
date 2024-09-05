class Solution {
public:
    vector<int> findAnagrams(string s, string p) {
        int i=0,j=0;
        map<char, int> s1,p1;
        vector<int> result;
        if(p.length()>s.length()){
            return result;
        }
        for(char c:p){
            p1[c]++;
        }
        while(j<s.length()){
            s1[s[j]]++;
            if(j-i+1==p.length()){
                if(s1==p1){
                    result.push_back(i);
                }
                s1[s[i]]--;
                if (s1[s[i]] == 0) {
                    s1.erase(s[i]);
                }
                i++;
            }
            j++;
        }
        return result;
    }
};