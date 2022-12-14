
/**
 * Train program for CSC142
 *
 * @author Misha Dobrynin
 * @version 3/23/2022
 */
public class MarkTwain
{
    Time departure;
    Time arrival;
    int distance;
    String name;
    /**
     * Full constructor for class MarkTwain
     */
    public MarkTwain(String name, Time departure, Time arrival, int distance){
        setDeparture(departure);
        setArrival(arrival);
        setDistance(distance);
        this.name = name;
    }
    /**
     * Sets departure
     * @param Time New departure
     */
    public void setDeparture(Time y){
        this.departure = y;
    }
    /**
     * Sets arrival
     * @param Time New arrival
     */
    public void setArrival(Time y){
        this.arrival = y;
    }
    /**
     * Sets distance
     * @param int New distance
     */
    public void setDistance(int y){
        if(y <= 0) throw new IllegalArgumentException("Distance has to be greater than 0");
        this.distance = y;
    }
    /**
     * Gets departure
     * @return Time The departure time
     */
    public Time getDeparture(){
        return this.departure;
    }
    /**
     * Gets arrival
     * @return Time The arrival time
     */
    public Time getArrival(){
        return this.arrival;
    }
    /**
     * Gets distance
     * @return int The distance
     */
    public int getDistance(){
        return this.distance;
    }
    /**
     * Travel time
     * @return Time The travel time
     */
    public Time travelTime(){
        return departure.timeBetween(arrival);
    }
    /**
     * Average speed
     * @return int The avg. speed
     */
    public int averageSpeed(){
        Time between = this.travelTime();
        int minutes = between.getHour()*60 + between.getMinute();
        return (int) (this.distance*60.0/minutes);
    }
    public String toString(){
        String r = "Name: " + this.name;
        r += "\nDeparture: " + this.departure.toString();
        r += "\nArrival: " + this.arrival.toString();
        r += "\nTravel time: " + this.travelTime();
        r += "\nAverage speed (kph): " + this.averageSpeed();
        return r;
    }
}
