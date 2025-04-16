public class DemoString {
  public static void main(String[] args){
    //wk1: equals(), length(0, charAt()
    //wk2: Other String methods
    //1. replace
    System.out.println("bootcamp".replace('o', 'x')); //bxxtcamp
    System.out.println("bootcamp".replace("oo", "lll"));

    //2. indexOf() (first index of)
    System.out.println("firstIndexOf \"l\": " +"hello".indexOf('l')); // 2
    System.out.println("firstIndexOf \" \": " +"hello".indexOf(' ')); // -1 => resutl is -1 when not found
    // lastIndexOf (last index of)
    System.out.println("lastIndexOf \"l\": " + "hello".lastIndexOf('l')); // 3

    //3. concat()
    String s1 = "hello" + "world";
    System.out.println(s1);  //"+" 方法係超慢!!!
    System.out.println("concat method of 2 words: " + "hello".concat("world")); //快好多的方法

    //4.isEmpty()
    boolean result = "".isEmpty();
    System.out.println("isEmpty of input: " + result); // true
    System.out.println("isEmpty of hello: "+ "hello".isEmpty());

    //5. trim()
    String input = " Hello world ! "; //trim 頭尾
    System.out.println("isEmpty of \"Hello world !\": " + input.trim());

    //6. chain methods 鏈
    System.out.println(input.trim().charAt(0)); // 最後 string type 轉左做 char type 

    //!7. substring endIndex -1 => 我的解法, (i[位置], i+1[長度])
    System.out.println("hello".substring(0, 1));
    System.out.println("hello".substring(1, 3));
    System.out.println("hello".substring(0, 0)); // => ""
    System.out.println("hello".substring(1, 2)); // => 'e'
    System.out.println("hello".substring(1, 3)); // => "el"
    System.out.println("hello".substring(1, 3)); // => "el"

    //8. toLowerCase()
    System.out.println("lowerCase : " + "HELlo".toLowerCase());
    
    //9. toUpperCase()
    System.out.println("upperCase : " + "HELlo".toUpperCase());

    //10. contains()
    System.out.println("contains : " + "HEllo".contains("ll"));

    //11. startsWith / endsWith
    System.out.println("startsWith : " + "HEllo".startsWith("HE"));

  }
  
}
