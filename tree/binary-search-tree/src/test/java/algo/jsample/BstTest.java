package algo.jsample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BstTest {

	@Test
	public void searchTest1() {
		Bst<String> bst = new Bst<>();
		bst.insert("hello1");
		Assertions.assertNotNull(bst.search("hello1"));
	}

	@Test
	public void searchTest2() {
		Bst<String> bst = new Bst<>();
		bst.insert("hello1");
		Assertions.assertNull(bst.search("hello2"));
	}

	@Test
	public void searchTest3() {
		Bst<Integer> bst = new Bst<>();
		bst.insert(1);
		bst.insert(2);
		bst.insert(3);
		Assertions.assertNotNull(bst.search(3));
	}

	@Test
	public void searchTest4() {
		Bst<Integer> bst = new Bst<>();
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
		Bst<Integer> bst = new Bst<>();
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
		Bst<Integer> bst = new Bst<>();
		bst.insert(5);
		Assertions.assertThrows(UnsupportedOperationException.class, () -> bst.insert(5));
	}

}