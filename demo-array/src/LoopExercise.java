import java.math.BigDecimal;
import java.util.Arrays;

public class LoopExercise {
  public static void main(String[] args) {
    // 1. Print 6 times hello
    // Use: for loop
    System.out.println("1. Print 6 times hello");
    for (int i = 0; i < 6; i++) {
      System.out.println("hello");
    }

    // 2. Expected output: "0,1,2,3,4"
    // Use: for loop
    System.out.println("2. Expected output: \"0,1,2,3,4\"");
    for (int i = 0; i < 5; i++) {
      System.out.println(i);
    }

    // 3. Print even numbers between 2 and 20
    // Use: for loop + if
    System.out.println("3. Print even numbers between 2 and 20");
    for (int i = 2; i < 20+1; i++) {
      if (i % 2 == 0) {
        System.out.println(i);
      }
    }
    

    // 4. Print the numbers, which can be divided by 3 or 5
    // Use: for loop + if
    System.out.println("4. Print the numbers, which can be divided by 3 or 5");
    boolean canDiv = false;
    for (int i = 0; i < 171; i++) {
      canDiv = false;
      if (i % 3 == 0) {
        canDiv = true;
      }
      if (i % 5 == 0) {
        canDiv = true;
      }
      if (canDiv == true) {
        System.out.println(i);
      }
    }
    

    // 5. Sum up the numbers between 0 and 15 and print it
    // Use: for loop
    System.out.println("5. Sum up the numbers between 0 and 15 and print it");
    int sumResult = 0;
    for (int i = 0; i < 15+1; i++) {
      sumResult += i;
    }
    System.out.println(sumResult);


    // 6. sum up all odd numbers betwen 0 - 10
    // Sum up all even numbers betwen 0 - 10
    // Find the product of evenSum and oddSum
    // Use: for loop + if
    System.out.println("6. sum up all odd numbers betwen 0 - 10");
    int startNum = 0;
    int endNum = 10;
    int evenSum = 0;
    int oddSum = 0;
    int productSum = 0;
    for (int i = startNum; i < endNum + 1; i++) {
      if (i % 2 == 1) {
        oddSum += i;
      } else {
        evenSum += i;
      }
    }
    productSum = oddSum * oddSum;
    System.out.println("sum up all odd numbers betwen 0 - 10: " + productSum);


    // 7. Check if 'd' exists in the string.
    // print "d is found."
    // otherwise, print "d is not found."
    String str7 = "ijkabcpodi"; //ijkabcpoi
    boolean dExists = false;
    System.out.println("7. Check if 'd' exists in the string.");
    for (int i = 0; i < str7.length(); i++) {
      if (str7.charAt(i) == 'd') {
        dExists = true;
        break;
      }
    }
    if (dExists == true) {
      System.out.println("d is found.");
    } else {
      System.out.println("d is not found.");
    }
    

    // 8. Check if the string s8b is a substring of s8a
    // print "s8b is a substring."
    // otherwise, print "s8b is not a substring."
    // Use: for loop + if + substring method
    System.out.println("8. Check if the string s8b is a substring of s8a");
    String s8a = "abcbaxxxxxxdfad";
    String s8b = "cba";
    int lens8a = s8a.length();
    int lenS8b = s8b.length();
    int thersold = lens8a - lenS8b;
    for (int i = 0; i <= s8a.length(); i++) {
      if (i < thersold) {
        //System.out.println(s8a.substring(i, i + lenS8b));
        if (s8a.substring(i, i + lenS8b).equals(s8b.substring(0,lenS8b))) { // !== 無效
          System.out.println("FOUND");
      }
      }
    }

    // 9. Count the number of char value in the given String s9
    // print "count=2"
    // Use: for loop + if
    String s9 = "pampers";
    char c9 = 'p';
    int count = 0;
    System.out.println("9. Count the number of char value in the given String s9");
    for (int i = 0; i < s9.length(); i++) { //! .equals無效
      if(s9.charAt(i) == (c9)) {
        count ++;
      }
    }
    System.out.println("count=" + count);

    // 10. Replace all char value 'x' in the given String array by 'k'
    // Print arr10: ["akc", "kkk", "k", "kbk", "mkk"]
    // Use: for loop + replace method
    System.out.println("10. Replace all char value 'x' in the given String array by 'k'");
    String[] arr10 = new String[] {"akc", "xxx", "x", "xbx", "mkx"};
    for (int i = 0; i < arr10.length; i++) {
      //if (arr10[i].charAt(i) == 'k') { //! 再看 equals
        arr10[i].replace('k','x');
      //}
    }
    System.out.println(Arrays.toString(arr10));


    // 11. Count the number of Uppercase char value in the given string s11
    // Print "count uppercase=4"
    // Use: for loop + if
    String s11 = "kLKloOOu";
    System.out.println("11. Count the number of Uppercase char value in the given string s11");
    int asciiA = (int) 'A';
    int asciiZ = (int) 'Z';
    count = 0;
    for (int i = 0; i < s11.length(); i++) {
      if ((int) s11.charAt(i) >= asciiA) {
        if ((int) s11.charAt(i) <= asciiZ) {
          count += 1;
        }
      }
    }
    System.out.println("count uppercase=" + count);

    // 12. Print the following pattern of * value
    // *****
    // *****
    // *****
    System.out.println("12. Print the following pattern of * value");
    int starNums = 5;
    int loopTimes = 3;
    
    String outPut = ""; 
    for (int i = 0; i < loopTimes; i++) {
      for (int j = 0; j < starNums; j++) {
        outPut = outPut + '*';
      }
      System.out.println(outPut);
      outPut = "";
    }
    
    
    // 13. Given a string value s13, each of the char value has its score.
    // Calculate the total score
    // Use: switch + for loop
    

    // l -> 1 score
    // r -> 3 score
    // d -> 2 score
    // u -> 4 score
    // for other character, -1 score
    System.out.println("13. Given a string value s13, each of the char value has its score.");
    String s13 = "lrlaudbucp";
    char txtScores;
    int sumResults = 0;

    int score = 0;
    for (int i = 0; i < s13.length(); i++) {
      txtScores = s13.charAt(i);

      switch (txtScores) {
        case 'l':
          score = 1;
          break;
        case 'r':
          score = 2;
          break;
        case 'd':
          score = 3;
          break;
        case 'u':
          score = 4;
          break;
        default: 
          score = -1;
          break;
        
      }
      sumResult += score; 
    }
    System.out.println("Result " + sumResult);
    
    // 14. Assign the long values of 1, 4, 9, -4 to the given array arr14
    long[] arr14 = new long[4];
    int[] arrInt = new int[] {1, 4, 9, -4};
    System.out.println("14. Assign the long values of 1, 4, 9, -4 to the given array arr14");
    for (int i = 0; i < arr14.length; i++) {
      arr14[i] = arrInt[i];
    }
    System.out.println(Arrays.toString(arr14));

    // 15. Find the max value and min value in arr14
    // Use One Loop + if
    Long maxValue = Long.MIN_VALUE;
    for (int i = 0; i < arr14.length; i++) {
      if (arr14[i] > maxValue) {
        maxValue = arr14[i];
      }
    }
    System.out.println(maxValue);

    // 16. Declare a float value (arr16) array with value 0.2, 0.3, 0.6
    double[] arrDou = new double[] {0.2, 0.3, 0.6};
    float[] arr16 = new float[arrDou.length];

    for (int i = 0; i < arr16.length; i++) {
      arr16[i] = (float) arrDou[i];
    }
    System.out.println(Arrays.toString(arr16));

    // 17. Add value 0.1 to each of value in array arr16
    //! [0.3, 0.4, 0.70000005]
    // Print: [0.3, 0.4, 0.7]
    // Use: BigDecimal
    System.out.println("17. Add value 0.1 to each of value in array arr16");
    BigDecimal bdAdd = BigDecimal.valueOf((float) 0.1);
    for (int i = 0; i < arr16.length; i++) {
      arr16[i] = BigDecimal.valueOf(arr16[i]).add(bdAdd).floatValue();
      // change to floatValue
    }
    System.out.println(Arrays.toString(arr16));

    // 18. Count the number of target strings in the String[]
    System.out.println("18. Count the number of target strings in the String[]");
    String[] arr18 = new String[] {"Steve", "Tommy", "Katie", "Tommy", "Lydia"};
    String target = "Tommy";
    count = 0;
    // Print "count name=2"
    for (int i = 0; i < arr18.length; i++) {
      if (arr18[i].equals(target)) {
        count++;
      }
    }
    System.out.println("count name=" + count);

    // 19. swap the max digit and min digit
    // Assumption: each digit value appear once in the String
    // Print: "49280"
    System.out.println("19. swap the max digit and min digit");
    String s19 = "40289";

    int[] arrS19 = new int[s19.length()];
    String stringResult = "";
    int maxLoc = 0;
    int minLoc = 0;

    for (int i = 0; i < s19.length(); i++) {
      arrS19[i] = ((int) s19.charAt(i))-48;
    }
    int maxx = arrS19[0];
    int minx = arrS19[0];

    for (int i = 0; i < s19.length(); i++) {
      arrS19[i] = ((int) s19.charAt(i))-48;
      if (arrS19[i] >= maxx) {
        maxx = arrS19[i];
        maxLoc = i;
      }
      if (arrS19[i] <= minx) {
        minx = arrS19[i];
        minLoc = i;
      }
    }
    arrS19[minLoc] = maxx;
    arrS19[maxLoc] = minx;
  
    System.out.println(Arrays.toString(arrS19));
    for (int i = 0; i < arrS19.length; i++) {
      stringResult = stringResult + String.valueOf(arrS19[i]);
    }
    System.out.println(stringResult);
       

    // 20. Find the longest String in the String array
    // Print "longest=programming"
    System.out.println("20. Find the longest String in the String array");
    int maxLen = 0;
    int longestIndex = 0;
    String[] arr20 = new String[] {"python", "array", "programming", "java", "bootcamp"};
    for (int i = 0; i < arr20.length; i++) {
      if (maxLen < arr20[i].length()) {
        maxLen = arr20[i].length();
        longestIndex = i;
      }
    }
    System.out.println("longest="+arr20[longestIndex]);
 
  }
}