package algo.jsample.trie;

public class TrieOperations<T> {

	private static final int ALPHABET_SIZE = 26;

	private static class TrieNode<T> {

		private TrieNode<T>[] childNodes = new TrieNode[ALPHABET_SIZE];

		private T value;

	}

	private TrieNode<T> rootNode;

	public TrieOperations() {
		rootNode = new TrieNode<>();
		rootNode.value = null;
	}

	public TrieNode<T> insert(String key, T value) {
		TrieNode<T> temp = rootNode;
		for (int i = 0; i < key.length(); i++) {
			char ch = key.charAt(i);
			int index = ch - 'a';
			if (temp.childNodes[index] == null) {
				TrieNode<T> trieNode = new TrieNode<T>();
				temp.childNodes[index] = trieNode;
			}
			temp = temp.childNodes[index];
		}
		temp.value = value;
		return temp;
	}

	public T search(String key) {
		TrieNode<T> temp = rootNode;
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