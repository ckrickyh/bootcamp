import java.nio.charset.CharacterCodingException;

public class DemoWrapper {
  public static void main(String[] args) {
    // 8 primitives
    long varL = 123;
    short varS = 123;
    boolean varB = true; // default is false;
    int varT = 1234;
    char varC = 'C';
    //String varS = "@E";
    byte varByte = 3;
    float varF = 3.12f;
    double varD = 3.14;

    //Wrapper Class of char
    Character c1 = Character.valueOf(varC);
    System.out.println(c1);
    char c0 = c1.charValue();
    System.out.println("c0: " + c0);

    System.out.println(c1.compareTo(Character.valueOf('A'))); // -2

    // Wrapper Class of boolean
    Boolean b3 = Boolean.valueOf(true);
    Boolean b4 = Boolean.valueOf(false);

    // Wrapper Class of byte, short, int, long
    byte b6 = 2;
    Byte b5 = Byte.valueOf((byte) 2);    // int -> byte (unsafe)

    Short s2 = Short.valueOf((short) 2);
    Integer i1 = Integer.valueOf(2);
    Long l1 = Long.valueOf(2L);

    //Wrapper class of float, double
    Float f3 = Float.valueOf((float) 3.14);
    Double d3 = Double.valueOf(3.13d);
    
    //!Autoboxing
    Integer i2 = 2; //int value -> Integer variable

    long l3 = 2; // int -> long(safe conversion)
    Long l2 = 2L; //Wrapper class "L"ong, assigned by right hand side 2 (integer), 
                //so need to change 2L

    //!Unboxing
    int i4 = Integer.valueOf(10);

    Integer i6 = (int) ((long) Long.valueOf(10)); // Long -> long -> (autobox) Integer

    // compareTo() for Integer
// ! Integer never use >,<,>=,<=, =, We should use compareTo for comparsion

    int age = 102;

    // check left is bigger  => -1,0,1 (0 is equal, 1 is correct, -1 is incorrect)
    Integer ans = Integer.valueOf(100).compareTo(Integer.valueOf(age)); 
    System.out.println(ans);

    //unboxing for math opreation (intA minus intB -> throw to result int )
    int diff = Integer.valueOf(100) - Integer.valueOf(age);
    System.out.println(diff);

    //!Check if the String value is Palindromic
    // madam 
    // ada
    //return boolean;
    String var1 = "madam"; // true
    int vLen = var1.length()-1;
    boolean isFalse = false;
    int mid = var1.length()/2 + 1;
    String result = "Idential";

    for (int i = 0; i <= vLen; i++) {
      isFalse = false;
      if (var1.charAt(i) == var1.charAt(vLen - i)) {
        isFalse = true;
        //System.out.println(isFalse);
      }
      if(isFalse == false) {
        result = "Not identical";
        break;
      }      
      if (i == mid) {
        break;
      }
    }
    System.out.println(result);

  }
}
