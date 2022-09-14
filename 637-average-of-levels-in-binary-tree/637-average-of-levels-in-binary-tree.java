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
    public List<Double> averageOfLevels(TreeNode root) {

        List<Double> res = new ArrayList<>(); 
        Queue<TreeNode> que = new LinkedList<>();
        que.offer(root);
        
        while(!que.isEmpty()){
            int size = que.size();
            double totalSum = 0;
            int numElement = size;
            
            while(size-->0){
                TreeNode head = que.poll();
                totalSum += head.val;
                if(head.left != null){
                    que.offer(head.left);
                }
                if(head.right != null){
                    que.offer(head.right);
                }
            }
            res.add(new Double(totalSum/numElement));
        }
        return res;
    }
}
        


