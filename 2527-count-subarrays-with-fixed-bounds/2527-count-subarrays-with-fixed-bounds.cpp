class Solution {
public:
    long long countSubarrays(vector<int>& nums, int minK, int maxK) {
        long long ans=0;
        int minkPos=-1, maxkPos=-1, cPos=-1;
        for(int i=0;i<nums.size();i++){
            if(nums[i]==minK){
                minkPos=i;
            }
            if(nums[i]==maxK){
                maxkPos=i;
            }
            if(nums[i]<minK || nums[i]>maxK){
                cPos=i;
            }
            long long smaller=min(minkPos,maxkPos);
            long long temp=smaller-cPos;
            ans+=(temp<=0)? 0:temp;
        }
        return ans;
    }
};
