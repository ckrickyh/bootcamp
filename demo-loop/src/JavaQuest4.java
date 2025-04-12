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


    // code here ...
    //variable setting
    int divX = 2;
    int divY = 3;
    int maxPrintTimes = 10;
    int startPrintTimes = 0;
    int currentPrintTimes = -1;
    int i = 1;
    String outPut = "";

    //!limitation in unkown end-range situtation, that's mean NOT defining end-range is requried
    //looping
    while (startPrintTimes < maxPrintTimes) { //while loop start
      while (currentPrintTimes < startPrintTimes) { //while %2 and %3 == 0 success, currentTimes +1
        if (i % divX == 0) {
          if (i % divY == 0) {
            outPut += i + " ";
            currentPrintTimes++;
            System.out.println("currentPrintTime: " + currentPrintTimes);
          }
        }
        i++;
        System.out.println("i: " + i);
      }
      startPrintTimes++;  //startPrintTime +1 when currentPrintTime +1
    } //while loop end
    System.out.println(outPut);
  }
}