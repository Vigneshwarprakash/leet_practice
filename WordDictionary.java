class TrieNode {
    TrieNode[] child = new TrieNode[26];
    boolean end = false;
}
class WordDictionary {
    private TrieNode root;

    public WordDictionary() {
        root = new TrieNode();
    }
    public void addWord(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            int idx = c - 'a';
            if (node.child[idx] == null)
                node.child[idx] = new TrieNode();
            node = node.child[idx];
        }
        node.end = true;
    }
    public boolean search(String word) {
        return search(word, 0, root);
    }

    private boolean search(String word, int idx, TrieNode node) {
        if (node == null) return false;
        if (idx == word.length()) return node.end;

        char c = word.charAt(idx);
        if (c != '.') {
            return search(word, idx + 1, node.child[c - 'a']);
        }
        for (int k = 0; k < 26; k++)
            if (search(word, idx + 1, node.child[k]))
                return true;

        return false;
    }
}