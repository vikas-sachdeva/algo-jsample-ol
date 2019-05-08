package algo.jsample.trie;

public class TrieOperations {

	private static final int ALPHABET_SIZE = 26;

	static class TrieNode {

		TrieNode[] childNodes = new TrieNode[ALPHABET_SIZE];

		String value;

	}

	private TrieNode rootNode;

	public TrieOperations() {
		rootNode = new TrieNode();
		rootNode.value = "";
	}

	public TrieNode insert(String key, String value) {
		TrieNode temp = rootNode;
		for (int i = 0; i < key.length(); i++) {
			char ch = key.charAt(i);
			int index = ch - 'a';
			if (temp.childNodes[index] == null) {
				TrieNode trieNode = new TrieNode();
				temp.childNodes[index] = trieNode;
				temp = trieNode;
			} else {
				temp = temp.childNodes[index];
			}
		}
		temp.value = value;
		return temp;
	}

	public String search(String key) {
		TrieNode temp = rootNode;
		int i = 0;
		for (; i < key.length(); i++) {
			char ch = key.charAt(i);
			int index = ch - 'a';
			if (temp.childNodes[index] != null) {
				temp = temp.childNodes[index];
			} else {
				break;
			}
		}
		if (i == key.length()) {
			return temp.value;
		} else {
			return null;
		}
	}
}