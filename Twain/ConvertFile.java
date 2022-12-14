
/**
 * Write a description of class ConvertFile here.
 *
 * @author Misha Dobrynin
 * @version 4/13/2022
 */
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
public class ConvertFile
{
    public static void main(String[] args) throws FileNotFoundException{
        File regular = new File("trains.txt");
        PrintStream output = new PrintStream(new File("timetable.txt"));
        Scanner read = new Scanner(regular);
        read.nextLine();
        read.nextLine();
        while(read.hasNextLine()){
            String info = "Name: " + read.nextLine();
            Time depart = convert(read.nextLine());
            Time arrive = convert(read.nextLine());
            info += "\nDeparture: " + depart.toString();
            info += "\nArrival: " + arrive.toString(); 
            info += "\nTravel time: " + depart.timeBetween(arrive);
            output.println(info);
        }
    }
    public static Time convert(String s){
        int num = 0;
        Scanner in = new Scanner(s);
        int c = 0;
        int[] times;
        times = new int[2];
        while(!in.hasNextInt()){
            if(in.hasNextInt()){
                num = in.nextInt();
                times[c] = num;
                c++;
            }
            else{
                in.next();
            }
        }
        return new Time(times[0], times[1]); //Could have been simpler - not using lists, and, at most, not using this
    }
}
