
/**
 * Write a description of class Client here.
 *
 * @author Misha Dobrynin
 * @version 5/10 2022
 */
import java.util.Scanner;
import java.util.Arrays;
import java.util.InputMismatchException;
public class Client{
    public static final Scanner input = new Scanner(System.in);
    public static final Flip flip = new Flip();
    public static final MoveRight rightMove = new MoveRight();
    public static final MoveLeft leftMove = new MoveLeft();
    public static final Pairs pair = new Pairs();
    public static final Inside in = new Inside();
    public static final Distance dist = new Distance();
    public static final Palindrome palindrome = new Palindrome();
    public static final Sorted sorted = new Sorted();
    public static final Information info = new Information();
    public static void main(String[] args) throws InputMismatchException{
        menu();
        int user = input.nextInt();
        while(user != 9){
            switch(user){
                case 1:
                    mvRt();
                    break;
                case 2:
                    mvLt();
                    break;
                case 3:
                    pairs();
                    break;
                case 4:
                    inside();
                    break;
                case 5:
                    distance();
                    break;
                case 6:
                    palind();
                    break;
                case 7:
                    fliper();
                    break;
                case 8:
                    sorted();
                    break;
                case 10:
                    System.out.println("What topic do you want help on?");
                    menu();
                    System.out.println();
                    info.getInfo(input.nextInt());
                    break;
            }
            menu();
            user = input.nextInt();
        }
    }
    public static void sorted() throws InputMismatchException{
        int var;
        info.getInfoSorted();
        System.out.println("What type of array?");
        var = input.nextInt();
        switch(var){
            case 1:
                System.out.println("How many elements are in your array?");
                var = input.nextInt();
                int[] iArr = new int[var];
                for(int i = 0; i < var; i++){
                    System.out.println("Element number " + (i+1) + ":");
                    iArr[i] = input.nextInt();
                }
                System.out.println("Array is: " + Arrays.toString(iArr));
                System.out.println("Returned: " + sorted.sorted(iArr));
                break;
            case 2:
                System.out.println("How many elements are in your array?");
                var = input.nextInt();
                double[] dArr = new double[var];
                for(int i = 0; i < var; i++){
                    System.out.println("Element number " + (i+1) + ":");
                    dArr[i] = input.nextInt();
                }
                System.out.println("Array is: " + Arrays.toString(dArr));
                System.out.println("Returned: " + sorted.sorted(dArr));
                break;
        }
    }
    public static void fliper() throws InputMismatchException{
        int var;
        info.getInfoFlip();
        System.out.println("What type of array?");
        var = input.nextInt();
        switch(var){
            case 1:
                System.out.println("How many elements are in your array?");
                var = input.nextInt();
                int[] iArr = new int[var];
                for(int i = 0; i < var; i++){
                    System.out.println("Element number " + (i+1) + ":");
                    iArr[i] = input.nextInt();
                }
                System.out.println("Array is: " + Arrays.toString(iArr));
                System.out.println("Returned: " + flip.flip(iArr));
                break;
            case 2:
                System.out.println("How many elements are in your array?");
                var = input.nextInt();
                double[] dArr = new double[var];
                for(int i = 0; i < var; i++){
                    System.out.println("Element number " + (i+1) + ":");
                    dArr[i] = input.nextInt();
                }
                System.out.println("Array is: " + Arrays.toString(dArr));
                System.out.println("Returned: " + flip.flip(dArr));
                break;
            case 3:
                System.out.println("How many elements are in your array?");
                var = input.nextInt();
                String[] sArr = new String[var];
                for(int i = 0; i < var; i++){
                    System.out.println("Element number " + (i+1) + ":");
                    sArr[i] = input.next();
                }
                System.out.println("Array is: " + Arrays.toString(sArr));
                System.out.println("Returned: " + flip.flip(sArr));
                break;
        }
    }
    public static void distance() throws InputMismatchException{
        int var;
        info.getInfoDistance();
        System.out.println("What type of array?");
        var = input.nextInt();
        switch(var){
            case 1:
                System.out.println("How many elements are in your array?");
                var = input.nextInt();
                int[] iArr = new int[var];
                for(int i = 0; i < var; i++){
                    System.out.println("Element number " + (i+1) + ":");
                    iArr[i] = input.nextInt();
                }
                System.out.println("Array is: " + Arrays.toString(iArr));
                System.out.println("Returned: " + dist.distance(iArr));
                break;
            case 2:
                System.out.println("How many elements are in your array?");
                var = input.nextInt();
                double[] dArr = new double[var];
                for(int i = 0; i < var; i++){
                    System.out.println("Element number " + (i+1) + ":");
                    dArr[i] = input.nextInt();
                }
                System.out.println("Array is: " + Arrays.toString(dArr));
                System.out.println("Returned: " + dist.distance(dArr));
                break;
        }
    }

