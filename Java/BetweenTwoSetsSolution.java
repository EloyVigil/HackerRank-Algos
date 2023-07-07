import java.util.Arrays;

public class BetweenTwoSetsSolution {
  public static void main(String[] args) {
    int[] a = {2, 4};
    int[] b = {16, 32, 96};
    int result = getTotalX(a, b);
    System.out.println(result);
  }

  public static int getTotalX(int[] a, int[] b) {
    // Find Least Common Multiple of all integers in array a
    int lcm = Arrays.stream(a).reduce(BetweenTwoSetsSolution::lcm).getAsInt();

    // Find Greatest Common Divisor of all integers in array b
    int gcdB = Arrays.stream(b).reduce(BetweenTwoSetsSolution::gcd).getAsInt();

    int result = 0;
    for (int i = lcm; i <= gcdB; i += lcm) {
      if (gcdB % i == 0) {
        result++;
      }
    }
    return result;
  }

  // Helper function to find Greatest Common Divisor of two numbers
  public static int gcd(int a, int b) {
    if (b == 0) {
      return a;
    }
    return gcd(b, a % b);
  }

  // Helper function to find Least Common Multiple of two numbers
  public static int lcm(int a, int b) {
    return (a * b) / gcd(a, b);
  }
}
