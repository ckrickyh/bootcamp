import java.util.Scanner;

public class DemoGuessingGame {
  public static void main(String[] args) {

    //var setting
    int rawMin = 0;
    int rawMax = 100;
    
    int boom = 67;
    int chMin;
    int chMax;

    //calling Scanner
    Scanner scanner = new Scanner(System.in);
    System.out.println("please input a number: ");
    //int input = scanner.nextInt();
    int input = 0;
    int binominal = 0;
    char role = 'A';
    chMin = rawMin;
    chMax = rawMax;
    
    while (input != boom) {
      System.out.println("User " + role + ", Please enter:");
      input = scanner.nextInt();

      if (binominal % 2 == 0){
        role = 'A';
      } else {
        role = 'B';
      }

      if (input <= chMin || input >= chMax) { // countine skip criteria in loop, usually using || rather than &&
      //if (input >= chMin && input <= chMax) {
          continue; //skip the above condition
      }
      
          binominal++;

          if (input < boom) {
            chMin = input + 1;
          } else {
            chMax = input - 1;
          }
          System.out.println("User " + role + " entered: " + input + ", which is between" + chMin + "-" + chMax);
          
      //}
    }
    System.out.println("BOOM! User " + role + " lose!!!");
    scanner.close();


  }
}
