package algo.jsample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InsertionSortTest {

	@Test
	public void sortTest1() {
		InsertionSort<Integer> insertionSort = new InsertionSort<>();
		Integer[] arr = new Integer[] { 3, 2, 1, 6, 7 };

		Assertions.assertArrayEquals(new Integer[] { 1, 2, 3, 6, 7 }, insertionSort.sort(arr));
	}

	@Test
	public void sortTest2() {
		InsertionSort<Integer> insertionSort = new InsertionSort<>();
		Integer[] arr = new Integer[] { 66, 55, 44, 33, 22, 11, 1 };
		Assertions.assertArrayEquals(new Integer[] { 1, 11, 22, 33, 44, 55, 66 }, insertionSort.sort(arr));
	}

	@Test
	public void sortTest3() {
		InsertionSort<Integer> insertionSort = new InsertionSort<>();
		Integer[] arr = new Integer[] { 1, 2, 3 };
		Assertions.assertArrayEquals(new Integer[] { 1, 2, 3 }, insertionSort.sort(arr));
	}

	@Test
	public void sortTest4() {
		InsertionSort<Character> insertionSort = new InsertionSort<>();
		Character[] arr = new Character[] { 'z', 'e', 'q', 'a' };
		Assertions.assertArrayEquals(new Character[] { 'a', 'e', 'q', 'z' }, insertionSort.sort(arr));
	}

	@Test
	public void sortTest5() {
		InsertionSort<String> insertionSort = new InsertionSort<>();
		String[] arr = new String[] { "bubble", "sort", "algorithm" };
		Assertions.assertArrayEquals(new String[] { "algorithm", "bubble", "sort" }, insertionSort.sort(arr));
	}
}
