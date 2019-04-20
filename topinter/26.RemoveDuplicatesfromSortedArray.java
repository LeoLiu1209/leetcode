/*
Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

Example 1:

Given nums = [1,1,2],

Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.

It doesn't matter what you leave beyond the returned length.
*/

/*
According to requirement the space complixity need to be O(1), so we cant use hashset buz the spcace compliexity will be O(N)
*/
class Solution {
    public int removeDuplicates(int[] nums) {
        int j=0;
        for(int i=1; i<nums.length; i++) {
            if(nums[i]!=nums[j]){
                j++;
                nums[j]= nums[i];
            }
        }    
        return j+1;
    }
}
