public class Calculator
{
  // constructor
  Calculator() {}
 // add method
 
  public int add(int a, int b) {
    return a + b;
  }

  private int subtract(int a, int b) {
    return a - b;
  }
  
  private float divide(int a, int b) {
    return (float)a/b;
  }
  
  private long multiply(int a, int b) {
    return (long)a*b;
  }
}
