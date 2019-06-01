package algo.jsample;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

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

	public void inOrderTraversal() {

		Stack<TreeNode<T>> stack = new Stack<>();
		TreeNode<T> temp = rootNode;

		while (temp != null || !stack.isEmpty()) {

			while (temp != null) {
				stack.push(temp);
				temp = temp.leftNode;

			}
			temp = stack.pop();
			System.out.println(temp.value);
			temp = temp.rightNode;
		}
	}

	public void preOrderTraversal() {

		Stack<TreeNode<T>> stack = new Stack<>();
		TreeNode<T> temp = rootNode;

		while (temp != null || !stack.isEmpty()) {

			while (temp != null) {
				stack.push(temp);
				System.out.println(temp.value);
				temp = temp.leftNode;

			}
			temp = stack.pop();
			temp = temp.rightNode;
		}
	}

	public void postOrderTraversal() {

		Stack<TreeNode<T>> stack = new Stack<>();
		TreeNode<T> temp = rootNode;

		while (temp != null || !stack.isEmpty()) {

			while (temp != null) {
				if (temp.rightNode != null) {
					stack.push(temp.rightNode);
				}
				stack.push(temp);
				temp = temp.leftNode;

			}
			temp = stack.pop();
			if (temp.rightNode != null && !stack.isEmpty() && stack.peek().equals(temp.rightNode)) {
				TreeNode<T> temp1 = temp;
				temp = stack.pop();
				stack.push(temp1);
			} else {
				System.out.println(temp.value);
				temp = null;
			}
		}
	}

	public int getHeight() {
		Queue<TreeNode<T>> queue = new LinkedList<>();
		queue.add(rootNode);
		int height = 0;
		while (!queue.isEmpty()) {

			int qSize = queue.size();

			height++;
			while (qSize > 0) {

				TreeNode<T> temp = queue.poll();
				if (temp.leftNode != null) {
					queue.add(temp.leftNode);
				}
				if (temp.rightNode != null) {
					queue.add(temp.rightNode);
				}
				qSize--;
			}
		}
		return height;
	}

	public void levelOrderTraversal() {
		Queue<TreeNode<T>> queue = new LinkedList<>();
		queue.add(rootNode);
		while (!queue.isEmpty()) {

			int qSize = queue.size();

			while (qSize > 0) {

				TreeNode<T> temp = queue.poll();
				System.out.print(temp.value + " ");

				if (temp.leftNode != null) {
					queue.add(temp.leftNode);
				}
				if (temp.rightNode != null) {
					queue.add(temp.rightNode);
				}
				qSize--;
			}
			System.out.println();
		}
	}
}