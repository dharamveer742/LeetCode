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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if(root == null) return ans;
        TreeNode curr = root ;
        while(curr!=null){
            if(curr.left!=null){
                TreeNode temp = curr.left;
                while(temp.right!=null && temp.right!=curr){
                    temp=temp.right;
                }
                if(temp.right == null){
                    temp.right = curr;
                    curr = curr.left;
                }
                else{
                    temp.right = null;
                    ans.add(curr.val);
                    curr = curr.right;
                }
            }
            else{
                ans.add(curr.val);
                curr = curr.right;
            }
        }
        return ans;
    }
}