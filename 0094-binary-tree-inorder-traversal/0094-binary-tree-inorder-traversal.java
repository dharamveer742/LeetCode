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
        TreeNode curr = root;
        Stack<TreeNode> st = new Stack<>();
        while(!st.isEmpty() || curr!=null){
            if(curr!=null){
                st.push(curr);
                curr = curr.left;
            }
            else{
                TreeNode popped = st.pop();
                ans.add(popped.val);
                curr = popped.right;
            }
        }
        return ans;
    }
}