public class DemoWhileLoop {
  public static void main(String[] args) {

    // while loop 重點, *只set 次數*, 在內才做需要動作
    int x = 2;
    int k = 0;
  
    while (k<3) {
      x = x *2;
      k++;
      System.out.println("Hello: " + x);
    }

    // do while loop , while 升級版 , 應用例,  try login

    k = 0;
    do {
      System.out.println("hello");
      k++;
    }
    while (k<3);

  }
  

}
