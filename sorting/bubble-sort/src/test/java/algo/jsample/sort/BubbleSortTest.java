package algo.jsample.sort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BubbleSortTest {

	@Test
	public void sortTest1() {
		BubbleSort<Integer> bubbleSort = new BubbleSort<>();
		Integer[] arr = new Integer[] { 3, 2, 1, 6, 7 };

		Assertions.assertArrayEquals(new Integer[] { 1, 2, 3, 6, 7 }, bubbleSort.sort(arr));
	}

	@Test
	public void sortTest2() {
		BubbleSort<Integer> bubbleSort = new BubbleSort<>();
		Integer[] arr = new Integer[] { 66, 55, 44, 33, 22, 11, 1 };
		Assertions.assertArrayEquals(new Integer[] { 1, 11, 22, 33, 44, 55, 66 }, bubbleSort.sort(arr));
	}

	@Test
	public void sortTest3() {
		BubbleSort<Integer> bubbleSort = new BubbleSort<>();
		Integer[] arr = new Integer[] { 1, 2, 3 };
		Assertions.assertArrayEquals(new Integer[] { 1, 2, 3 }, bubbleSort.sort(arr));
	}

	@Test
	public void sortTest4() {
		BubbleSort<Character> bubbleSort = new BubbleSort<>();
		Character[] arr = new Character[] { 'z', 'e', 'q', 'a' };
		Assertions.assertArrayEquals(new Character[] { 'a', 'e', 'q', 'z' }, bubbleSort.sort(arr));
	}

	@Test
	public void sortTest5() {
		BubbleSort<String> bubbleSort = new BubbleSort<>();
		String[] arr = new String[] { "bubble", "sort", "algorithm" };
		Assertions.assertArrayEquals(new String[] { "algorithm", "bubble", "sort" }, bubbleSort.sort(arr));
	}
}
