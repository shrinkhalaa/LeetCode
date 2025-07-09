class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int res= Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int lo=i+1;
            int hi=nums.length-1;
            while(lo<hi){
                int sum=nums[i]+nums[lo]+nums[hi];
                if (sum == target) {
                    return target; // exact match found
                }
                if(Math.abs(res-target)>Math.abs(sum-target)){
                    res=sum;
                }
                if (sum < target) {
                    lo++;
                } else {
                    hi--;
                }
            }
        }
        return res;
    }
}