/*
Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

Example:

Input: [-2,1,-3,4,-1,2,1,-5,4],
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
Follow up:

If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
*/
/*
  hint:DP! DP! DP!
  nums : [1,-1,2,3]
  dp   : [1,0(1+ -1),2(0+2),5(2+3)]
*/
class Solution {
    public int maxSubArray(int[] nums) {
        int []dp = new int[nums.length];
        int maxSum = dp[0] = nums[0];
        for(int i=1; i<nums.length; i++){
            //判斷當前nums[i]還是 nums[i]+dp[i-1]比較大就讓入該dp[i]
            dp[i] = Math.max(nums[i], nums[i]+dp[i-1]);
            //隨時記錄最大，若有變動就進行記錄，可以省去在loop的動作
            maxSum = Math.max(maxSum, dp[i]);
        }
        return maxSum;
    }
}
