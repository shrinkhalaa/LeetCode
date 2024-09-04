class Solution {
public:
    bool uniqueOccurrences(vector<int>& arr) {
        unordered_map<int, int> s;
        for(int num:arr){
            s[num]++;
        }
        set<int> m;
        for(auto& n: s){
            m.insert(n.second);
        }
        return (m.size()==s.size());
    }
};