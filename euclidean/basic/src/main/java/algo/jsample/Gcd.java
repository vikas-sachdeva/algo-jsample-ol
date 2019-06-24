package algo.jsample;

public class Gcd {

	public int findGcd(int a, int b) {

		if (a > b) {
			return findGcdInternal(a, b);
		} else if (a < b) {
			return findGcdInternal(b, a);
		} else {
			return a;
		}
	}

	private int findGcdInternal(int a, int b) {

		if (a % b == 0) {
			return b;
		}
		return findGcdInternal(b, a % b);
	}
}
