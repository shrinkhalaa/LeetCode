class Solution {
    public void swap(int[] arr, int a, int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public void sortColors(int[] nums) {
        int l=0, m=0, h=nums.length-1;
        while(m<=h){
            if(nums[m]==0){
                swap(nums, m, l);
                m++;
                l++;
            }
            else if(nums[m]==1){
                m++;
            }
            else{
                swap(nums, m, h);
                h--;
            }
        }
    }
}