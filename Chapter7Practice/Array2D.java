

/**
 * Write a description of class Array2D here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Array2D
{
    /** description of instance variable x (add comment for each instance variable) */
    private int[][] table = 
        {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
            {10, 11, 12}
        };

    /**
     * Default constructor for objects of class Array2D
     */
    public Array2D()
    {
        
    }
    
    public static void main(String[] args)
    {
        Array2D table = new Array2D();
        System.out.println(table.toString());
        System.out.println(table.getRow(1));
        System.out.println("\n");
        System.out.println(table.getCol(1));
    }
    
    public String toString()
    {
        String str = "";
        for (int row = 0; row < table.length; row++)
        {
            for (int col = 0; col < table[row].length; col++)
            {
                str += table[row][col] + "\t"; 
            }
            str += "\n";
        }
        return str;
    }
    
    public String getRow(int row)
    {
        String str = "";
        for (int col = 0; col < table[row].length; col++)
        {
            str += table[row][col] + "\t"; 
        }
        return str;
    }
    
    public String getCol(int col)
    {
        String str = "";
        for (int row = 0; row < table.length; row++)
        {
            str+= table[row][col] + "\n";
        }
        return str;
    }
}
