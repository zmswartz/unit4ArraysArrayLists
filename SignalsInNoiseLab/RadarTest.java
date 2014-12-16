

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class RadarTest.
 *
 * @author  @zmswartz
 * @version 15 December 2014
 */
public class RadarTest
{
    /**
     * Default constructor for test class RadarTest
     */
    public RadarTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    @Test
    public void testLowVelocity()
    {
        Radar radar = new Radar(100,100);
        int dx = 1;
        int dy = 2;
        while ( Math.abs(radar.monsterLocationRow) < 100 && Math.abs(radar.monsterLocationCol) < 100)
        {
            
            
            radar.scan();
            
            
            radar.setMonsterLocation(radar.monsterLocationRow + dy, radar.monsterLocationCol + dx);
        }
        assertEquals("dx: " + 1 + "   dy:" + 2, radar.findMax());
    }
    
    @Test
    public void testMidVelocity()
    {
        Radar radar = new Radar(100,100);
        int dx = 3;
        int dy = 2;
        while ( Math.abs(radar.monsterLocationRow) < 100 && Math.abs(radar.monsterLocationCol) < 100)
        {
            
            
            radar.scan();
            
            
            radar.setMonsterLocation(radar.monsterLocationRow + dy, radar.monsterLocationCol + dx);
        }
        assertEquals("dx: " + 3 + "   dy:" + 2, radar.findMax());
    }
    @Test
    public void testHighVelocity()
    {
        Radar radar = new Radar(100,100);
        int dx = 5;
        int dy = 5;
        while ( Math.abs(radar.monsterLocationRow) < 100 && Math.abs(radar.monsterLocationCol) < 100)
        {
            
            
            radar.scan();
            
            
            radar.setMonsterLocation(radar.monsterLocationRow + dy, radar.monsterLocationCol + dx);
        }
        assertEquals("dx: " + 5 + "   dy:" + 5, radar.findMax());
    }
}
