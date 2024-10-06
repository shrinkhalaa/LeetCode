class Solution {
public:
    int maxVowels(string s, int k) {
        unordered_set<char> vowels = {'a','e','i','o','u','A','E','I','O','U'};
        int vow = 0, maxVow = 0, i = 0, j = 0;
        while (j < s.size()) {
            if (vowels.find(s[j]) != vowels.end()) {
                vow++;
            }
            if (j - i + 1 == k) {
                maxVow = max(maxVow, vow);
                if (vowels.find(s[i]) != vowels.end()) {
                    vow--;
                }
                i++;
            }
            j++;
        }
        
        return maxVow;
    }
};
