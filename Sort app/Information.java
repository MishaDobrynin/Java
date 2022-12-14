import java.util.InputMismatchException;
/**
 * Write a description of class Information here.
 *
 * @author Misha Dobrynin
 * @version 5/10 2022 (all files are updated daily.) - 5/11/2022 MM/DD/YYYY
 */
public class Information{
    public static void getInfoSorted(){
        System.out.println("Sorted.");
        System.out.println("1.) Integer | 2.) Double");
    }
    public static void getInfoFlip(){
        System.out.println("Flip.");
        System.out.println("1.) Integer | 2.) Double");
        System.out.println("3.) String  |");
    }
    public static void getInfoPalindrome(){
        System.out.println("Palindrome.");
        System.out.println("1.) Integer | 2.) Double");
        System.out.println("3.) String  |");
    }
    public static void getInfoDistance(){
        System.out.println("Distance.");
        System.out.println("1.) Integer | 2.) Double");
    }
    public static void getInfoInside(){
        System.out.println("Inside.");
        System.out.println("1.) Integer | 2.) String");
    }
    public static void getInfoMoveLeft(){
        System.out.println("Move Left.");
        System.out.println("1.) Integer | 2.) Double");
        System.out.println("3.) String");
    }
    public static void getInfoMoveRight(){
        System.out.println("Move Right.");
        System.out.println("1.) Integer | 2.) Double");
        System.out.println("3.) String");
    }
    public static void getInfo(int user) throws InputMismatchException{
        switch(user){
            case 1:
                System.out.println("Move Right.");
                System.out.println("Allows you to move a given array a certain amount of times, to the right.");
                break;
            case 2:
                System.out.println("Move Left.");
                System.out.println("Allows you to move a given array a certain amount of times, to the left.");
                break;
            case 3:
                System.out.println("Pairs.");
                System.out.println("Allows you to sum up the elements of an array.");
                break;
            case 4:
                System.out.println("Inside.");
                System.out.println("Lets you see wether a sub-array is inside another array.");
                break;
            case 5:
                System.out.println("Distance.");
                System.out.println("Gives you the longest distance between two numbers in an array.");
                break;
            case 6:
                System.out.println("Palindrome.");
                System.out.println("Lets you check wether or not an array is a palindrome.");
                break;
            case 7:
                System.out.println("Flip.");
                System.out.println("Lets you reverse an array.");
                break;
            case 8:
                System.out.println("Sorted.");
                System.out.println("Lets you see if an array is sorted(non-decending) order");
                break;
            case 9:
                System.out.println("Lets you leave the program.");
                break;
            case 10:
                System.out.println("Wow. You found my easter egg.");
                int y = 10/0;
        }
    }
}
