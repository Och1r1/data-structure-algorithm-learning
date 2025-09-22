public class WordDictionary {
    private TrieNode root;

    public WordDictionary() {
        root = new TrieNode();
    }

    public void addWord(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            int index = c - 'a';
            if (node.children[index] == null) {
                node.children[index] = new TrieNode();
            }
            node = node.children[index];
        }
        node.isEnd = true;
    }

    public boolean search(String word) {
        return dfs(word, 0, root);
    }

    private boolean dfs(String word, int index, TrieNode node) {
        if (index == word.length()) {
            return node.isEnd;
        }

        char c = word.charAt(index);
        if (c != '.') {
            int childIndex = c - 'a';
            if (node.children[childIndex] != null) {
                return dfs(word, index + 1, node.children[childIndex]);
            }
            return false;
        } else {
            for (int i = 0; i < 26; i++) {
                if (node.children[i] != null &&
                    dfs(word, index + 1, node.children[i])) {
                    return true;
                }
            }
            return false;
        }
    }
}

class TrieNode {
    TrieNode[] children = new TrieNode[26];
    boolean isEnd = false;
}
