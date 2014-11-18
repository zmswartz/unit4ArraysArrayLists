

/**
 * Write a description of class ArrayAlgorithms here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayAlgorithms
{
    private int[] values;
    /**
     * Default constructor for objects of class ArrayAlgorithms
     */
    public ArrayAlgorithms()
    {
        values = new int[10];
    }
    public String toString()
    {
        String s = "[";
        for (int val: values)
        {
            s += val + ", ";
        }
        s = s.substring(0,s.length() -2);
        s += "]";
        return s;
    }
    public void fillWithSquares()
    {
        for (int i = 0; i < values.length;i++)
        {
            values[i] = i* i;
        }
    }
    public double getAverage()
    {
        double sum = 0;
        for (int val: values)
        {
            sum += val; 
        }
        double average = sum / values.length;
        
        return average;
    }
    
    public int getIndexOfMaximum()
    {
        int index = 0;
        int max = values[0];
        for (int i = 1; i < values.length; i++)
        {
            if (values[i] > max)
            {
                max = values[i];
                index = i;
            }
        }
        return index;
    }
}
