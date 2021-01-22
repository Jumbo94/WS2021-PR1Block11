package live.coding;

public class FirstRecursionDemo {

  public static void main(String[] args) {

    //callingMyself("rekursion ist toll!");

    int sumResult = calcSumRecursive(3);
    System.out.println(sumResult);

    int fibResult = fibonacci(8);
    System.out.println(fibResult);

    fibResult = fibonacci(40);
    System.out.println(fibResult);

  }

  public static int fibonacci(int n) {
    //base case
    if(n == 1 || n == 2) {
      return 1;
    }
    //recursion step
    int fib = fibonacci(n-1) + fibonacci(n-2);
    return fib;
  }

  public static int calcSumRecursive(int n) {
    //base case
    if(n == 0) {
      return 0;
    }
    //recursion step
    int sum = calcSumRecursive(n - 1) + n;
    return sum;
  }

  //endless recursion example
  public static void callingMyself(String text) {
    System.out.println(text);
    callingMyself(text);
    //...
  }

}
