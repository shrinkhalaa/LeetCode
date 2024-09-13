class Solution {
public:
    int minimumLength(string s) {
        int n=s.length()-1;
        char a;
        int i=0,j=n;
        while(i<j && s[i]==s[j]){
            a= s[i];
            while(i<=j && s[i]==a){
                i++;
            }
            while(i<=j && s[j]==a){
                j--;
            }
        }
        return j-i+1;
    }
};