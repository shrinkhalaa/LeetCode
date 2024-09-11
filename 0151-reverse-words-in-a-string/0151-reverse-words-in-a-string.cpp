class Solution {
public:
    string reverseWords(string s) {
        stringstream ss(s);
        string word;
        stack<string> stk;
        while(ss>>word){
            stk.push(word);
        }
        string ans="";
        while(!stk.empty()){
                ans+=stk.top();
                stk.pop();
                if(!stk.empty())
                ans+=" ";
            }
        return ans;
    }
};