class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int count=1;
        Arrays.sort(nums);
        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1]){
                count++;
            }
            else{
                count=1;
            }
            if(count>n/2){
                return nums[i];
            }    
        }
        return nums[0];
    }
}