    public static void palind() throws InputMismatchException{
        int var;
        info.getInfoPalindrome();
        System.out.println("What type of array?");
        var = input.nextInt();
        switch(var){
            case 1:
                System.out.println("How many elements are in your array?");
                var = input.nextInt();
                int[] iArr = new int[var];
                for(int i = 0; i < var; i++){
                    System.out.println("Element number " + (i+1) + ":");
                    iArr[i] = input.nextInt();
                }
                System.out.println("Array is: " + Arrays.toString(iArr));
                System.out.println("Returned: " + palindrome.palindrome(iArr));
            case 2:
                System.out.println("How many elements are in your array?");
                var = input.nextInt();
                double[] dArr = new double[var];
                for(int i = 0; i < var; i++){
                    System.out.println("Element number " + (i+1) + ":");
                    dArr[i] = input.nextInt();
                }
                System.out.println("Array is: " + Arrays.toString(dArr));
                System.out.println("Returned: " + palindrome.palindrome(dArr));
            case 3:
                System.out.println("How many elements are in your array?");
                var = input.nextInt();
                String[] sArr = new String[var];
                for(int i = 0; i < var; i++){
                    System.out.println("Element number " + (i+1) + ":");
                    sArr[i] = input.next();
                }
                System.out.println("Array is: " + Arrays.toString(sArr));
                System.out.println("Returned: " + palindrome.palindrome(sArr));
        }
    }

    public static void inside() throws InputMismatchException{
        int var;
        info.getInfoInside();
        System.out.println("What type of array?");
        var = input.nextInt();
        System.out.println("Making array...");
        switch(var){
            case 1:
                System.out.println("How many elements are in your array?");
                var = input.nextInt();
                int[] iArr = new int[var];
                for(int i = 0; i < var; i++){
                    System.out.println("Element number " + (i+1) + ":");
                    iArr[i] = input.nextInt();
                }
                System.out.println("How many elements are in the second array? (Must be less than first)");
                var = input.nextInt();
                while(var > iArr.length){
                    System.out.println("How many elements are in the second array? (Must be less than first)");
                    var = input.nextInt();
                }
                int[] iArr2 = new int[var];
                for(int i = 0; i < var; i++){
                    System.out.println("Element number " + (i+1) + ":");
                    iArr2[i] = input.nextInt();
                }
                System.out.println("Returned: " + in.inside(iArr, iArr2));
                break;
            case 2:
                System.out.println("How many elements are in your array?");
                var = input.nextInt();
                String[] sArr = new String[var];
                for(int i = 0; i < var; i++){
                    System.out.println("Element number " + (i+1) + ":");
                    sArr[i] = input.next();
                }
                System.out.println("How many elements are in the second array? (Must be less than first)");
                var = input.nextInt();
                while(var > sArr.length){
                    System.out.println("How many elements are in the second array? (Must be less than first)");
                    var = input.nextInt();
                }
                String[] sArr2 = new String[var];
                for(int i = 0; i < var; i++){
                    System.out.println("Element number " + (i+1) + ":");
                    sArr2[i] = input.next();
                }
                System.out.println("Returned: " + in.inside(sArr, sArr2));
                break;
        }
    }

    public static void pairs() throws InputMismatchException{
        int var;
        System.out.println("Making array...");
        System.out.println("How many elements are in your array?");
        var = input.nextInt();
        double[] dArr = new double[var];
        for(int i = 0; i < var; i++){
            System.out.println("Element number " + (i+1) + ":");
            dArr[i] = input.nextDouble();
        }
        System.out.println("How many times would you like to do this?");
        var = input.nextInt();
        for(int i = 0; i < var; i++){
            dArr = pair.pairs(dArr);
        }
        System.out.println("Array is now: " + Arrays.toString(dArr));
    }

