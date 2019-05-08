package algo.jsample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import algo.jsample.trie.TrieOperations;

public class TrieOperationsTest {

	@Test
	public void searchTest1() {
		TrieOperations trieOperations = new TrieOperations();
		trieOperations.insert("hello", "key1");
		trieOperations.insert("world", "key2");
		Assertions.assertEquals(trieOperations.search("hello"), "key1");

	}

	@Test
	public void searchTest2() {
		TrieOperations trieOperations = new TrieOperations();
		trieOperations.insert("hello", "key1");
		trieOperations.insert("world", "key2");
		Assertions.assertNull(trieOperations.search("hell"));
	}

	@Test
	public void searchTest3() {
		TrieOperations trieOperations = new TrieOperations();
		trieOperations.insert("hello", "key1");
		trieOperations.insert("world", "key2");
		Assertions.assertNull(trieOperations.search("helloo"));
	}

	@Test
	public void searchTest4() {
		TrieOperations trieOperations = new TrieOperations();
		trieOperations.insert("hello", "key1");
		trieOperations.insert("world", "key2");
		Assertions.assertEquals(trieOperations.search("world"), "key2");
	}

	@Test
	public void searchTest5() {
		TrieOperations trieOperations = new TrieOperations();
		trieOperations.insert("hello", "key1");
		trieOperations.insert("world", "key2");
		Assertions.assertNotEquals(trieOperations.search("world"), "key22");
	}

	@Test
	public void searchTest6() {
		TrieOperations trieOperations = new TrieOperations();
		trieOperations.insert("hello", "key1");
		trieOperations.insert("hell", "key2");
		Assertions.assertEquals(trieOperations.search("hell"), "key2");
	}
	
	@Test
	public void searchTest7() {
		TrieOperations trieOperations = new TrieOperations();
		trieOperations.insert("hello", "key1");
		trieOperations.insert("hell", "key2");
		Assertions.assertEquals(trieOperations.search("hello"), "key1");
	}
	
	@Test
	public void searchTest8() {
		TrieOperations trieOperations = new TrieOperations();
		trieOperations.insert("hello", "key1");
		trieOperations.insert("hell", "key2");
		Assertions.assertNull(trieOperations.search("helloo"));
	}
}