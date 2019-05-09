package algo.jsample;

public class Bst<T extends Comparable<T>> {

	private static class TreeNode<T> {

		private TreeNode<T> leftNode;

		private TreeNode<T> rightNode;

		private T value;

	}

	private TreeNode<T> rootNode;

	public TreeNode<T> insert(T value) {

		TreeNode<T> newNode = new TreeNode<>();
		newNode.value = value;

		if (rootNode == null) {
			rootNode = newNode;
		} else {
			TreeNode<T> temp = rootNode;
			while (temp != null) {
				if (temp.value.compareTo(value) > 0) {
					if (temp.leftNode == null) {
						temp.leftNode = newNode;
						break;
					} else {
						temp = temp.leftNode;
					}

				} else if (temp.value.compareTo(value) < 0) {
					if (temp.rightNode == null) {
						temp.rightNode = newNode;
						break;
					} else {
						temp = temp.rightNode;
					}
				} else {
					throw new UnsupportedOperationException("Duplicate values are not allowed");
				}
			}
			temp = newNode;
		}
		return newNode;
	}

	public TreeNode<T> search(T value) {
		TreeNode<T> temp = rootNode;
		while (temp != null) {
			if (temp.value.compareTo(value) < 0) {
				temp = temp.rightNode;
			} else if (temp.value.compareTo(value) > 0) {
				temp = temp.leftNode;
			} else {
				return temp;
			}
		}
		return null;
	}
}
