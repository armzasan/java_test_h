public class Calculate {
    private  int x;
    private  int y;

  public Calculate(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int add() {
    return x + y;
  }

  public int subtract() {
    return x - y;
  }

  public int multiply() {
    return x * y;
  }

  public float divide() {
    return x / y;
  }
}