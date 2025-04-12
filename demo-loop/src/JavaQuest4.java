public class JavaQuest4 {
  /**
   * Exercise: Print 10 numbers: they must be even and > 0, and divisible by 3
   * and divisible by 2 (Search it from 1)
   * 
   * Expected Output: 6 12 18 24 30 36 42 48 54 60
   */
  public static void main(String[] args) {
    // Print first ten numbers, which fulfill the followings criteria:
    // 1. Even numbers
    // 2. Divisible by 3
    // 3. > 0

    int start = 0;
    int end = 100;
    String outPut = "";

    for (int i = start + 1; i < end; i++) {
      // code here ...
      if (i % 2 == 0) {
        if (i % 3 == 0){
          //System.out.println(i);
          outPut += i + " ";
          if (i == 60) {
            break;
          }
        }
      }
    }
    System.out.println(outPut);
  }
}