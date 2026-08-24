class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int netSum = n * (n + 1) / 2;
        for (int i = 0; i < n; i++){
            sum = sum + nums[i];
        }
        return netSum - sum;
    }
}