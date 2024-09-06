class Solution {
public:
    int minSubArrayLen(int target, vector<int>& nums) {
        int minlen=INT_MAX;
        int i=0,j=0;
        int count=0;
        while(j<nums.size()){
            count+=nums[j];
            while(count>=target){
                minlen=min(minlen,j-i+1);
                count-=nums[i];
                i++;
            }
            j++;
        }
        return minlen == INT_MAX ? 0 : minlen;
    }
};