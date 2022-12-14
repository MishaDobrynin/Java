
/**
 * Write a description of class Schedule here.
 *
 * @author Misha Dobrynin
 * @version 5/11/2022
 */
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.Collections;
public class Schedule
{
    private MarkTwain[] trains;
    private int distance;
    Schedule(String filename)throws FileNotFoundException{
        //Scanner file = new Scanner(new File(filename));
        //distance = file.nextInt();
        //System.out.println(distance);
        fillArray(filename);
    }
    public void sortDeparture(){
        MarkTwain temp;
        int length = trains.length;
        for(int i = 0; i < length-1; i++){
            for(int j = i+1; j>0; j--){
                if(trains[j].getDeparture().minBetween(trains[j-1].getDeparture()) < 0){
                    temp = trains[j];
                    trains[j] = trains[j-1];
                    trains[j-1] = temp;
                }
                else break;
            }
        }
    }
    public MarkTwain fastestTrain(){
        Time fastest = trains[0].travelTime();
        int length = trains.length;
        int fastestI = 0;
        for(int i = 1; i < length; i++){
            if(trains[i].travelTime().minBetween(fastest) < 0){
                fastest = trains[i].travelTime();
                fastestI = i;
            }
        }
        return trains[fastestI];
    }
    public void fillArray(String filename)throws FileNotFoundException{
        Scanner file = new Scanner(new File(filename));
        distance = file.nextInt(); //Distance - the distance in km
        int length = file.nextInt(); //Length - how many trains in the file
        trains = new MarkTwain[length];
        String name;
        for(int i = 0; i < length; i++){
            file.nextLine();
            name = file.nextLine();
            Time depart = new Time(file.nextInt(), file.nextInt());
            Time arrive = new Time(file.nextInt(), file.nextInt());
            trains[i] = new MarkTwain(name, depart, arrive, distance);
        }
    }
    public String toString(){
        String result = "";
        for(MarkTwain t: trains){
            result += t + "\n\n";
        }
        return result;
    }
}
