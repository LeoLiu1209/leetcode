/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 
 /*
  hint : 
    1.取出中間值當root , mid = left + (right - left) / 2 => root = new TreeNode(nums[mid])
    2.遞迴左子樹 helper(nums, left, mid-1) // 左子樹起起始點不變 結束點為 mid-1
    3.遞迴右子樹 helper(nums, mid+1, right) // 右子樹起結束點不變 起始點 mid+1
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0 ) return null;
        return helper(nums, 0, nums.length - 1);
    }
    
    private TreeNode helper(int[] nums, int left, int right) {
        if(left > right ) return null;
        int mid = left + (right-left)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = helper(nums, left, mid-1);
        root.right = helper(nums, mid+1, right);
        return root;
    }
    
}
