class Solution {
public:
    vector<int> getAverages(vector<int>& nums, int k) {
        int n=nums.size();
        vector<int>ans(n,-1);
      int j=0, i=0;
      long long sum=0;
        while(j<n){
            sum +=nums[j];
             if(j-i+1<2*k+1){
                j++;
                   }
          else if(j-i+1==2*k+1){ 
                ans[i+k]=sum/(2*k+1);
                sum-=nums[i];
                i++;
                j++;
                
            }
             else {
                break;
            }

        }
        return ans;
        
    }
};