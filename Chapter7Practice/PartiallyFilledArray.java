

/**
 * Write a description of class PartiallyFilledArray here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PartiallyFilledArray
{
    private int[] values;
    private int currentSize;
    public PartiallyFilledArray()
    {
        values = new int[10];
        currentSize = 0;
    }
    
    public String toString()
    {
        String s = "[ ";
        for (int i = 0; i < currentSize; i++)
        {
            if (i > 0)
            {
                s += ", ";
            }
            s += values[i] ;
            
        }
        s += "]";
        return s;
    }
    
    public void fillNElements(int num, int maxValue)
    {
        
        for (int i = 0; i < num; i++)
        {
            values[i] = (int)(Math.random() * maxValue);
            currentSize++;
        }
    }
    
    public void removeElementAtIndex(int index)
    {
        
        values[index] = values[currentSize - 1];
        currentSize--;
    }
    
    public void swapElements(int index1, int index2)
    {
        int val1 = values[index1];
        values[index1] = values[index2];
        values[index2] = val1;
    }
    
    public void insertElements(int val)
    {
        if (currentSize == values.length)
        {
            growArray();
        }
        values[currentSize] = val;
        currentSize++;
    }
    private void growArray()
    {
        int size = values.length * 2;
        int[] newArray = new int[size];
        for (int i = 0; i < values.length; i++)
        {
            newArray[i] = values[i];
        }
        values = newArray;
    }
}
