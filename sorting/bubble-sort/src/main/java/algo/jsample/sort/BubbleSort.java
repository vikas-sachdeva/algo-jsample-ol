package algo.jsample.sort;

public class BubbleSort<T extends Comparable<T>> {

	public T[] sort(T[] input) {
		boolean isSorted;
		for (int i = 0; i < input.length - 1; i++) {
			isSorted = true;
			for (int j = 0; j < input.length - 1 - i; j++) {

				if (input[j].compareTo(input[j + 1]) > 0) {
					swap(input, j, j + 1);
					isSorted = false;
				}
			}
			if (isSorted) {
				break;
			}
		}
		return input;
	}

	private void swap(T[] input, int j, int i) {
		T temp = input[i];
		input[i] = input[j];
		input[j] = temp;
	}
}