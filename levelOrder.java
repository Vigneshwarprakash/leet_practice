class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(root, 0, ans);
        return ans;
    }
    void helper(TreeNode root, int level, List<List<Integer>> ans){
        if (root == null) return;
        if (level == ans.size()){
            ans.add(new ArrayList<>());
        }
        ans.get(level).add(root.val);
        helper(root.left, level + 1 , ans);
        helper(root.right, level+1 , ans);
    }    
}