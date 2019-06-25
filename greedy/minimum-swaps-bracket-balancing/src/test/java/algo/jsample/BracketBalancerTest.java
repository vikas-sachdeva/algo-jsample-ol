package algo.jsample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BracketBalancerTest {

	private BracketBalancer bracketBalancer = new BracketBalancer();

	@Test
	public void swapCountTest1() {
		Assertions.assertEquals(2, bracketBalancer.swapCount("[]][]["));
	}
	
	@Test
	public void swapCountTest2() {
		Assertions.assertEquals(0, bracketBalancer.swapCount("[[][]]"));
	}
	
	@Test
	public void swapCountTest3() {
		Assertions.assertEquals(3, bracketBalancer.swapCount("]]][[["));
	}

}