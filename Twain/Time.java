
/**
 * Class time is used for the Train class that you will see in this project
 *
 * @author Misha Dobrynin
 * @version 3/23/2022
 */
public class Time
{
    private int hour;
    private int minute;
    /**
     * Constructor
     * Sets hour and minute
     */
    public Time(int hour, int minute){
        setMinute(minute);
        setHour(hour);
    }
    /**
     * Sets the hour
     * @param int New hour
     */
    public void setHour(int y){
        if(this.hour >= 24 && this.minute != 0){
            throw new IllegalArgumentException("Can't be more than 24:00");
        }
        else if(this.hour < 0){
            throw new IllegalArgumentException("Hour can't be negative");
        }
        this.hour = y;
    }
    /**
     * Minutes between
     * @param Time Comparison time
     * @return int Minutes between
     */
    public int minBetween(Time t1){
        return this.hour*60+this.minute - t1.hour*60-t1.minute;
    }
    /**
     * Sets the minute
     * @param int New minute
     */
    public void setMinute(int y){
        if(y > 59 || y < 0){
            throw new IllegalArgumentException("Minute must be between 0 and 59 inclusive");
        }
        this.minute= y;
    }
    /**
     * Returns the hour
     * @return int Hour
     */
    public int getHour(){
        return this.hour;
    }
    /**
     * Returns the minute
     * @return int Minute
     */
    public int getMinute(){
        return this.minute;
    }
    /**
     * Returns the time between
     * ~~~~~~~~NOTE~~~~~~~~~
     * |                   |
     * |IT IS COMPARED FROM|
     * |                   |
     * |THE DEPARTURE TIME |
     * |                   |
     * |NOT ARRIVAL TIME   |
     * |                   |
     * ~~~~~~~~~~~~~~~~~~~~~
     * @param Time The Time object that is being compared to
     * @return Time The Time between
     */
    public Time timeBetween(Time other){
        int h = other.getHour() - this.getHour();
        if(h < 0){
            h = 24-this.getHour();
            h += other.getHour();
        }
        int m = other.getMinute() - this.getMinute();
        if(m < 0){
            m = 60-this.getMinute();
            m += other.getMinute();
            h -= 1;
        }
        return new Time(h, m);
    }
    /**
     * Returns proper format time
     * @param int The number to convert
     * @return String The converted number
     */
    public String zeroTime(int y){
        String s = "";
        if(y < 10) s += "0";
        return s+y;
    }
    public String toString(){
        String s = zeroTime(this.getHour()) + ":";
        return s + zeroTime(this.getMinute());
    }
    public static void test(){
        //Tests all constructors and methods
        //Print statements only for errors
        Time test1 = new Time(23, 55);
        if(test1.getHour() != 23) System.out.println("Hour should be equal to 23, not " + test1.getHour());
        if(test1.getMinute() != 55) System.out.println("Minute should be equal 55, not " + test1.getMinute());
        Time test2 = new Time(8, 15);
        Time ans = new Time(8, 20);
        System.out.println(ans);
        System.out.println(test1.timeBetween(test2));
        if(!test1.timeBetween(test2).equals(ans)) System.out.println("Time between should be equal to 08:20, not " + test1.timeBetween(test2));
        
    }
}
