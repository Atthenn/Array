public class Main {

    public static void main(String[] args){

       // int[] myArray = {1,2,3,4,5,6,7,8,9,10};

        int[] myArray = new int[25];
        double[] doubles = new double[10];
        //intArray[4]= 30;
      //  System.out.println(intArray[4]);

        printArray(myArray);
    }

    private static void printArray(int[] myArray) {
        for (int i = 0; i <myArray.length ; i++) {
            myArray[i]= i;
            System.out.println(myArray[i]);
        }
    }
}
