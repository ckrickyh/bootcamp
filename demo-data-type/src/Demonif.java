public class Demonif {
  public static void main(String[] args) {

    int x = 3;
    boolean result = x > 3;
    System.out.println(result);

    boolean result2 = x>=3;
    System.out.println(result2);

    if (x>3) { //'=='
      System.out.println("x is larger than 3");
    } else {System.out.println("x is within the range of 3");
    }

    char gender = 'F';
    if (gender != 'F') {
      System.out.println("This is a male person.");
    } else {System.out.println("This is a female person.");
    }

    //if (gender.equals('F')) {
      //System.o//ut.println("This is a male person.");
    //} else {System.out.println("This is a female person.");
    //}

    String s2 = "AB5DE";
      System.out.println((double) 5 / 2);
    //
    if (s2.length()<1) {
      System.out.println(s2.charAt(0));
    } else {
      if (s2.length() % 2 != 0){
        System.out.println("middle: " + s2.charAt(s2.length() / 2));
      } else {
        System.out.println("middle: " + s2.charAt(s2.length()/2-1));
      }
    }

    // and + or 一齊用既優次
    int x6 = 10;
    //step1: x6 < 9, if true, exit criteria checking; if false, go step2
    //step2: x6 % 2 == 0 && x6>0
    if (x6 < 9 || x6 % 2 == 0 && x6>0) {
      System.out.println("yes");
    }

    //Question: counting, 
    String s5 = "hello world";
    int count = 0;

    for (int i = 0; i < s5.length(); i++) {
      System.out.println(s5.charAt(i));
      if (s5.charAt(i) == 'o') {
        count++;
      }
    }
    System.out.println(count);


    // count odds
    int count1 = 0;
    for (int i = 0; i < 10; i++) {
      if (i % 2 == 0) {
        count1++;
      }
    }
    System.out.println("total no. odds: " + count1);



    //最優解 方法
    int num1 = 14;
    int num2 = 2;
    int num3 = 13;

    int min;
    if (num1 < num2) {
      min = num1;
    } else {
      min = num2;
    }
    
    if (min > num3) {
      min = num3;
    }
    System.out.println(min);
    }
}
