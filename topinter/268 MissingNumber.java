/*
Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.

Example 1:

Input: [3,0,1]
Output: 2
Example 2:

Input: [9,6,4,2,3,5,7,0,1]
Output: 8
Note:
Your algorithm should run in linear runtime complexity. Could you implement it using only constant extra space complexity?
*/
/*
思路:
  未排序Array:先用 n(n+1)/2 算出 0~n的總和，再利用總合一個一個扣掉array的值，就可以找到 missing num了!
  排序過的Array:利用binary search來查找
*/
class Solution {
    public int missingNumber(int[] nums) {
        int len = nums.length;
        int sum = len*(len+1)/2;
        for(int i : nums) {
            sum = sum - i;
        }
        int missingNum = sum;
        return missingNum;
    }
}

class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int left=0, right = nums.length-1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(nums[mid]>mid) right = mid-1;
            else left = mid+1;
        }
        return left;
    }
}
