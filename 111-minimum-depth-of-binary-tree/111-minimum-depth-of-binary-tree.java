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
    public int minDepth(TreeNode root) {
        
        if(root == null) return 0;
        
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
        
        int minDepth = 1;
        
        while(!que.isEmpty()){
            int len = que.size();
            
            while(len-->0){
                TreeNode temp = que.poll();
                
                if(temp.left==null && temp.right==null)
                    return minDepth;
                
                if(temp.left != null)
                    que.add(temp.left);
                
                if(temp.right != null)
                    que.add(temp.right);
            }
            minDepth++;
        }
        return 0;
        
    }
}




















