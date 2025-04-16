import java.math.BigDecimal;
import java.math.RoundingMode;

public class DemoBigDecimal {
  public static void main(String[] args) throws Exception  {

    //doubt + double  => might result errors (e.g. 0.1+0.2)
    System.out.println(0.1+0.2);  //0.3000000000000004

    //9成人行內使用的工具
    // by using BigDecimal library;
    BigDecimal bd1 = new BigDecimal("0.1");
    BigDecimal bd2 = BigDecimal.valueOf(0.2);

    //! add
    BigDecimal bd3 = bd1.add(bd2);
    System.out.println("out " + bd3);

    //! subtract
    BigDecimal bd4 = bd1.subtract(bd2);
    System.out.println("subtract " + bd4);
  
    //! multiply
    BigDecimal bd5 = bd1.multiply(bd2);
    System.out.println("mutliple " + bd5);

    //! divide
    BigDecimal bd6 = bd1.divide(bd2);
    System.out.println("divide " + bd6);

    BigDecimal a = BigDecimal.valueOf(10.0);
    BigDecimal b = BigDecimal.valueOf(3.0);
    
    //HALF-DOWN 5舍6入
    BigDecimal bd7 = a.divide(b, 2, RoundingMode.HALF_DOWN); //HALF_DOWN touch => 5舍6入; HALF_UP => 4舍5入
    System.out.println("divide bd7 (HALF_DOWN, 2個小數位, 5舍6入):" + bd7);

    //HALF-UP 4舍5入
    BigDecimal bd8 = a.divide(b, 2, RoundingMode.HALF_UP); //HALF_UP touch => 5舍6入; HALF_UP => 4舍5入
    System.out.println("divide bd8 (HALF_UP, 2個小數位, 4舍5入):" + bd8);

    BigDecimal source = BigDecimal.valueOf(2);
    double result = source.doubleValue();
    long result2 = source.longValue();
    int result3 = source.intValue();
    float result4 = source.floatValue();
    String result5 = source.toString();

    // absolute
    double result2Java = bd8.doubleValue()+3.3;
    System.out.println("Result :" + result2Java);



  }
}
