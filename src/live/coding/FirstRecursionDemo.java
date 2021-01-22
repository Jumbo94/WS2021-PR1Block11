package live.coding;

public class FirstRecursionDemo {

  public static void main(String[] args) {

    //callingMyself("rekursion ist toll!");

    int sumResult = calcSumRecursive(3);
    System.out.println(sumResult);

  }

  public static int calcSumRecursive(int n) {
    //???base case, recursion start
    if(n == 0) {
      return 0;
    }
    //??? recursion step
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
