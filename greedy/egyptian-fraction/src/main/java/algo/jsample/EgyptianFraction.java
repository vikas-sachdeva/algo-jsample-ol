package algo.jsample;

import java.util.ArrayList;
import java.util.List;

public class EgyptianFraction {

	public Fraction[] getEgyptianFractions(Fraction fraction) {
		List<Fraction> egyptianFractionList = new ArrayList<>();
		while (fraction.getNumerator() > 1) {
			int maxUnitFraction = getMaxUnitFraction(fraction);
			Fraction unitFraction = new Fraction(1, maxUnitFraction);
			egyptianFractionList.add(unitFraction);
			fraction.subtract(unitFraction);
		}
		if (fraction.getNumerator() == 1) {
			egyptianFractionList.add(fraction);
		}
		return egyptianFractionList.toArray(new Fraction[0]);
	}

	private int getMaxUnitFraction(Fraction fraction) {
		int quotient = fraction.getDenominator() / fraction.getNumerator();
		int remainder = fraction.getDenominator() % fraction.getNumerator();
		if (remainder > 0) {
			return quotient + 1;
		}
		return quotient;
	}
}
