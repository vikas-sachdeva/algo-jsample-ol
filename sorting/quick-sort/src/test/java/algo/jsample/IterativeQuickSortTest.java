package algo.jsample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IterativeQuickSortTest {

	@Test
	public void sortTest1() {
		IterativeQuickSort<Integer> quickSort = new IterativeQuickSort<>();
		Integer[] arr = new Integer[] { 3, 2, 1, 6, 7 };

		Assertions.assertArrayEquals(new Integer[] { 1, 2, 3, 6, 7 }, quickSort.sort(arr));
	}

	@Test
	public void sortTest2() {
		IterativeQuickSort<Integer> quickSort = new IterativeQuickSort<>();
		Integer[] arr = new Integer[] { 66, 55, 44, 33, 22, 11, 1 };
		Assertions.assertArrayEquals(new Integer[] { 1, 11, 22, 33, 44, 55, 66 }, quickSort.sort(arr));
	}

	@Test
	public void sortTest3() {
		IterativeQuickSort<Integer> quickSort = new IterativeQuickSort<>();
		Integer[] arr = new Integer[] { 1, 2, 3 };
		Assertions.assertArrayEquals(new Integer[] { 1, 2, 3 }, quickSort.sort(arr));
	}

	@Test
	public void sortTest4() {
		IterativeQuickSort<Character> quickSort = new IterativeQuickSort<>();
		Character[] arr = new Character[] { 'z', 'e', 'q', 'a' };
		Assertions.assertArrayEquals(new Character[] { 'a', 'e', 'q', 'z' }, quickSort.sort(arr));
	}

	@Test
	public void sortTest5() {
		IterativeQuickSort<String> quickSort = new IterativeQuickSort<>();
		String[] arr = new String[] { "bubble", "sort", "algorithm" };
		Assertions.assertArrayEquals(new String[] { "algorithm", "bubble", "sort" }, quickSort.sort(arr));
	}
}
