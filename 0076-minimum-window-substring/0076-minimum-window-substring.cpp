class Solution {
public:
    string minWindow(string s, string t) {
        unordered_map<char, int> m;
        int req=t.length();
        for (char ch:t){
            m[ch]++;
        }
        int min_wnd=INT_MAX;
        int start=0;
        int i=0,j=0;
        while(j<s.length()){
            if (m[s[j]]>0){
                req--;
            }
            m[s[j]]--;
            while(req==0){
                min_wnd=min(min_wnd,j-i+1);
                if(min_wnd==j-i+1){
                    start=i;
                }
                m[s[i]]++;
                if(m[s[i]]>0){
                    req++;
                }
                i++;
            }
            j++;
        }
        return min_wnd==INT_MAX?"":s.substr(start,min_wnd);
    }
};