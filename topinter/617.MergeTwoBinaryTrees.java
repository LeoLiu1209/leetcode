/*
You need to merge them into a new binary tree. The merge rule is that if two nodes overlap, 
then sum node values up as the new value of the merged node. Otherwise, the NOT null node will be used as the node of new tree.

Example 1:

Input: 
	Tree 1                     Tree 2                  
          1                         2                             
         / \                       / \                            
        3   2                     1   3                        
       /                           \   \                      
      5                             4   7                  
Output: 
Merged tree:
	     3
	    / \
	   4   5
	  / \   \ 
	 5   4   7
   
hints:
1.重疊的結點相加
2.若其中一個不重疊則直接回傳
*/
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1 == null && t2 == null)
            return null;
        if(t1 == null && t2 != null)
            return t2;
        if(t1 != null && t2 == null)
            return t1;
        t1.val += t2.val; //避免重複生成結點，節省時間
        t1.left = mergeTrees(t1.left, t2.left);
        t.right = mergeTrees(t1.right, t2.right);
        return t1;
    }
}
