public class DemoOpreator {
  public static void main(String[] args) {
    
    int y;
    int x;
    y = 9;
    x = y++ + y++ +2; //return org value before incrementing
    System.out.println("*" + x); //x is 21 
    // 9+10+2

    y = 9;
    x = ++y + ++y +2; //return new value after incrementing
    System.out.println("**" + x); //x is 23
    // 10+11+2
  } 
  
}