    public static void mvLt() throws InputMismatchException{
        int var;
        info.getInfoMoveLeft();
        System.out.println("What type of array?");
        var = input.nextInt();
        System.out.println("Making array...");
        switch(var){
            case 1:
                System.out.println("How many elements are in your array?");
                var = input.nextInt();
                int[] iArr = new int[var];
                for(int i = 0; i < var; i++){
                    System.out.println("Element number " + (i+1) + ":");
                    iArr[i] = input.nextInt();
                }
                System.out.println("How many times would you like to move the array to the left?");
                var = input.nextInt();
                for(int i = 0; i < var; i++){
                    iArr = leftMove.moveLeft(iArr);
                }
                System.out.println("Array is now: " + Arrays.toString(iArr));
                break;
            case 2:
                System.out.println("How many elements are in your array?");
                var = input.nextInt();
                double[] dArr = new double[var];
                for(int i = 0; i < var; i++){
                    System.out.println("Element number " + (i+1) + ":");
                    dArr[i] = input.nextDouble();
                }
                System.out.println("How many times would you like to move the array to the left?");
                var = input.nextInt();
                for(int i = 0; i < var; i++){
                    dArr = leftMove.moveLeft(dArr);
                }
                System.out.println("Array is now: " + Arrays.toString(dArr));
                break;
            case 3:
                System.out.println("How many elements are in your array?");
                var = input.nextInt();
                String[] sArr = new String[var];
                for(int i = 0; i < var; i++){
                    System.out.println("Element number " + (i+1) + ":");
                    sArr[i] = input.next();
                }
                System.out.println("How many times would you like to move the array to the left?");
                var = input.nextInt();
                for(int i = 0; i < var; i++){
                    sArr = leftMove.moveLeft(sArr);
                }
                System.out.println("Array is now: " + Arrays.toString(sArr));
                break;   
        }
    }

    public static void mvRt() throws InputMismatchException{
        int var;
        info.getInfoMoveRight();
        System.out.println("What type of array?");
        var = input.nextInt();
        System.out.println("Making array...");
        switch(var){
            case 1:
                System.out.println("How many elements are in your array?");
                var = input.nextInt();
                int[] iArr = new int[var];
                for(int i = 0; i < var; i++){
                    System.out.println("Element number " + (i+1) + ":");
                    iArr[i] = input.nextInt();
                }
                System.out.println("How many times would you like to move the array to the right?");
                var = input.nextInt();
                for(int i = 0; i < var; i++){
                    iArr = rightMove.moveRight(iArr);
                }
                System.out.println("Array is now: " + Arrays.toString(iArr));
                break;
            case 2:
                System.out.println("How many elements are in your array?");
                var = input.nextInt();
                double[] dArr = new double[var];
                for(int i = 0; i < var; i++){
                    System.out.println("Element number " + (i+1) + ":");
                    dArr[i] = input.nextDouble();
                }
                System.out.println("How many times would you like to move the array to the right?");
                var = input.nextInt();
                for(int i = 0; i < var; i++){
                    dArr = rightMove.moveRight(dArr);
                }
                System.out.println("Array is now: " + Arrays.toString(dArr));
                break;
            case 3:
                System.out.println("How many elements are in your array?");
                var = input.nextInt();
                String[] sArr = new String[var];
                for(int i = 0; i < var; i++){
                    System.out.println("Element number " + (i+1) + ":");
                    sArr[i] = input.next();
                }
                System.out.println("How many times would you like to move the array to the right?");
                var = input.nextInt();
                for(int i = 0; i < var; i++){
                    sArr = rightMove.moveRight(sArr);
                }
                System.out.println("Array is now: " + Arrays.toString(sArr));
                break;   
        }
    }

    public static void menu(){
        System.out.print("Hello, and welcome to Misha's sorting app! ");
        System.out.println("Here you will be able to preform a lot of random stuff!");
        System.out.println("Please enjoy and have fun!");
        System.out.println("1.) Move Right | 2.) Move Left");
        System.out.println("3.) Pairs      | 4.) Inside");
        System.out.println("5.) Distance   | 6.) Palindrome");
        System.out.println("7.) Flip       | 8.) Sorted");
        System.out.println("9.) Leave      | 10.) Help");
    }
}
