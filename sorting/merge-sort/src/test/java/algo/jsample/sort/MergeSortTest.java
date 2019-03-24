package algo.jsample.sort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MergeSortTest {

	@Test
	public void sortTest1() {
		MergeSort<Integer> mergeSort = new MergeSort<>();
		Integer[] arr = new Integer[] { 3, 2, 1, 6, 7 };

		Assertions.assertArrayEquals(new Integer[] { 1, 2, 3, 6, 7 }, mergeSort.sort(arr));
	}

	@Test
	public void sortTest2() {
		MergeSort<Integer> mergeSort = new MergeSort<>();
		Integer[] arr = new Integer[] { 66, 55, 44, 33, 22, 11, 1 };
		Assertions.assertArrayEquals(new Integer[] { 1, 11, 22, 33, 44, 55, 66 }, mergeSort.sort(arr));
	}

	@Test
	public void sortTest3() {
		MergeSort<Integer> mergeSort = new MergeSort<>();
		Integer[] arr = new Integer[] { 1, 2, 3 };
		Assertions.assertArrayEquals(new Integer[] { 1, 2, 3 }, mergeSort.sort(arr));
	}

	@Test
	public void sortTest4() {
		MergeSort<Character> mergeSort = new MergeSort<>();
		Character[] arr = new Character[] { 'z', 'e', 'q', 'a' };
		Assertions.assertArrayEquals(new Character[] { 'a', 'e', 'q', 'z' }, mergeSort.sort(arr));
	}

	@Test
	public void sortTest5() {
		MergeSort<String> mergeSort = new MergeSort<>();
		String[] arr = new String[] { "bubble", "sort", "algorithm" };
		Assertions.assertArrayEquals(new String[] { "algorithm", "bubble", "sort" }, mergeSort.sort(arr));
	}
}
