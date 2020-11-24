public class RationalNumber extends RealNumber {
  private int numerator, denominator;

  public RationalNumber(int nume, int deno) {
    super(0.0);
    if (deno == 0) {
      nume = 0;
      deno = 1;
    } else {
      numerator = nume;
      denominator = deno;
    }
  }

  public double getValue() {
    return (numerator / denominator);
  }

  public int getNumerator() {
    return numerator;
  }

  public int getDenominator() {
    return denominator;
  }

  public RationalNumber reciprocal() {
    return (denominator / numerator);
  }

  public boolean equals(RationalNumber other) {
    if (numerator.equals(denominator)) {
      return true;
    } else {
      return false;
    }
  }

  public String toString() {
    return "" + numerator + "/" + denominator;
  }
}
