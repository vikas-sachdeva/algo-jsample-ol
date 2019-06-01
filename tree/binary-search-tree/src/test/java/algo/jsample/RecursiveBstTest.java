package algo.jsample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RecursiveBstTest {

	@Test
	public void searchTest1() {
		RecursiveBst<String> bst = new RecursiveBst<>();
		bst.insert("hello1");
		Assertions.assertNotNull(bst.search("hello1"));
	}

	@Test
	public void searchTest2() {
		RecursiveBst<String> bst = new RecursiveBst<>();
		bst.insert("hello1");
		Assertions.assertNull(bst.search("hello2"));
	}

	@Test
	public void searchTest3() {
		RecursiveBst<Integer> bst = new RecursiveBst<>();
		bst.insert(1);
		bst.insert(2);
		bst.insert(3);
		Assertions.assertNotNull(bst.search(3));
	}

	@Test
	public void searchTest4() {
		RecursiveBst<Integer> bst = new RecursiveBst<>();
		bst.insert(5);
		bst.insert(4);
		bst.insert(3);
		bst.insert(6);
		bst.insert(7);
		bst.insert(1);
		bst.insert(9);
		Assertions.assertNotNull(bst.search(9));
	}

	@Test
	public void searchTest5() {
		RecursiveBst<Integer> bst = new RecursiveBst<>();
		bst.insert(5);
		bst.insert(4);
		bst.insert(3);
		bst.insert(6);
		bst.insert(7);
		bst.insert(1);
		bst.insert(9);
		Assertions.assertNotNull(bst.search(3));
	}

	@Test
	public void insertTest1() {
		RecursiveBst<Integer> bst = new RecursiveBst<>();
		bst.insert(5);
		Assertions.assertThrows(UnsupportedOperationException.class, () -> bst.insert(5));
	}

	@Test
	public void inOrderTraversalTest1() {
		RecursiveBst<Integer> bst = new RecursiveBst<>();
		bst.insert(1);
		bst.insert(2);
		bst.insert(3);
		Assertions.assertDoesNotThrow(() -> bst.inOrderTraversal());
	}

	@Test
	public void inOrderTraversalTest2() {
		RecursiveBst<Integer> bst = new RecursiveBst<>();
		bst.insert(2);
		bst.insert(1);
		bst.insert(3);
		Assertions.assertDoesNotThrow(() -> bst.inOrderTraversal());
	}

	@Test
	public void inOrderTraversalTest3() {
		RecursiveBst<Integer> bst = new RecursiveBst<>();
		bst.insert(5);
		bst.insert(1);
		bst.insert(3);
		bst.insert(4);
		bst.insert(7);
		bst.insert(6);
		Assertions.assertDoesNotThrow(() -> bst.inOrderTraversal());
	}

	@Test
	public void preOrderTraversalTest1() {
		RecursiveBst<Integer> bst = new RecursiveBst<>();
		bst.insert(5);
		bst.insert(1);
		bst.insert(3);
		bst.insert(4);
		bst.insert(7);
		bst.insert(6);
		Assertions.assertDoesNotThrow(() -> bst.preOrderTraversal());
	}

	@Test
	public void postOrderTraversalTest1() {
		RecursiveBst<Integer> bst = new RecursiveBst<>();
		bst.insert(5);
		bst.insert(1);
		bst.insert(3);
		bst.insert(4);
		bst.insert(7);
		bst.insert(6);
		Assertions.assertDoesNotThrow(() -> bst.postOrderTraversal());
	}

	@Test
	public void getHeightTest1() {
		RecursiveBst<Integer> bst = new RecursiveBst<>();
		bst.insert(5);
		bst.insert(1);
		bst.insert(3);
		bst.insert(4);
		bst.insert(7);
		bst.insert(6);
		Assertions.assertEquals(4, bst.getHeight());
	}

	@Test
	public void getHeightTest2() {
		RecursiveBst<Integer> bst = new RecursiveBst<>();
		bst.insert(5);
		Assertions.assertEquals(1, bst.getHeight());
	}

	@Test
	public void getHeightTest3() {
		RecursiveBst<Integer> bst = new RecursiveBst<>();
		bst.insert(2);
		bst.insert(1);
		bst.insert(3);
		Assertions.assertEquals(2, bst.getHeight());
	}

	@Test
	public void levelOrderTraversalTest1() {
		RecursiveBst<Integer> bst = new RecursiveBst<>();
		bst.insert(5);
		bst.insert(1);
		bst.insert(3);
		bst.insert(4);
		bst.insert(7);
		bst.insert(6);
		Assertions.assertDoesNotThrow(() -> bst.levelOrderTraversal());
	}

}