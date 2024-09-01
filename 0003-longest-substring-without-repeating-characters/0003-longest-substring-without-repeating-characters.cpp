class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        unordered_set<char> freq;
        int max_str=0, i=0, j=0, n=s.size();
        while(j<n){
            if(freq.find(s[j])==freq.end()){
                freq.insert(s[j]);
                max_str=max(max_str, j-i+1);
                j++;
            }
            else{
                freq.erase(s[i]);
                i++;
            }
        }
        return max_str;
    }
};