public class DemoArray {
    public static void main(String[] args) throws Exception {

        // array[]
        // right hand side -> creating an array with size 3.
        // left hand side -> assign int array object to int array type (variable)
        int[] arr =  new int[3];  // new is a object

        // Question: int array with size 5
        //10, 7, 4, -100

        int[] arr2 = new int[4];
        arr2[0] = 10;
        arr2[1] = 7;
        arr2[2] = 4;
        arr2[3] = -100;
        System.out.println(arr2);

        // print double type
        double[] arrDouble = new double[4];
        arrDouble[0] = 10.0;
        arrDouble[1] = 12.3;
        arrDouble[2] = 13.3;
        //arrDouble[3] = 12.4;
        System.out.println(arrDouble[3]); //0.0

        for (int i = 0; i < arrDouble.length; i++) {
            System.out.println("result Double type is " + arrDouble[i]);
        }

        String[] arrStr = new String[2];
        System.out.println(arrStr[0]); //null

        
        int[] arrStr2 = new int[4];
        for (int i=0; i<=3; i++) {
            arrStr2[i] = i;
            System.out.println(arrStr2[i]);
        }
        
        // add 1.5 to each array values
        double[] amounts = new double[6];
        amounts[0] = 10.0;
        amounts[1] = 120.0;
        amounts[2] = 9.0;

        double result = 0; 
        for (int i = 0; i < 6; i++) {
            result += 1.5*20;
            amounts[i] = result;
            System.out.println(amounts[i]);
        }

        // print out those values > 100
        for (int i = 0; i < amounts.length; i++) {
            if (amounts[i] > 100) {
                System.out.println(amounts[i]);
            } else {
            System.out.println("Not > 100 in arr amounts [" + i + "]");
            }
        }

        // int array
        int[] ages = new int[90];
        for (int i = 0; i < 90; i++) {
            if (i % 2 == 0) {
                ages[i] = i;
                System.out.println("Age in ages array " + ages[i]);
            }
        }


        // for + if 
        int[] numbers = new int [6];
        numbers[1] = -7;
        numbers[2] = -5;
        numbers[3] = 202;
        numbers[4] = 7;
        numbers[5] = 9;
        numbers[0] = -1;
        int large = Integer.MIN_VALUE; //!min value of integer

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > large) {
                large =  numbers[i];
            } else {
                large = large;
            }
        }
        System.out.println(large);


        int[] salaries = new int[4];
        salaries[0] = 1111400;
        salaries[1] = 11400;
        salaries[2] = 1400;
        salaries[3] = 111400;

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < 4; i++) {
            if (min > salaries[i]) {
                min = salaries[i];
            }
        }
        System.out.println(min);

        // find the longest name in the array
        String[] names = new String[3];
        names[0] = "John";
        names[1] = "Ericccccc";
        names[2] = "Peter";
        int loc = 0;
        String longestName = "";
        int longest = Integer.MIN_VALUE;
        for (int i = 0; i < names.length; i++) {
            //if (names[i].length() > longest) {
            if (names[i].length() > longestName.length()) {
                //longest = names[i].length();
                //loc = i;
                longestName = names[i];
            }
        }
        System.out.println("Longest name is : " + longestName);

        int[] nums = new int[4];
        nums[0] = 9;
        nums[1] = 8;
        nums[2] = 7;
        nums[3] = 10;

        int firstEven = Integer.MAX_VALUE;
        int count = 0;

        for (int i = 0; i <= nums.length; i++) {
            if (count > 0) {
                break;
            }
            if (nums[i] % 2 == 0) {
                firstEven = nums[i];
                count = count + 1;
            }


        }
        System.out.println(firstEven);


        // swapping 換位
        int w1 = 2;
        int w2 = 3;
        //int[] list = new list[6];
        //for (int i = 0; i < list.length; i++) {
            //for (int i = 0; j < list.length - i -1 ; j++) {
                //if (marksiz[j +1] < marksiz[j]) {
                    //temp = marksix[j + 1];
                    //marks 
                //}

            //}
        //}
        

        //!counting >1 的英文字的總數
        char[] chs2 = new char[] {'a', 'b','a','b','b', 'c'};
        count = 0;

        // right answer;
        // char[] chs2 = new char[] {'a', 'b','a','p','o'};
        int[] az = new int[26]; // 開 az表,
        for (int i = 0; i < chs2.length; i++) { // 行 chs2 表
            //counts[chs2[i] - 'a']++;
            int index = chs2[i] - 'a'; // acquire az表位置 . a (ascii) = 97
            //counts[index]++;
            az[index] = az[index] + 1; // Az 表 中的數值 + 1, 本身已set 為 0 

        }
        result = 0;

        for (int i = 0; i < az.length; i++) {
            if (az[i] > 1) {
                //result++;
                result = result +1;
                
            }
        }
        System.out.println("resultA: " + result );

        //! 0 9 1 9 2 0 9 9 0, 有無一個數字的次數超過3次
        int index = 0;
        int numListLen = 100;
        int[] numList = new int[numListLen];    //Create a List with maxiumn 21億
        int[] dataList = new int[] {0, 19, 1, 9, 2, 10, 29, 9, 0};
        String textResult = "";

        for (int i = 0; i < dataList.length; i++) {
            index = dataList[i]; //
            numList[index] = numList[index] + 1;
        }

        result = 0;
        
        for (int i = 0; i < numList.length; i++) {
            if (numList[i] >= 3) {
                result = result + 1;
                break;
            } 
        }
        if (result > 0) {
            System.out.println("There is a number with occurance greater than 3 times");
        } else {
            System.out.println("No number with occurance greater than 3 times in the array");
        }

        //!ordering number
        int[] marksix = new int[6];
        marksix[0] = 5;
        marksix[1] = 20;
        marksix[2] = 47;
        marksix[3] = 43;
        marksix[4] = 39;
        marksix[5] = 2;

        int temp = -1;
        for (int i = 0; i < marksix.length - 1; i++) { // i = 0 (how many numbers I need to swap)
          for (int j = 0; j < marksix.length - i - 1; j++) { // j=0,1,2,3,4 | j=0,1,2,3
            if (marksix[j + 1] < marksix[j]) {
              temp = marksix[j + 1];        //置換1
              marksix[j + 1] = marksix[j];  //置換2
              marksix[j] = temp;            //置換3
            }
          }
        }
        for (int i = 0; i < marksix.length; i++) {
          System.out.println(marksix[i]);
        }
    }
}
