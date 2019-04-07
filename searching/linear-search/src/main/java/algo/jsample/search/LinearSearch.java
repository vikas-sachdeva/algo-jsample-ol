package algo.jsample.search;

public class LinearSearch<T extends Comparable<T>> {

	public int search(T[] input, T element) {

		for (int i = 0; i < input.length; i++) {

			if (input[i].compareTo(element) == 0) {
				return i;
			}
		}
		return -1;
	}
}
