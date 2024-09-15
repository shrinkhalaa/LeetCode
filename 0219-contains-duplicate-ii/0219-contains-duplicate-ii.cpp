class Solution {
public:
    bool containsNearbyDuplicate(vector<int>& nums, int k) {
        unordered_set<int> s;
        int i = 0, j = 0;
        
        while (j < nums.size()) {
            // Check if the current element is already in the set
            if (s.find(nums[j]) != s.end()) {
                return true; // Found a nearby duplicate
            }

            // Insert the current element into the set
            s.insert(nums[j]);

            // Maintain the sliding window size: if window size exceeds k, remove the oldest element
            if (j - i >= k) {
                s.erase(nums[i]);
                i++;
            }

            // Move to the next element
            j++;
        }
        
        return false; // No nearby duplicates found
    }
};
