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
    int idx=0;
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root=helper(preorder,Integer.MIN_VALUE,Integer.MAX_VALUE);
        
        return root;
        
    }
    public TreeNode helper(int[] preorder,int low,int high){
        if(idx==preorder.length || preorder[idx]>high || preorder[idx]<low){
            return null;
        }
        int val=preorder[idx++];
        TreeNode temp=new TreeNode(val);
        temp.left=helper(preorder,low,val);
        temp.right=helper(preorder,val,high);
        
        return temp;
        
    }
}