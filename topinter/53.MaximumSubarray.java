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
