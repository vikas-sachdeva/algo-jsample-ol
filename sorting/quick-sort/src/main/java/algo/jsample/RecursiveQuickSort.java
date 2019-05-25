package algo.jsample;

public class RecursiveQuickSort<T extends Comparable<T>> {

	public T[] sort(T[] input) {
		sort(input, 0, input.length);
		return input;
	}

	private void sort(T[] input, int low, int high) {

		if (low < high) {

			int pivotIndex = partition(input, low, high);
			sort(input, low, pivotIndex);
			sort(input, pivotIndex + 1, high);
		}
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