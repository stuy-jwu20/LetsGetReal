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
  
}
