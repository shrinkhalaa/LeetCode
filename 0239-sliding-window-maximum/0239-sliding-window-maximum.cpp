class Solution {
public:
    vector<int> maxSlidingWindow(vector<int>& h, int k) {
        vector<int> ans;
        int n=h.size();
        deque<int> q;
        for(int i=0;i<n;i++){
        while(!q.empty()&&h[q.back()]<=h[i]) q.pop_back();
        if(!q.empty()&&q.front()==i-k) q.pop_front();
        q.push_back(i);
        if(i>=k-1) ans.push_back(h[q.front()]);
        }
        return ans;
    }
};