class Solution {
public:
    long long binary(int x){
        int left=0,right=x/2;
        long long ans=0;
        while(left<=right){
            long long mid=left+(right-left)/2;
            long long sq=mid*mid;
            if(sq==x){
                return mid;
            }
            else if(sq<x){
                ans=mid;
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return ans;
    }
    int mySqrt(int x) {
        if(x==0){
            return 0;
        }
        else if(x==1){
            return 1;
        }
        else{
        return(binary(x));
    }}
};