package algo.jsample.sort;

import java.util.Arrays;

public class MergeSort<T extends Comparable<T>> {

	public T[] sort(T[] input) {

		if (input.length == 1 || input.length == 0) {
			return input;
		}
		T[] first = sort(Arrays.copyOfRange(input, 0, input.length / 2));
		T[] last = sort(Arrays.copyOfRange(input, input.length / 2, input.length));

		merge(input, first, last);

		return input;
	}

	private void merge(T[] input, T[] first, T[] last) {
		int i = 0;
		int j = 0;
		int k = 0;

		while (i < first.length && j < last.length) {
			if (first[i].compareTo(last[j]) > 0) {
				input[k] = last[j];
				j++;
			} else {
				input[k] = first[i];
				i++;
			}
			k++;
		}
		while (i < first.length) {
			input[k] = first[i];
			k++;
			i++;
		}
		while (j < last.length) {
			input[k] = last[j];
			k++;
			j++;
		}
	}
}