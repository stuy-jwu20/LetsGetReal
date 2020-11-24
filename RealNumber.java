public class RealNumber {
  private double value;

  public RealNumber(double v) {
    value = v;
  }

  public double getValue() {
    return value;
  }

  public String toString() {
    return "" + getValue();
  }

//---------ONLY EDIT BELOW THIS LINE------------

  public boolean equals(RealNumber other) {
    double margin = 1E-5;
    if (getValue() == 0 || other.getValue() == 0) {
      return (getValue() == 0 && other.getValue() == 0);
    } else {
      return Math.abs((getValue() - other.getValue()) / getValue()) <= margin;
    }
  }

  public RealNumber add(RealNumber other) {
    return new RealNumber(getValue() + other.getValue());
  }

  public RealNumber multiply(RealNumber other) {
    return new RealNumber(getValue() * other.getValue());
  }

  public RealNumber divide(RealNumber other) {
    return new RealNumber(getValue() / other.getValue());
  }

  public RealNumber subtract(RealNumber other) {
    return new RealNumber(getValue() - other.getValue());
  }
}
