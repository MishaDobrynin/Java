
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Main
{
    public static void main(String[] args)throws FileNotFoundException{
        MyArrayList<City> myArray = new MyArrayList();
        Scanner read = new Scanner(new File("citiesShort.txt"));
        int pop;
        String name,country,text;
        String[] arr;
        while(read.hasNextLine()){
            text = read.nextLine();
            arr = text.split(",");
            pop = Integer.parseInt(arr[0]);
            name = arr[1].trim();
            country = arr[2].trim();
            myArray.add(new City(name, pop, country));
        }
        System.out.println(myArray.get(4));
        myArray.remove(4);
        System.out.println(myArray.get(4));
        System.out.println(myArray.get(5));
        City test1 = new City("Bobomatic", 5999, "Robot");
        City test2 = new City("Zzzzzland", 9999, "aaaaa");
        myArray.add(test1);
        System.out.println("Item at index 0: " + myArray.get(0));
        System.out.println("Index of test1: " + myArray.indexOf(test1));
        myArray.add(test2);
        System.out.println("Index of test2: " + myArray.indexOf(test2));
        System.out.println("Size of array: " + myArray.size());
        myArray.remove(test1);
        System.out.println(myArray.size());
    }
}