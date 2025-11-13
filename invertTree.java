class Solution {
    public TreeNode invertTree(TreeNode root) {
        reverse(root);
        return root;
    }

    void reverse(TreeNode node) {
        if(node == null) {
            return;
        }
        TreeNode temp = node.right;
        node.right = node.left;
        node.left = temp;

        reverse(node.left);
        reverse(node.right);
    }
}