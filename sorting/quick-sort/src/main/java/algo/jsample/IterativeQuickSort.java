package algo.jsample;

import java.util.Stack;

public class IterativeQuickSort<T extends Comparable<T>> {

	public T[] sort(T[] input) {
		Stack<Integer> stack = new Stack<>();
		stack.push(0);
		stack.push(input.length);
		while (!stack.isEmpty()) {
			int high = stack.pop();
			int low = stack.pop();
			int pivotIndex = partition(input, low, high);

			if (low < pivotIndex) {
				stack.push(low);
				stack.push(pivotIndex);
			}
			if (pivotIndex + 1 < high) {
				stack.push(pivotIndex + 1);
				stack.push(high);
			}
		}
		return input;
	}

	private int partition(T[] input, int low, int high) {

		T pivot = input[high - 1];
		int i = low;

		for (int j = low; j < high - 1; j++) {

			if (input[j].compareTo(pivot) <= 0) {
				swap(input, i, j);
				i++;
			}
		}
		swap(input, i, high - 1);
		return i;
	}

	private void swap(T[] input, int i, int j) {
		T temp = input[i];
		input[i] = input[j];
		input[j] = temp;

	}
}