class Solution {
public:
    bool containsNearbyDuplicate(vector<int>& nums, int k) {
        int j=0;
        unordered_map<int,int> m;
        while(j<nums.size()){
            if(m.find(nums[j])!=m.end()){
                if(abs(m[nums[j]]-j)<=k){
                    return true;
                }
            }
            m[nums[j]]=j;
            j++;
        }
        return false;
    }
};