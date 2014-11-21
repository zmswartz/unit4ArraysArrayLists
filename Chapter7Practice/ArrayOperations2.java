

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
    
    public void evensMoveToFront()
    {
        int[] evens = new int[values.length];
        int[] odds = new int[values.length];
        int countE = 0;
        int countO = 0;
        for (int i : values)
        {
            if(i % 2 == 0)
            {
                evens[countE] = i;
                countE += 1;
            }
            else
            {
                odds[countO] = i;
                countO += 1;
            }
        }
        
        int[] newArray = new int[values.length];
        for (int i = 0; i < countE; i++)
        {
            newArray[i] = evens[i];
        }
        for (int i = countE; i < countE + countO; i++)
        {
            newArray[i] = odds[i-countE];
        }
        values = newArray;
    }
    
    public int secondLargest()
    {
        int max = Math.max(values[0], values[1]);
        int second = Math.min(values[0], values[1]);
        for (int i = 2; i < values.length; i++)
        {
            if (values[i] > max)
            {
                second = max;
                max = values[i];
            }
            else if (values[i] > second)
            {
                second = values[i];
            }
        }
        return second;
    }
    
    public boolean isInceasingOrder()
    {
        int last = values[0];
        
        for (int i = 1; i < values.length; i++)
        {
            if( values[i] > last)
            {
                last = values[i];
            }
            else
            {
                return false;
            }
        }
        return true;
    }
    
    public boolean isAdjacentDuplicates()
    {
        
        for (int i = 0; i < values.length-1; i++)
        {
            int right = values[i+1];
            if (right == values[i])
            {
                return true;
            }
        }
        return false;
    }
    
    public boolean isDuplicates()
    {
        for (int i: values)
        {
            int count = 0;
            for (int j : values)
            {
                if (i == j)
                {
                    count += 1;
                }
            }
            if (count != 1)
            {
                return true;
            }
        }
        return false;
    }
}
