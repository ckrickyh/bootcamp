public class DemoPrimitive {
  public static void main(String[] args) {

    // int, double, long, short, byte, float, boolean, char
    byte b1 = 10;
    byte b2 = -128;
    byte b3 = 127;// range byte -128 to 127
    // byte b4 = 128; //this is error as byte maximum = 127


    short s1 = 10;
    short s2 = -32768;
    short s3 = 32767;
    System.out.println(s1);

    // int(2.1b)
    int x1 = 1_000_000; // for readlibility
    int x2 = -2_147_483_648;
    int x3 = 2_147_483_647; // '_' for easily readibility;


    //
    long l1 = 10;
    long l2 = -2_147_483_649L; //主程式下, java 數值 assume 係 int, 但 int 上限係-2_147_483_649,
    // 所以 -2_147_483_649 係 illegeal value, 如果變正表示為 2_147_483_646L,  就, 由 int 轉為 合法的long
    x3 = x3 + 1;
    System.out.println(x3);

    b3 = 127;
    int i9 = 1;
    //b3 = b3 + i9; //(b3 = b3 + i9, byte b3 最盡係127, 127+1 = 128, 超過128, 令sys 會 overflow 轉result為-127)
    System.out.println(b3+i9); //此處無assignment, 所以work
    // int 最盡係21億

    //double, float
    double d1 = 9.5;
    float d2 = 9.5f; //float d2 = 9.5 is illegal, seems like byte = 128 (max is 127)

    // bollean
    int age = 66;
    boolean isEldery = age > 65;
    System.out.println("isEldery: " + isEldery);

    //char for single character ONLY
    char c1 = 'a';

  }
  
}
