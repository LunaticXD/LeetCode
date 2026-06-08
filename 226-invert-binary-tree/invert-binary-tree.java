class Solution {
    public TreeNode invertTree(TreeNode root) {

        if(root == null) return null;
        DFS(root);
        return root;
    }

    public TreeNode DFS(TreeNode node){
        if(node == null) return null;

        TreeNode left = DFS(node.left);
        TreeNode right = DFS(node.right);

        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;

        return node;
    }
}
    
