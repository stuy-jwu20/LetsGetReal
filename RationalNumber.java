public class RationalNumber extends Number {
  private int numerator, denominator;

  public RationalNumber(int nume, int deno) {
    if (deno == 0 || nume == 0) {
      numerator = 0;
      denominator = 1;
    }
    else if (deno < 0) {
      numerator = -nume;
      denominator = -deno;
    } else {
      this.numerator = nume;
      this.denominator = deno;
    }
    reduce();
  }

  public double getValue() {
    return (this.numerator / (double)this.denominator);
  }

  public int getNumerator() {
    return numerator;
  }

  public int getDenominator() {
    return denominator;
  }

  public RationalNumber reciprocal() {
    return new RationalNumber(this.denominator, this.numerator);
  }

  public boolean equals(RationalNumber other) {
    return (numerator == other.getNumerator() && denominator == other.getDenominator());
  }

  public String toString() {
    if (denominator == 1) {
      return "" + numerator;
    }
    else if (numerator == 0) {
      return "" + 0;
    } else {
      return "" + numerator + "/" + denominator;
    }
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
    return new RationalNumber((numerator * secondaryTimes) + (other.getNumerator() * initialTimes),
                              denominator * secondaryTimes);
  }

  public RationalNumber subtract(RationalNumber other) {
    int theGCD = gcd(denominator, other.getDenominator());
    int initialTimes = denominator / theGCD;
    int secondaryTimes = other.getDenominator() / theGCD;
    return new RationalNumber((numerator * secondaryTimes) - (other.getNumerator() * initialTimes),
                               denominator * secondaryTimes);
  }
}
