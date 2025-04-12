public class Demoif {
  public static void main(String[] args) {

    int x = 13;
    if (x < 10) {
      System.out.println("x<10");
    } else if (x<15) {
      System.out.println("x<20");
    } else {
      System.out.println("10-19");
    }

    boolean a;

    String s = "12334";
    System.out.println(s =="232");

    a = s.equals("hello");
    System.out.println(a);



    
    boolean isFemale = true;
    boolean isSmoker = false;
    int age = 15;
    double premium = 0.0;
    //int bPremium = 120;

    //!1. Female is 40 + NS -> 8
    //!2. Female is 40 + S -> 8 + 7 
    //!3. Male is 16 + NS -> 3
    //!4. Male is 16 + S -> 3 + 7

    if (age >= 16 && age <70 && isFemale == true) {
      premium = premium + 8;
    }
    if (age >= 70) {
      premium = 20;
    }
    if (isSmoker == true) {
      premium = premium + 7;
    }
    System.out.println("pre: " + premium);


    // Answer

    premium = 120.0;
    double extraRate = 0.0;
    if (isFemale) {
      if (age >= 70) {
        extraRate += 0.2;
      } else if (age >= 40) {
        extraRate += 0.08;
      }
    } else { // male
      if (age >= 70) {
        extraRate += 0.2;
      } else if (age >= 16) {
        extraRate += 0.03;
      }
    }
    if (isSmoker) {
      extraRate += 0.07;
    }
    premium *= 1 + extraRate;
    System.out.println(extraRate);
    System.out.println(premium);


    //
    
  }
}
