

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class TimeTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TimeTest
{
    /**
     * Default constructor for test class TimeTest
     */
    public TimeTest()
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

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void test()
    {
        Time depart = new Time(23, 55);
        Time arrive = new Time(8, 15);
        assertEquals(23, depart.getHour());
        assertEquals(55, depart.getMinute());
        assertEquals(8, arrive.getHour());
        assertEquals(15, arrive.getMinute());
        depart.setHour(20);
        assertEquals(20, depart.getHour());
        arrive.setHour(4);
        assertEquals(4, arrive.getHour());
        depart.setMinute(0);
        assertEquals(0, depart.getMinute());
        arrive.setMinute(40);
        assertEquals(40, arrive.getMinute());
        assertEquals("04:40", arrive.toString());
        assertEquals("20:00", depart.toString());
        Time between = new Time(8, 40);
        assertEquals(between.toString(), depart.timeBetween(arrive).toString());
    }
}

