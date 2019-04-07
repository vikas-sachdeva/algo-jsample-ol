package algo.jsample.search;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LinearSearchTest {

	@Test
	public void searchTest1() {
		LinearSearch<Integer> linearSearch = new LinearSearch<>();
		Integer[] arr = new Integer[] { 3, 2, 1, 6, 7 };

		Assertions.assertEquals(2, linearSearch.search(arr, 1));
	}

	@Test
	public void searchTest2() {
		LinearSearch<Integer> linearSearch = new LinearSearch<>();
		Integer[] arr = new Integer[] { 66, 55, 44, 33, 22, 11, 1 };

		Assertions.assertEquals(-1, linearSearch.search(arr, 2));
	}

	@Test
	public void searchTest3() {
		LinearSearch<Integer> linearSearch = new LinearSearch<>();
		Integer[] arr = new Integer[] { 66, 55, 44, 33, 22, 11, 1 };

		Assertions.assertEquals(6, linearSearch.search(arr, 1));
	}

	@Test
	public void searchTest4() {
		LinearSearch<Character> linearSearch = new LinearSearch<>();
		Character[] arr = new Character[] { 'z', 'e', 'q', 'a' };

		Assertions.assertEquals(1, linearSearch.search(arr, 'e'));
	}

	@Test
	public void searchTest5() {
		LinearSearch<String> linearSearch = new LinearSearch<>();
		String[] arr = new String[] { "bubble", "sort", "algorithm" };

		Assertions.assertEquals(0, linearSearch.search(arr, "bubble"));
	}

}
