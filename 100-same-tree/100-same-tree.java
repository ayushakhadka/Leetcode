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
    public boolean isSameTree(TreeNode p, TreeNode q) {
 
        if(p==null && q==null)
            return true;
        
        if(p==null || q==null)
            return false;
        
        Stack<TreeNode> stack1 = new Stack();
        Stack<TreeNode> stack2 = new Stack();
        
        stack1.push(p);
        stack2.push(q);
        
        while(!stack1.isEmpty() && !stack2.isEmpty()){
            TreeNode node1 = stack1.pop();
            TreeNode node2 = stack2.pop();
            
            if(node1.val != node2.val)
                return false;
            
            if(node1.left != null && node2.left != null){
                stack1.push(node1.left);
                stack2.push(node2.left);
            }else if(!(node1.left == null && node2.left == null)){
                return false;
            }
            
            if(node1.right != null && node2.right != null){
                stack1.push(node1.right);
                stack2.push(node2.right);
            }else if(!(node2.right == null && node2.right ==null)){
                return false;
                
            }
        }
        
        if(stack1.size() != stack2.size())
            return false;
        return true;
        
    }
}











