package algo.jsample.search;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinarySearchTest {

	@Test
	public void searchTest1() {
		BinarySearch<Integer> linearSearch = new BinarySearch<>();
		Integer[] arr = new Integer[] { 1, 2, 3, 6, 7 };

		Assertions.assertEquals(0, linearSearch.search(arr, 1));
	}

	@Test
	public void searchTest2() {
		BinarySearch<Integer> linearSearch = new BinarySearch<>();

		Integer[] arr = new Integer[] { 1, 11, 22, 33, 44, 55, 66 };

		Assertions.assertEquals(-1, linearSearch.search(arr, 2));
	}

	@Test
	public void searchTest3() {
		BinarySearch<Integer> linearSearch = new BinarySearch<>();
		Integer[] arr = new Integer[] { 1, 11, 22, 33, 44, 55, 66 };

		Assertions.assertEquals(5, linearSearch.search(arr, 55));
	}

	@Test
	public void searchTest4() {
		BinarySearch<Integer> linearSearch = new BinarySearch<>();
		Integer[] arr = new Integer[] { 1, 11, 22, 33, 44, 55, 66 };

		Assertions.assertEquals(6, linearSearch.search(arr, 66));
	}

	@Test
	public void searchTest5() {
		BinarySearch<Character> linearSearch = new BinarySearch<>();
		Character[] arr = new Character[] { 'a', 'e', 'q', 'z' };

		Assertions.assertEquals(1, linearSearch.search(arr, 'e'));
	}

	@Test
	public void searchTest6() {
		BinarySearch<String> linearSearch = new BinarySearch<>();
		String[] arr = new String[] { "algorithm", "bubble", "sort" };

		Assertions.assertEquals(1, linearSearch.search(arr, "bubble"));
	}
}