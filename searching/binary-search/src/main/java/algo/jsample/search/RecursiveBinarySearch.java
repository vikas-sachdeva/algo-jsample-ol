package algo.jsample.search;

public class RecursiveBinarySearch<T extends Comparable<T>> {

	public int search(T[] input, T element) {

		return search(input, element, 0, input.length);

	}

	private int search(T[] input, T element, int low, int high) {
		if (low == high) {
			return -1;
		}
		int mid = (low + high) / 2;
		if (input[mid].compareTo(element) > 0) {
			return search(input, element, 0, mid);
		} else if (input[mid].compareTo(element) < 0) {
			return search(input, element, mid + 1, high);
		} else {
			return mid;
		}

	}

}
