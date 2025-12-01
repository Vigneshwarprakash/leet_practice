class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;
        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.offerLast(root);
        int currentLevel = 1;
        while (!deque.isEmpty()) {
            int numNodesAtCurrentLevel = deque.size();
            List<Integer> levelResult = new ArrayList<>();
            for (int i = 0; i < numNodesAtCurrentLevel; i++) {
                if (currentLevel % 2 == 0) {
                    TreeNode node = deque.pollLast();
                    levelResult.add(node.val);
                    if (node.right != null) deque.offerFirst(node.right);
                    if (node.left != null) deque.offerFirst(node.left);
                } 
                else {
                    TreeNode node = deque.pollFirst();
                    levelResult.add(node.val);
                    if (node.left != null) deque.offerLast(node.left);
                    if (node.right != null) deque.offerLast(node.right);
                }
            }
            result.add(levelResult);
            currentLevel++;
        }
        return result;
    }
}