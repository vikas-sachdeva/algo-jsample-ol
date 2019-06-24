package algo.jsample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GcdTest {

	private Gcd gcd = new Gcd();

	@Test
	public void findGcdTest1() {
		Assertions.assertEquals(12, gcd.findGcd(36, 60));
	}

	@Test
	public void findGcdTest2() {
		Assertions.assertEquals(5, gcd.findGcd(10, 15));
	}

	@Test
	public void findGcdTest3() {
		Assertions.assertEquals(5, gcd.findGcd(35, 10));
	}

	@Test
	public void findGcdTest4() {
		Assertions.assertEquals(1, gcd.findGcd(31, 2));
	}
	
	@Test
	public void findGcdTest5() {
		Assertions.assertEquals(20, gcd.findGcd(20, 20));
	}
}