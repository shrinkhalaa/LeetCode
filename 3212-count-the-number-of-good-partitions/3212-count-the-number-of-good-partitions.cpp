class Solution {
public:
    int M=1e9+7;
    int numberOfGoodPartitions(vector<int>& nums) {
        unordered_map<int,int> pos;
        int ans=1;
        for(int i=0;i<nums.size();i++){
            pos[nums[i]]=i;
        }
        int i=0, j=0;
        j=max(j,pos[nums[0]]);
        while(i<nums.size()){
            if(j<i){
                ans=(ans*2)%M;
            }
            j=max(j,pos[nums[i]]);
            i++;
        }
        return ans;
    }
};