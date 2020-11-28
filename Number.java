public abstract class Number {
  public abstract double getValue();

  public int compareTo(Number other) {
    if (this.equals(other)) {
      return 0;
    }
    else if (this.getValue() < other.getValue()) {
      return -1;
    } else {
      return 1;
    }
  }

  public boolean equals(Number other) {
    double margin = 1E-5;
    if (getValue() == 0 || other.getValue() == 0) {
      return (getValue() == 0 && other.getValue() == 0);
    } else {
      return Math.abs((getValue() - other.getValue()) / getValue()) <= margin;
    }
  }

}
