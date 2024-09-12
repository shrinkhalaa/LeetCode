class Solution {
public:
    int minPairSum(vector<int>& nums) {
        sort(nums.begin(),nums.end());
        int i=0,j=nums.size()-1;
        int ans=0;
        while(i<j){
            int mx=nums[i]+nums[j];
            ans=max(ans, mx);
            i++;
            j--;
        }
        return ans;
    }
};