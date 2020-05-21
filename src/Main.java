import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        int[] myIntegers = getIntegers(5);
        for (int i = 0; i <myIntegers.length ; i++) {
            System.out.println("Element" + i + ",typed value was "+myIntegers[i]);
        }
        System.out.println("The Average is " + getAverage(myIntegers));

//       // int[] myArray = {1,2,3,4,5,6,7,8,9,10};
//
//        int[] myArray = new int[25];
//        double[] doubles = new double[10];
//        //intArray[4]= 30;
//      //  System.out.println(intArray[4]);
//
//        printArray(myArray);
//    }
//
//    private static void printArray(int[] myArray) {
//        for (int i = 0; i <myArray.length ; i++) {
//            myArray[i]= i;
//            System.out.println(myArray[i]);
//        }
   }

    private static int[] getIntegers(int number) {

        System.out.println("Enter " + number +" integer values.\r");
        int[] values = new int[number];
        for (int i = 0; i <number ; i++) {
            values[i]=scanner.nextInt();
        }
        return values;
    }
    public static double getAverage( int[] myArray){

        int sum = 0;
        for (int i = 0; i <myArray.length ; i++) {
            sum += myArray[i];
        }

        return (sum/myArray.length);

    }
}
