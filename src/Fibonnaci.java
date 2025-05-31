public class Fibonnaci {
  public static void main(String[] args) {
    int n = 10; // Number of Fibonacci numbers to generate
    int[] fibonacciNumbers = generateFibonacci(n);

    System.out.print("Fibonacci series: ");
    for (int num : fibonacciNumbers) {
      System.out.print(num + " ");
    }
  }

  public static int[] generateFibonacci(int n) {
    int[] fibonacci = new int[n];
    fibonacci[0] = 0;
    if (n > 1) {
      fibonacci[1] = 1;
      for (int i = 2; i < n; i++) {
        fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
      }
    }
    return fibonacci;
  }
}
