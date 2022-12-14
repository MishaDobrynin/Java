/**
 * Write a description of class Client here.
 *
 * @author Misha Dobrynin
 * @version 5/3 2022 - 5/4 2022
 */
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Arrays;
public class Client
{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int user = -1;
        int times;
        int len;
        menu();
        try{
            user = input.nextInt();
            System.out.println("\nHow long is the array?");
            len = input.nextInt();
            System.out.print("\nHow many times would you like");
            System.out.println(" to move the array to the right?");
            times = input.nextInt();
            System.out.println("\n-------------");
            switch(user){
                case 1:
                    int holdInt;
                    int[] intArr = integerArr(input, len);
                    System.out.println("Current array: " + Arrays.toString(intArr));
                    for(int n = 0; n < times; n++){
                        holdInt = intArr[len-1];
                        for(int i = len-1; i > 0; i--){
                            intArr[i] = intArr[i-1];
                        }
                        intArr[0] = holdInt;
                    }
                    System.out.println("Current array: " + Arrays.toString(intArr));
                    break;
                case 2:
                    double[] doubleArr = doubleArr(input, len);
                    double holdDub;
                    System.out.println("Current array: " + Arrays.toString(doubleArr));
                    for(int n = 0; n < times; n++){
                        holdDub = doubleArr[len-1];
                        for(int i = len-1; i > 0; i--){
                            doubleArr[i] = doubleArr[i-1];
                        }
                        doubleArr[0] = holdDub;
                    }
                    System.out.println("Current array: " + Arrays.toString(doubleArr));
                    break;
                case 3:
                    String[] stringArr = stringArr(input, len);
                    String holdStr;
                    System.out.println("Current array: " + Arrays.toString(stringArr));
                    for(int n = 0; n < times; n++){
                        holdStr = stringArr[len-1];
                        for(int i = len-1; i > 0; i--){
                            stringArr[i] = stringArr[i-1];
                        }
                        stringArr[0] = holdStr;
                    }
                    System.out.println("Current array: " + Arrays.toString(stringArr));
                    break;
                case 0:
                    System.out.println("Goodbye!"); //Create a breaker for the entire do-while
                    break;
                default:
                    System.out.println("Mode must be 1,2, or 3");
                    break;
            }
        }
        catch(InputMismatchException e){
            System.out.println("Must be an int for selection");
        }
    }
    public static int[] integerArr(Scanner input, int len){
        int[] arr = new int[len];
        System.out.println("What is the lowest number?");
        int min = input.nextInt();
        System.out.println("\nWhat is the highest number?");
        int max = input.nextInt();
        System.out.println();
        for(int i = 0; i < len; i++){
            arr[i] = (int) (Math.random()*(max-min+1)+min);
        }
        return arr;
    }

    public static double[] doubleArr(Scanner input, int len){
        double[] arr = new double[len];
        System.out.println("What is the lowest number?");
        double min = input.nextDouble();
        System.out.println("\nWhat is the highest number?");
        double max = input.nextDouble();
        System.out.println();
        double dif = max-min;
        for(int i = 0; i < len; i++){
            arr[i] = Math.random()*dif+min;
        }
        return arr;
    }

    public static String[] stringArr(Scanner input, int len){
        String[] arr = new String[len];
        System.out.println("What is the word?");
        String word = input.next();
        System.out.println("What is the lowest number?");
        int min = input.nextInt();
        System.out.println("What is the highest number? ");
        int max = input.nextInt();
        System.out.println();
        for(int i = 0; i < len; i++){
            arr[i] = word + (int) (Math.random()*(max-min+1)+min);
        }
        return arr;
    }

    public static void menu(){
        System.out.println("Hello and welcome! Please make a selection:");
        System.out.println("1. Integer array");
        System.out.println("2. Double array");
        System.out.println("3. String array");
        System.out.println("0. Exit program");
    }
}
