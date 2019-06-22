/*
   DP 解題 : 維護 DP組
   規則:
       不能搶相臨的房子，所以拿 前一個房屋 vs 當前+前兩棟房子
       dp[0] = nums[0];
       dp[1] = 前兩棟的大數
       dp[2] = Math.max (current + dp[0], dp[1])
*/
class Solution {
    public int rob(int[] nums) {
        // exception check: if(nums.length==0) return 0 
        // extra check nums.lenght ==1 return nums[1] 不然下方的init dp 會爆炸
        if (nums.length <= 1) return nums.length==0 ? 0 : nums[0]; 
        
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for(int i = 2; i< nums.length; i++) {
            dp[i] = Math.max(dp[i-1], dp[i-2]+nums[i]); 
        }
        return dp[nums.length-1];
    }
}
// Recursive 
public int rob(int[] nums) {
    return rob(nums, nums.length - 1);
}
private int rob(int[] nums, int i) {
    if(i < 0) return 0;
    return Math.max( rob(nums, i-1), rob(nums, i-2) + nums[i]);
}
