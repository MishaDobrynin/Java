
/**
 * Write a description of class Information1 here.
 *
 * @author Misha Dobrynin
 * @version 5/24/2022
 */
import java.util.Scanner;
import java.util.Arrays;
public class Information1
{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Hello! Please make a choice!");
        System.out.println("1. Integer");
        System.out.println("2. String integer");
        System.out.println("3. Text");
        System.out.println("What do you choose? ");
        int choice = input.nextInt();
        while(choice != 0){
            switch(choice){
                case 1:
                    System.out.println("Number: ");
                    information(input.nextInt());
                    break;
                case 2:
                    System.out.println("Number: ");
                    information(input.nextInt());
                    break;
                case 3:
                    input.nextLine();
                    System.out.println("Text: ");
                    informationText(input.nextLine());
                    break;
                default:
                    System.out.println("Hello! Please make a choice!");
                    System.out.println("1. Integer");
                    System.out.println("2. String integer");
                    System.out.println("3. Text");
                    System.out.println("What do you choose? ");
                    choice = input.nextInt();
                    break;
            }
            System.out.println("Hello! Please make a choice!");
            System.out.println("1. Integer");
            System.out.println("2. String integer");
            System.out.println("3. Text");
            System.out.println("What do you choose? ");
            choice = input.nextInt();
        }
        System.out.println("Goodbye!");
    }

    public static void information(int x){
        int[] arr = new int[10];
        int h;
        while(x > 0){
            h = x%10;
            arr[h] += 1;
            x /= 10;
        }
        for(int i = 0; i < 10; i++){
            h = arr[i];
            if(h!=0){
                System.out.println(i + " : " + h);
            }
        }
    }

    public static void information(String x){
        int[] arr = new int[10];
        int length = x.length();
        for(int i = 0; i < length; i++){
            arr[x.charAt(i)-48] += 1;
        }
        for(int i = 0; i < 10; i++){
            if(arr[i] != 0){
                System.out.println(i + " : " + arr[i]);
            }
        }
    }
    public static void informationText(String x){
        x = x.toLowerCase();
        int[] arr = new int[26];
        int length = x.length();
        for(int i = 0; i < length; i++){
            arr[x.charAt(i)-97] += 1;
        }
        for(int i = 0; i < 26; i++){
            if(arr[i] != 0){
                System.out.printf("%c = %d\n", (char)(i+97), arr[i]);
            }
        }
    }
}
