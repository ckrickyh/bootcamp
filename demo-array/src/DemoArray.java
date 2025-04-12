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

        
        double[] arrDouble = new double[4];
        arrDouble[0] = 10.0;
        arrDouble[1] = 12.3;
        arrDouble[2] = 13.3;
        //arrDouble[3] = 12.4;
        System.out.println(arrDouble[3]); //0.0

        String[] arrStr = new String[2];
        System.out.println(arrStr[0]); //null

        
        int[] arrStr2 = new int[4];
        for (int i=0; i<=3; i++) {
            arrStr2[i] = i;
            System.out.println(arrStr2[i]);
        }
        

    }
}
