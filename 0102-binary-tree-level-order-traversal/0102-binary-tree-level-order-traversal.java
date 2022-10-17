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


//  BFS or Level Order Traversal TC :- 

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList();
        if(root==null){
            return ans;
        }
        q.offer(root);
        while(!q.isEmpty()){
            int cnt=q.size();
            List<Integer> level = new ArrayList<>();
            for(int i=1;i<=cnt;i++){
               TreeNode temp=q.poll();
               level.add(temp.val);
                if(temp.left!=null){
                    q.offer(temp.left);
                }
                if(temp.right!=null){
                    q.offer(temp.right);
                }
            }
            ans.add(level);
        }
        
        return ans;
        
        
    }
}