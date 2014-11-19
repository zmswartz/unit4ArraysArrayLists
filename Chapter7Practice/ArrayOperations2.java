

/**
 * Write a description of class ArrayOperations2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayOperations2
{
    /** description of instance variable x (add comment for each instance variable) */
    private int[] values;

    /**
     * Default constructor for objects of class ArrayOperations2
     */
    public ArrayOperations2(int[] initialValues)
    {
        values = initialValues;
    }
    
    public String toString()
    {
        String s = "[";
        for (int i = 0 ; i < values.length; i++)
        {
            if (i !=0)
            {
                s += " ,";
            }
            s+= values[i];
        }
        s += "]";
        return s;
    }
    
    public void swapFirstAndLast()
    {
        int temp = values[0];
        values[0] = values[values.length-1];
        values[values.length-1] = temp;
    }
    
    public void shiftRight()
    {
        int temp = values[0];
        values[0] = values[values.length-1];
        for (int i = 1; i<values.length; i++)
        {
            int temp2 = values[i];
            values[i] = temp;
            temp = temp2;
        }
    }
    
    public void evenToZero()
    {
        for (int i = 0; i < values.length; i++)
        {
            if (values[i] % 2 == 0)
            {
                values[i] = 0;
            }
        }
    }
    
    public void replaceByLargerNeighbor()
    {
        for (int i = 1; i < values.length-1; i++)
        {
            int left = values[i-1];
            int right = values[i+1];
            values[i] = Math.max(left,right);
        }
    }
    
    public void removeMiddle()
    {
        int length = values.length;
        int[] temp;
        int count= 0;
        if (length % 2 == 1)
        {
            int index = length/2;
            temp = new int[length-1];
            for (int i = 0; i < length; i++)
            {
                if (i != index)
                {
                    temp[count] = values[i];
                    count++;
                }
            }
        }
        else
        {
            int index2 = length/2;
            int index1 = index2-1;
            temp = new int[length-2];
            for (int i = 0; i < length; i++)
            {
                if (i != index1 && i != index2)
                {
                    temp[count] = values[i];
                    count++;
                }
            }
        }
        values = temp;
    }
    
    public void moveToFront()
    {
        
    }
    
    public int secondLargest()
    {
        int max = Math.max(values[0], values[1]);
        int second = Math.min(values[0], values[1]);
        for (int i = 2; i < values.length; i++)
        {
            
        }
        return 7;
    }
}
