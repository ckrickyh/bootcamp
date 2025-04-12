import java.util.Scanner;

public class DemoScanner {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("please input a number: ");
    int input = scanner.nextInt();
    System.out.println("input=" + input);

    if (input % 2 == 1) {
      System.out.println("It is odd number");
    } else {
      System.out.println("It is even");
    }
  }
  
}
