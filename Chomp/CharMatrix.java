// Implements a 2-D array of characters

public class CharMatrix
{
  // Fields:
  
  char[][] table;
  // Constructor: creates a grid with dimensions rows, cols,
  // and fills it with spaces
  public CharMatrix(int row, int col)
  {
      table = new char[row][col];
      for(int rows = 0; rows < table.length; rows++)
      {
          for(int cols = 0; cols < table[rows].length; cols++)
          {
              table[rows][cols] = ' ';
            }
        }
  }

  // Constructor: creates a grid with dimensions rows , cols ,
  // and fills it with the fill  character
  public CharMatrix(int row, int col, char fill)
  {
      table = new char[row][col];
      for(int rows = 0; rows < table.length; rows++)
      {
          for(int cols = 0; cols < table[rows].length; cols++)
          {
              table[rows][cols] = fill;
            }
        }
  }

  // Returns the number of rows in grid
  public int numRows()
  {
      return table.length;
  }

  // Returns the number of columns in grid
  public int numCols()
  {
      return table[0].length;
  }

  // Returns the character at row, col location
  public char charAt(int row, int col)
  {
      return table[row][col];
  }

  // Sets the character at row, col location to ch
  public void setCharAt(int row, int col, char ch)
  {
      table[row][col] = ch;
  }

  // Returns true if the character at row, col is a space,
  // false otherwise
  public boolean isEmpty(int row, int col)
  {
      if(table[row][col] == ' ')
      {
          return true;
      }
      return false;  
  }

  // Fills the given rectangle with fill  characters.
  // row0, col0 is the upper left corner and row1, col1 is the
  // lower right corner of the rectangle.
  public void fillRect(int row0, int col0, int row1, int col1, char fill)
  {
      for ( int row = row0; row <= row1; row++)
      {
          for (int col = col0; col <= col1; col++)
          {
              table[row][col]= fill;
          }
      }
  }

  // Fills the given rectangle with SPACE characters.
  // row0, col0 is the upper left corner and row1, col1 is the
  // lower right corner of the rectangle.
  public void clearRect(int row0, int col0, int row1, int col1)
  {
      for ( int row = row0; row <= row1; row++)
      {
          for (int col = col0; col <= col1; col++)
          {
              table[row][col]= ' ';
          }
      }
  }

  // Returns the count of all non-space characters in row 
  public int countInRow(int row)
  {
      int count = 0;
      for (int col = 0; col<table[row].length; col++)
    {
        if (table[row][col] != ' ')
        {
            count += 1;
        }
    }
      return count;
  }

  // Returns the count of all non-space characters in col 
  public int countInCol(int col)
  {
    int count = 0;
    for (int row = 0; row<table.length; row++)
    {
        if (table[row][col] != ' ')
        {
            count += 1;
        }
    }
    return count;
  }
}
