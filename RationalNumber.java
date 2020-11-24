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
      double tempValue = b;
      b = a;
      a = b;
    }
    double remainders = a / b;
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

  public RationalNumber multiply(RationalNumber other) {
    numerator = numerator * other.getNumerator();
    denominator = denominator * other.getDenominator();
    return (numerator / denominator);
  }

  public RationalNumber divide(RationalNumber other) {
    numerator = numerator * other.getDenominator();
    denominator = denominator * other.getNumerator();
    return (numerator / denominator);
  }

  public RationalNumber add(RationalNumber other) {
    if (denominator == other.getDenominator) {
      numerator += other.getNumerator();
    } else {
      double leastMultiple = (multiply(other)) / gcd((numerator/denominator), other);
      double firstRational = leastMultiple / (numerator/denominator);
      double secondRational = other / (numerator/denominator);
      numerator = numerator * firstRational;
      denominator = denominator * firstRational;
      other.getNumerator() = other.getNumerator() * secondRational;
      other.denominator()) = other.getDenominator() * secondRational;
      numerator = numerator + other.getNumerator;
    }
    return (numerator/denominator);
  }

  public RationalNumber subtract(RationalNumber other) {
    if (denominator == other.getDenominator) {
      numerator += other.getNumerator();
    } else {
      double leastMultiple = (multiply(other)) / gcd((numerator/denominator), other);
      double firstRational = leastMultiple / (numerator/denominator);
      double secondRational = other / (numerator/denominator);
      numerator = numerator * firstRational;
      denominator = denominator * firstRational;
      other.getNumerator() = other.getNumerator() * secondRational;
      other.denominator()) = other.getDenominator() * secondRational;
      numerator = numerator - other.getNumerator;
    }
    return (numerator/denominator);
  }
}
