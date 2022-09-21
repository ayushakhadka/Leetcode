/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> preorder(Node root) {
        
        ArrayList<Integer> list = new ArrayList<>();
        preorderTraversal(root, list);
        return list; 
    }
    
    public void preorderTraversal(Node node, ArrayList<Integer> list){
        if(node == null)
            return;
        list.add(node.val);
        
        for(Node n: node.children)
            preorderTraversal(n,list);
        return;
    }
}