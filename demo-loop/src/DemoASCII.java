public class DemoASCII {
  public static void main(String[] args) {
    char x = 'a';
    int asciix = x;
    System.out.print("a: " + asciix);

    char y = '\'';
    int asciiy = y;
    System.out.println(asciiy);

    char a = 'a';
    int asciia = a;
    
    char z = 'z';
    int asciiz = z;

    int result  = asciia-asciiz;
    System.out.println("value: " + result);

    for (int i = asciiz-asciia; i<asciia; i++) {
      System.out.println(i);
    }
  
  }
  
}
