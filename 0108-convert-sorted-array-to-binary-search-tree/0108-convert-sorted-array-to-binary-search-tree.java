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
    public TreeNode sortedArrayToBST(int[] nums) {
        
        int low=0;
        int high=nums.length-1;
        TreeNode head = helper(nums,low,high);
        return head;
        
    }
    public static TreeNode helper(int[] nums,int low,int high){
        if(low>high){
            return null;
        }
        int mid=low+(high-low)/2;
        TreeNode temp=new TreeNode(nums[mid]);
        temp.left=helper(nums,low,mid-1);
        temp.right=helper(nums,mid+1,high);
        return temp;
        
    }
}