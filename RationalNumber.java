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

  public static int gcd(int a, int b) {
    if (a < b) {
      int tempValue = b;
      b = a;
      a = b;
    }
    int remainders = a / b;
    for (int i = 0; remainders == 0; i++) {
      a = b;
      b = remainders;
      remainders = a / b;
    }
    if (remainders == 0) {
      System.out.println("" + remainders + " is the GCD of " + a + " and " + b);
    }
    return remainders;
  }

  private void reduce() {
    numerator = (numerator / gcd(a, b));
    numerator = (denominator / gcd(a, b));
  }
}
