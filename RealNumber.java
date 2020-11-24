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
    double differencePercent = ((other - value) / value);
    if ((value == 0) && (other == 0)) {
      return true;
    }
    else if (differencePercent <= 0.001) {
      return true;
    } else {
      return false;
    }
  }

  public RealNumber add(RealNumber other) {
    value = value + other;
    return null;
  }

  public RealNumber multiply(RealNumber other) {
    value = value * other;
    return null;
  }

  public RealNumber divide(RealNumber other) {
    value = value / other;
    return null;
  }

  public RealNumber subtract(RealNumber other) {
    value = value - other;
    return null;
  }
}
