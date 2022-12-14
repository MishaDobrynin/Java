

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class MarkTwainTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class MarkTwainTest
{
    /**
     * Default constructor for test class MarkTwainTest
     */
    public MarkTwainTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }
    @Test
    public void test(){
        Time depart = new Time(23, 55);
        Time arrive = new Time(8, 15);
        MarkTwain train1 = new MarkTwain("among us",depart,arrive,700);
        assertEquals(700, train1.getDistance());
        assertEquals(depart, train1.getDeparture());
        assertEquals(arrive, train1.getArrival());
        depart = new Time(23, 11);
        arrive = new Time(3, 11);
        train1.setDeparture(depart);
        train1.setArrival(arrive);
        train1.setDistance(1_000);
        assertEquals(depart, train1.getDeparture());
        assertEquals(arrive, train1.getArrival());
        assertEquals(250, train1.averageSpeed());
        assertEquals("04:00", train1.travelTime().toString());
    }
    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
}
