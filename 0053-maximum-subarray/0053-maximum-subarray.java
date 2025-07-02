class Solution {
    public int maxSubArray(int[] nums) {
        int count=0, ans=nums[0];
        for(int num:nums){
            count+=num;
            ans=Math.max(count,ans);
            if(count<0){
                count=0;
            }
        }
        return ans;
    }
}