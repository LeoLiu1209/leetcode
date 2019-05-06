/*
You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

Note: Given n will be a positive integer.

Example 1:

Input: 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps
Example 2:

Input: 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step
*/
/*
  hint : DP 來解決， dp[i] = dp[i-1]+dp[i-2]
*/

class Solution {
    public int climbStairs(int n) {
        if(n==1||n==2)
            return n;
        int []arr = new int[n+1];
        arr[1]=1;
        arr[2]=2;
        for(int i=3; i<n+1; i++) {
            arr[i] = arr[i-1]+arr[i-2];
        }
        return arr[n];
    }
}
