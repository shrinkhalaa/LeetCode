class Solution {
public:
    vector<int> searchRange(vector<int>& nums, int target) {
        int count=0;
        vector<int> ans;
        for(int i=0;i<nums.size();i++){
            if(nums[i]==target){
                count++;
                if(count==1){
                    ans.push_back(i);
                }
            }
        }
        
        if(ans.empty()){
            return {-1,-1};
        }
        else{
            ans.push_back(ans[0]+count-1);
        }
        return ans;
    }
};