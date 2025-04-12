public class JavaQuest5 {
  /**
   * Expected output:
   * The index of the last character of c is 11
   */
  public static void main(String[] args) {
    String str = "coding bootcamp."; // You should not change this line
    char target = 'c';

    // if found, print "Found."
    // if not found, print "Not Found."
    // code here ...
    int count = 0;
    int lastLoc = 0;

    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == target) {
        count++;
        lastLoc = i;
      }
    }
    if (count == 0) {
      System.out.println("Not Found.");

    } else {
      System.out.println("Found " + count + " c words");
      System.out.println("The index of the last character of c is " + lastLoc);
    }
    
  }
}