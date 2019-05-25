package algo.jsample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RecursiveQuickSortTest {

	@Test
	public void sortTest1() {
		RecursiveQuickSort<Integer> quickSort = new RecursiveQuickSort<>();
		Integer[] arr = new Integer[] { 3, 2, 1, 6, 7 };

		Assertions.assertArrayEquals(new Integer[] { 1, 2, 3, 6, 7 }, quickSort.sort(arr));
	}

	@Test
	public void sortTest2() {
		RecursiveQuickSort<Integer> quickSort = new RecursiveQuickSort<>();
		Integer[] arr = new Integer[] { 66, 55, 44, 33, 22, 11, 1 };
		Assertions.assertArrayEquals(new Integer[] { 1, 11, 22, 33, 44, 55, 66 }, quickSort.sort(arr));
	}

	@Test
	public void sortTest3() {
		RecursiveQuickSort<Integer> quickSort = new RecursiveQuickSort<>();
		Integer[] arr = new Integer[] { 1, 2, 3 };
		Assertions.assertArrayEquals(new Integer[] { 1, 2, 3 }, quickSort.sort(arr));
	}

	@Test
	public void sortTest4() {
		RecursiveQuickSort<Character> quickSort = new RecursiveQuickSort<>();
		Character[] arr = new Character[] { 'z', 'e', 'q', 'a' };
		Assertions.assertArrayEquals(new Character[] { 'a', 'e', 'q', 'z' }, quickSort.sort(arr));
	}

	@Test
	public void sortTest5() {
		RecursiveQuickSort<String> quickSort = new RecursiveQuickSort<>();
		String[] arr = new String[] { "bubble", "sort", "algorithm" };
		Assertions.assertArrayEquals(new String[] { "algorithm", "bubble", "sort" }, quickSort.sort(arr));
	}
}
