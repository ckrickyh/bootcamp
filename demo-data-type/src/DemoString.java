public class DemoString {
  public static void main(String[] args) {
    char c1 = 'y';
    String s1 = "Hello";
    String s2 = "100";
    int x = 198;
    s2 = s2 + "100";
    System.out.println("s2: "+ s2 + "_" + c1); //100100_198

    
    // string method 1 length
    String s4 = "hello";
    //!String s5 == "apple";
    System.out.println(s4.equals("hello"));
    System.out.println(s4 == "hello"); //! ????
    System.out.println(s4);
    //System.out.println(s5);
    int s4len = s4.length();
    System.out.println(s4len);

    // string method 2 length()

    double s4long = s4.length();
    System.out.println(s4long);


    // string method 2 chartAt()
    System.out.println(s4.charAt(0)); // e


  }
  
}
