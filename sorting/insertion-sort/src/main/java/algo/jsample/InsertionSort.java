package algo.jsample;

public class InsertionSort<T extends Comparable<T>> {

	public T[] sort(T[] input) {
		for (int i = 1; i < input.length; i++) {
			T key = input[i];
			int j = i - 1;
			while (j >= 0 && input[j].compareTo(key) > 0) {
				input[j + 1] = input[j];
				j--;
			}
			input[j + 1] = key;
		}
		return input;
	}
}