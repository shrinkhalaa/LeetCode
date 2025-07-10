class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans= new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            if (nums[i] > 0) break;
            if(i>0 && nums[i-1]==nums[i]){
                continue;
            }
            int lo=i+1;
            int hi=nums.length-1;
            while(i!=nums.length && lo<hi){
                int sum=nums[i]+nums[lo]+nums[hi];
                if(sum==0){
                    List<Integer> triplet = Arrays.asList(nums[i], nums[lo], nums[hi]);
                    ans.add(triplet);

                    // curr.add(nums[i]);
                    // curr.add(nums[lo]);
                    // curr.add(nums[hi]);
                    // ans.add(curr);
                    // curr.clear();

                    while (lo < hi && nums[lo] == nums[lo + 1]) lo++;
                    while (lo < hi && nums[hi] == nums[hi - 1]) hi--;

                    lo++;
                    hi--;
                }
                else if(sum<0){
                    lo++;
                }
                else{
                    hi--;
                }
            }
        }
        return ans;
    }
}