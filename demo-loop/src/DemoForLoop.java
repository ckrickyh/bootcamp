import java.math.BigDecimal;
import java.util.Arrays;

public class DemoForLoop {
    public static void main(String[] args) throws Exception {
        int x = 2;

        for (int i = 0; i < 2; i++) {
            x = x * x;
            System.out.println(x);
        }

        // min max
        int num1 = 9;
        int num2 = 17;
        int max;

        if (num1 > num2) {
            max = num1;
        } else {
            max = num2;
        }

        System.out.println(max);

        // find the largest odd number, which is < 90, from 0-100;

        int minx = 0;
        int maxx = 100;
        int maxOdd = -1;

        for (int i = minx; i < maxx + 1; i++) {
            if (i < 85 || i > 90 || i % 2 == 0) {
                continue;
            }
            if (i > maxOdd) {
                maxOdd = i;
            }
        }
        System.out.println("***largest odd <90 between 0-100: " + maxOdd);


        // 0 -20 sum up all even
        // 0 +2+4+...

        int min2 = 0;
        int max2 = 20;
        int sum = 0;

        for (int i = max2; i >= min2; i--) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("total: " + sum);


        // 0-30, if < 20 , sum odds, if > = 20 sum even
        int start = 0;
        int end = 30;
        int sumx = 0;

        for (int i = end; i >= start; i--) {
            if (i >= 20) {
                if (i % 2 == 0) {
                    sumx += i;

                }
            } else {
                if (i % 2 == 1) {
                    sumx += i;
                }

            }

        }

        System.out.println("total: " + sumx);


        // Searchig
        String s2 = "welecome to bootcamp.";
        int c1 = 0;

        // find no. of 'o'
        // for (int i = 0; i < s2.length(); i--) {
        for (int i = s2.length() - 1; i >= 0; i--) {
            if (s2.charAt(i) == 'o') {
                c1++;
            }
        }
        System.out.println("total o in text: " + c1);



        // fm range between 1 to 20
        // sum up 5 - 15
        // product 16-20

        int result1 = 0;
        int result2 = 1;
        int resultAll = 0;
        for (int i = 0; i <= 20; i++) {

            // ! for showing excluding condition for readility
            if (i < 5) {
                continue;
            }
            if (i >= 5 & i <= 15) {
                result1 += i;
            }
            if (i > 15 && i <= 20) {
                result2 *= i;
            }
            resultAll = result1 + result2;
        }
        System.out.println("Result1: " + result1);
        System.out.println("Result2: " + result2);
        System.out.println("Result1+2: " + resultAll);

        // find max // new approach
        int maxNum = -1000;
        int[] arr = new int[] {199, -20, 90, 17};
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(arr[i], max);
        }
        System.out.println(max);
        System.out.println("Result " + Arrays.toString(arr));


        // equals(), length(), charAt()
        char[] chsList = "hello".toCharArray();
        for (int i = 0; i < chsList.length; i++) {
            System.out.println(chsList[i]);
            if (chsList[i] == 'l') {
                chsList[i] = 'x';
            }
        }
        System.out.println("Result replace " + Arrays.toString(chsList));
        System.out.println(String.valueOf(chsList));

        "hello".equals("hello");
        "hello".equalsIgnoreCase("Hello");

        float[] valueList = new float[] {0.2f, 0.5f, 1.9f};
        // double[] valueList2 = new double[3];
        BigDecimal addValue = BigDecimal.valueOf(0.1);
        // System.out.println(valueList.length);
        for (int i = 0; i < valueList.length; i++) {
            valueList[i] = BigDecimal.valueOf(valueList[i]).add(addValue) //
                    .floatValue(); //
        }
        System.out.println(Arrays.toString(valueList));


        // arrage in BigDecimal
        int[] intArray = {1, 2, 3, 4, 5};
        BigDecimal[] bdLst = new BigDecimal[intArray.length];
        for (int i = 0; i < intArray.length; i++) {
            bdLst[i] = BigDecimal.valueOf(intArray[i]);
        }
        System.out.println(Arrays.toString(bdLst));

        //float array
        float[] fArr = new float[intArray.length];
        for (int i = 0; i < intArray.length; i++) {
            fArr[i] = bdLst[i].floatValue();

        }
        System.out.println(Arrays.toString(fArr));


    }
}


