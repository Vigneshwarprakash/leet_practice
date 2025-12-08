class Solution {
    public Node cloneGraph(Node node) {
        if (node == null) return node;
        
        Queue<Node> q = new LinkedList<>();
        HashMap<Integer, Node> oldToNew = new HashMap<>();
        
        oldToNew.put(node.val, new Node(node.val));
        q.add(node);

        while (!q.isEmpty()) {
            Node curr = q.poll();
            Node clone = oldToNew.get(curr.val);

            for (Node neighbor : curr.neighbors) {
                if (!oldToNew.containsKey(neighbor.val)) {
                    oldToNew.put(neighbor.val, new Node(neighbor.val));
                    q.add(neighbor);
                }
                clone.neighbors.add(oldToNew.get(neighbor.val));
            }
        }
        
        return oldToNew.get(node.val);
    }
}
