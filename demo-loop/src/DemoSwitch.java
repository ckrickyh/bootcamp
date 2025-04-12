public class DemoSwitch {
  public static void main(String[] args) {
    int x = 3;

    // switch + break + default
    // !It can check 1 varirable ONLY
    // !equals to / not equals to
    // !3. you have to 'breack' the swith yourself

    int value = 3;
    x = 4; 
    // no breaak, 3^4
    switch (x) {
      case 1:
        value = value * 3;
        //break; actually, breack required
      case 2:
        value = value * 3;
        //break;
      case 3:
        value = value * 3;
      case 4:
        value = value * 3;
      default:
    }

    // example 2
    System.out.println(value * 3);

    
  }
}