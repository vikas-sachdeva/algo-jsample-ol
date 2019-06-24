package algo.jsample;

public class Fraction {

	private int numerator;
	private int denominator;

	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}

	public int getNumerator() {
		return numerator;
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}

	public void subtract(Fraction obj) {
		int newDenominator = this.denominator * obj.denominator;
		this.numerator = this.numerator * obj.denominator - obj.numerator * this.denominator;
		this.denominator = newDenominator;

	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Fraction) {
			Fraction tempFraction = (Fraction) obj;
			return this.denominator == tempFraction.denominator && this.numerator == tempFraction.numerator;
		}
		return false;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Fraction [numerator=").append(numerator).append(", denominator=").append(denominator)
				.append("]");
		return builder.toString();
	}
}
