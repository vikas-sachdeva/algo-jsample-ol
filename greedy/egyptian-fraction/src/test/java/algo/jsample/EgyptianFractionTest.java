package algo.jsample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EgyptianFractionTest {

	private EgyptianFraction egyptianFraction = new EgyptianFraction();

	@Test
	public void getEgyptianFractionsTest1() {
		Fraction fraction = new Fraction(2, 3);

		Fraction fraction1 = new Fraction(1, 2);
		Fraction fraction2 = new Fraction(1, 6);

		Fraction[] fractions = new Fraction[] { fraction1, fraction2 };

		Assertions.assertArrayEquals(fractions, egyptianFraction.getEgyptianFractions(fraction));

	}

	@Test
	public void getEgyptianFractionsTest2() {
		Fraction fraction = new Fraction(6, 14);

		Fraction fraction1 = new Fraction(1, 3);
		Fraction fraction2 = new Fraction(1, 11);
		Fraction fraction3 = new Fraction(1, 231);

		Fraction[] fractions = new Fraction[] { fraction1, fraction2, fraction3 };

		Assertions.assertArrayEquals(fractions, egyptianFraction.getEgyptianFractions(fraction));

	}

	@Test
	public void getEgyptianFractionsTest3() {
		Fraction fraction = new Fraction(12, 13);

		Fraction fraction1 = new Fraction(1, 2);
		Fraction fraction2 = new Fraction(1, 3);
		Fraction fraction3 = new Fraction(1, 12);
		Fraction fraction4 = new Fraction(1, 156);

		Fraction[] fractions = new Fraction[] { fraction1, fraction2, fraction3, fraction4 };

		Assertions.assertArrayEquals(fractions, egyptianFraction.getEgyptianFractions(fraction));

	}
}