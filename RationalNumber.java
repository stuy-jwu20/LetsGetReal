public class RationalNumber extends RealNumber {
  private int numerator, denominator;

  public RationalNumber(int nume, int deno) {
    super(0.0);
    if (deno == 0 || nume == 0) {
      numerator = 0;
      denominator = 1;
    }
    else if (deno < 0) {
      numerator = -nume;
      denominator = -deno;
    } else {
      numerator = nume;
      denominator = deno;
    }
    reduce();
  }

  public double getValue() {
    return (numerator / (double)denominator);
  }

  public int getNumerator() {
    return numerator;
  }

  public int getDenominator() {
    return denominator;
  }

  public RationalNumber reciprocal() {
    return new RationalNumber(denominator, numerator);
  }

  public boolean equals(RationalNumber other) {
    return (numerator == other.getNumerator() && denominator == other.getDenominator());
  }

  public String toString() {
    return "" + numerator + "/" + denominator;
  }

  public static int gcd(int a, int b) {
    if (a == 0 || b == 0) {
      return 1;
    }
    a = Math.abs(a);
    b = Math.abs(b);
    if (a < b) {
      int tempValue = b;
      b = a;
      a = tempValue;
    }
    int remainder = a % b;
    while (remainder != 0) {
      a = b;
      b = remainder;
      remainder = a % b;
    }
    return b;
  }

  private void reduce() {
    int theGCD = gcd(numerator, denominator);
    numerator = (numerator / theGCD);
    denominator = (denominator / theGCD);
  }

  public RationalNumber multiply(RationalNumber other) {
    return new RationalNumber(numerator * other.getNumerator(), denominator * other.getDenominator());
  }

  public RationalNumber divide(RationalNumber other) {
    return new RationalNumber(numerator * other.getDenominator(), denominator * other.getNumerator());
  }

  public RationalNumber add(RationalNumber other) {
    int theGCD = gcd(denominator, other.getDenominator());
    int initialTimes = denominator / theGCD;
    int secondaryTimes = other.getDenominator() / theGCD;
    return new RationalNumber((numerator * initialTimes) + (other.getNumerator() * secondaryTimes),
                              denominator * secondaryTimes);
  }

  public RationalNumber subtract(RationalNumber other) {
    int theGCD = gcd(denominator, other.getDenominator());
    int initialTimes = denominator / theGCD;
    int secondaryTimes = other.getDenominator() / theGCD;
    return new RationalNumber((numerator * initialTimes) - (other.getNumerator() * secondaryTimes),
                              denominator * secondaryTimes);
  }
}
