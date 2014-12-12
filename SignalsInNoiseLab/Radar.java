
/**
 * The model for radar scan and accumulator
 * 
 * @author @gcschmit
 * @version 19 July 2014
 */
public class Radar
{
    
    // stores whether each cell triggered detection for the current scan of the radar
    private boolean[][] currentScan;
    private boolean[][] lastScan;
    
    // value of each cell is incremented for each scan in which that cell triggers detection 
    private int[][] accumulator;
    private boolean[][] possibleStartingLocations;
    private boolean[][] nextScanLocations;
    private int[][] differences;
    
    // location of the monster
    private int initialMonsterLocationRow;
    private int initialMonsterLocationCol;
    private int monsterLocationRow;
    private int monsterLocationCol;
    
    // movement of the monster
    private int xvelocity;
    private int yvelocity;

    // probability that a cell will trigger a false detection (must be >= 0 and < 1)
    private double noiseFraction;
    
    // number of scans of the radar since construction
    private int numScans;

    /**
     * Constructor for objects of class Radar
     * 
     * @param   rows    the number of rows in the radar grid
     * @param   cols    the number of columns in the radar grid
     */
    public Radar(int rows, int cols)
    {
        // initialize instance variables
        currentScan = new boolean[rows][cols]; // elements will be set to false
        lastScan = new boolean[rows][cols];
        accumulator = new int[rows][cols]; // elements will be set to 0
        possibleStartingLocations = new boolean[rows][cols];
        for(int row = 0; row < accumulator.length; row++)
        {
            for(int col = 0; col < accumulator[0].length; col++)
            {
               accumulator[row][col] = 0;
            }
        }
        // randomly set the location of the monster (can be explicity set through the
        //  setMonsterLocation method
        //monsterLocationRow = (int)(Math.random() * rows);
        //monsterLocationCol = (int)(Math.random() * cols);
        monsterLocationRow = 0;
        monsterLocationRow = 0;
        initialMonsterLocationRow = 0;
        initialMonsterLocationCol = 0;
        xvelocity = 2;
        yvelocity = 1;
        noiseFraction = 0.05;
        numScans= 0;
    }
    
    /**
     * Performs a scan of the radar. Noise is injected into the grid and the accumulator is updated.
     * 
     */
    public void scan()
    {
        // 
        
        // zero the current scan grid
        for(int row = 0; row < currentScan.length; row++)
        {
            for(int col = 0; col < currentScan[0].length; col++)
            {
                currentScan[row][col] = false;
            }
        }
        
        // detect the monster
        currentScan[monsterLocationRow][monsterLocationCol] = true;
        
        // inject noise into the grid
        //injectNoise();
        
        // udpate the accumulator
        if (numScans !=0)
        {
            for(int row = 0; row < currentScan.length; row++)
            {
                for(int col = 0; col < currentScan[0].length; col++)
                {
                    if (currentScan[row][col] == true)
                    {
                        for (int row2 = 0; row2 < lastScan.length; row2++)
                        {
                            
                            for (int col2 = 0; col2 < lastScan[0].length; col2++)
                            {
                                if (lastScan[row2][col2] == true)
                                {
                                    int diffx = col2 - col;
                                    int diffy = row2 - row;
                                    
                                    if( diffx > -6 && diffy> -6 && diffx< 6 && diffy<6)
                                    {
                                        System.out.println(2);
                                        accumulator[diffx+5][diffy+5] = accumulator[diffx+5][diffy+5]+1;
                                    }
                                }
                            }
                        }
                    }
                    
                }
            }
        }
        duplicate();
        // keep track of the total number of scans
        monsterLocationRow = monsterLocationRow + yvelocity;
        monsterLocationCol = monsterLocationCol + xvelocity;
        numScans++;
    }
    
    private void duplicate()
    {
        for(int row = 0; row < currentScan.length; row++)
        {
            for(int col = 0; col < currentScan[0].length; col++)
            {
                if (currentScan[row][col] == true)
                {
                    lastScan[row][col] = true;
                }
                else
                {
                    lastScan[row][col] = false;
                }
            }
        }
    }
    
    public String findMax()
    {
        int max = 0;
        String position
        for (int row = 0; row< accumulator.length; row++)
        {
            for (int col = 0; col< accumulator.length; col++)
            {
                if(accumulator[row][col] > max)
                {
                }
            }
        }
    }
    
    /**
     * Sets the location of the monster
     * 
     * @param   row     the row in which the monster is located
     * @param   col     the column in which the monster is located
     * @pre row and col must be within the bounds of the radar grid
     */
    public void setMonsterLocation(int row, int col)
    {
        // remember the row and col of the monster's location
        monsterLocationRow = row;
        monsterLocationCol = col;
        
        // update the radar grid to show that something was detected at the specified location
        currentScan[row][col] = true;
    }
    
     /**
     * Sets the probability that a given cell will generate a false detection
     * 
     * @param   fraction    the probability that a given cell will generate a flase detection expressed
     *                      as a fraction (must be >= 0 and < 1)
     */
    public void setNoiseFraction(double fraction)
    {
        noiseFraction = fraction;
    }
    
    /**
     * Returns true if the specified location in the radar grid triggered a detection.
     * 
     * @param   row     the row of the location to query for detection
     * @param   col     the column of the location to query for detection
     * @return true if the specified location in the radar grid triggered a detection
     */
    public boolean isDetected(int row, int col)
    {
        return currentScan[row][col];
    }
    
    /**
     * Returns the number of times that the specified location in the radar grid has triggered a
     *  detection since the constructor of the radar object.
     * 
     * @param   row     the row of the location to query for accumulated detections
     * @param   col     the column of the location to query for accumulated detections
     * @return the number of times that the specified location in the radar grid has
     *          triggered a detection since the constructor of the radar object
     */
    public int getAccumulatedDetection(int row, int col)
    {
        return 1;//accumulator[row][col];
        
    }
    
    /**
     * Returns the number of rows in the radar grid
     * 
     * @return the number of rows in the radar grid
     */
    public int getNumRows()
    {
        return currentScan.length;
    }
    
    /**
     * Returns the number of columns in the radar grid
     * 
     * @return the number of columns in the radar grid
     */
    public int getNumCols()
    {
        return currentScan[0].length;
    }
    
    /**
     * Returns the number of scans that have been performed since the radar object was constructed
     * 
     * @return the number of scans that have been performed since the radar object was constructed
     */
    public int getNumScans()
    {
        return numScans;
    }
    
    /**
     * Sets cells as falsely triggering detection based on the specified probability
     * 
     */
    private void injectNoise()
    {
        for(int row = 0; row < currentScan.length; row++)
        {
            for(int col = 0; col < currentScan[0].length; col++)
            {
                // each cell has the specified probablily of being a false positive
                if(Math.random() < noiseFraction)
                {
                    currentScan[row][col] = true;
                }
            }
        }
    }
    
}
