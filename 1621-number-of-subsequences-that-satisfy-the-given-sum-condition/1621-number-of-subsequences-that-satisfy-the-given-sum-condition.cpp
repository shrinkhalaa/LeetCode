class Solution {
public:
    int numSubseq(vector<int>& nums, int target) {
        sort(nums.begin(),nums.end());
        const int MOD = 1e9 + 7;
        int i=0, j=nums.size()-1;
        int ans=0;
        vector<int> powers(nums.size(), 1);
        for (int k = 1; k < nums.size(); ++k) {
            powers[k] = (powers[k - 1] * 2) % MOD;
        }
        while(i<=j){
            if(nums[i]+nums[j]<=target){
                ans = (ans + powers[j - i]) % MOD;
                i++;
            }
            else{
                j--;
            }
        }
        return ans;
    }
};