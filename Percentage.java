
public class Percentage {
  private Calculate calc;

  public Percentage(int x, int y) {
    calc = new Calculate(x, y);
  }

  public float getPercentage() {
    return calc.divide() * 100;
  }
}