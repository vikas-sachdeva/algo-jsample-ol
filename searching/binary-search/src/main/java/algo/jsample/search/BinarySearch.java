package algo.jsample.search;

public class BinarySearch<T extends Comparable<T>> {

	public int search(T[] input, T element) {

		int low = 0;
		int high = input.length;
		while (low != high) {

			int mid = (low + high) / 2;
			if (input[mid].compareTo(element) > 0) {
				high = mid;
			} else if (input[mid].compareTo(element) < 0) {
				low = mid + 1;
			} else {
				return mid;
			}
		}
		return -1;
	}
}
