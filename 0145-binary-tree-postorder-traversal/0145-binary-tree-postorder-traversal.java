/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
         postOrderHelper(root,ans);
         return ans;
        
        
    }
    public static void postOrderHelper(TreeNode root,List<Integer> al){
        if(root==null){
            return ;
        }
        postOrderHelper(root.left,al);
        postOrderHelper(root.right,al);
       al.add((root.val));
        
    }
}