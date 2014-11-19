
public class CommonArrayOperations
{

    
    public static void main(String[] args)
    {
        int[] x = {8, 4, 5, 21, 7, 9, 18, 2, 100};
        System.out.println("Length: "  + x.length);
        System.out.println("x[0]: " + x[0]);
        System.out.println("x[8]: " + x[8]);
        System.out.println("x[x.length-1]: " + x[x.length-1]);
        
        for (int i = 0; i < x.length; i++)
        {
            System.out.println(x[i]);
        }
        
        System.out.print("[");
        for (int i = 0; i < x.length; i++)
        {
            if (i != 0)
            {
                System.out.print(", ");
            }
            System.out.print(x[i]);
        }
        System.out.println("]");
        
        System.out.print("[");
        for (int i = 8; i >= 0; i--)
        {
            if (i != 8)
            {
                System.out.print(", ");
            }
            System.out.print(x[i]);
        }
        System.out.println("]");
        
        for (int i:  x)
        {
            System.out.println(i);
        }
    }

}
