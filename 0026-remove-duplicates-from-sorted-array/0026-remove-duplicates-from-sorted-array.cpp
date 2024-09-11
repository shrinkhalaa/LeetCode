class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int i=0,j=1;
        while(j<nums.size()){
           if(nums[j]!=nums[i]){
            i++;
            nums[i]=nums[j];
           }
           j++;
        }
        return i+1;
    }
};