package algo.jsample;

public class RecursiveBst<T extends Comparable<T>> {

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
			TreeNode<T> parentNode = findLeafNode(value, rootNode);
			if (parentNode.value.compareTo(value) > 0) {
				parentNode.leftNode = newNode;
			} else {
				parentNode.rightNode = newNode;
			}
		}
		return newNode;
	}

	public TreeNode<T> findLeafNode(T value, TreeNode<T> treeNode) {
		if (treeNode.value.compareTo(value) < 0) {
			if (treeNode.rightNode == null) {
				return treeNode;
			}
			return findLeafNode(value, treeNode.rightNode);
		} else if (treeNode.value.compareTo(value) > 0) {
			if (treeNode.leftNode == null) {
				return treeNode;
			}
			return findLeafNode(value, treeNode.leftNode);
		} else {
			throw new UnsupportedOperationException("Duplicate values are not allowed");
		}
	}

	public TreeNode<T> search(T value) {
		return search(value, rootNode);
	}

	private TreeNode<T> search(T value, TreeNode<T> treeNode) {
		if (treeNode == null) {
			return null;
		}
		if (treeNode.value.compareTo(value) < 0) {
			return search(value, treeNode.rightNode);
		} else if (treeNode.value.compareTo(value) > 0) {
			return search(value, treeNode.leftNode);
		} else {
			return treeNode;
		}
	}

	public void inOrderTraversal() {
		inOrderTraversal(rootNode);
	}

	private void inOrderTraversal(TreeNode<T> node) {
		if (node == null) {
			return;
		}
		inOrderTraversal(node.leftNode);
		System.out.println(node.value);
		inOrderTraversal(node.rightNode);
	}

	public void preOrderTraversal() {
		preOrderTraversal(rootNode);
	}

	private void preOrderTraversal(TreeNode<T> node) {
		if (node == null) {
			return;
		}
		System.out.println(node.value);
		preOrderTraversal(node.leftNode);
		preOrderTraversal(node.rightNode);
	}

	public void postOrderTraversal() {
		postOrderTraversal(rootNode);
	}

	private void postOrderTraversal(TreeNode<T> node) {
		if (node == null) {
			return;
		}

		postOrderTraversal(node.leftNode);
		postOrderTraversal(node.rightNode);
		System.out.println(node.value);
	}
}
