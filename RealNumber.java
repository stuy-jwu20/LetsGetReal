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
    double currentVal = getValue();
    double otherVal = other.getValue();
    double difference = Math.abs(currentVal - otherVal);
    return difference <= 1E-5 * (Math.abs(otherVal));
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
