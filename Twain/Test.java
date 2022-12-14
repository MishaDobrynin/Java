
/**
 * Write a description of class Test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Test
{
    public static void main(String[] args){
        Time arrival = new Time(8, 15);
        Time departure = new Time(23, 55);
        MarkTwain train1 = new MarkTwain("Night Express", departure, arrival, 650);
        System.out.println(train1);
    }
}
