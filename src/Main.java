import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        int[] array = {1,2,3,4,5};
        int[] copy = Arrays.copyOf(array,3);

        for (int i = 0; i < copy.length; i++) {
            System.out.println(copy[i]);

        }
//        int[] myIntegers = getIntegers(5);
//        for (int i = 0; i <myIntegers.length ; i++) {
//            System.out.println("Element" + i + ",typed value was "+myIntegers[i]);
//        }
//        System.out.println("The Average is " + getAverage(myIntegers));

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
//        int[] test = readFromConsule();
        printInput(test);
        sortInput(test);
   }

   private static int[] readFromConsule(){

        int[] inputIntegers = new int[5];
       for (int i = 0; i <inputIntegers.length ; i++) {

           inputIntegers[i]=scanner.nextInt();
       }
        return inputIntegers;
   }
   private static void printInput(int[] array){
       for (int i = 0; i <array.length ; i++) {
           System.out.println(array[i]);
       }
   }

   private static int[] sortInput(int[] array){
  //      int[] copy = new int[array.length];
//       for (int i = 0; i <array.length ; i++) {
//           copy[i] = array [i];
//       }
       int[] copy = Arrays.copyOf(array,array.length);
       boolean flag = true;
       int max = 0;
       int index=0;
       int j = 0;
       while(flag){
           for(int i = j; i< copy.length ; i++){
               if (copy[i]> max){
                   max = copy[i];
                   index = i;
               }
           }
           int tmp = copy[j];
           copy[j] = max;
           copy[index] = tmp;
           max = 0;
           j++;
           if(j>4)
               flag=false;
       }

       printInput(copy);


       return copy;
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
