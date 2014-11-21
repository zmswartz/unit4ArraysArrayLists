import java.util.Scanner;

/**
 * Write a description of class SieveOfEratothenes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SieveOfEratothenes
{

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Find all primes under: ");
        int num = scan.nextInt() + 1;
        boolean[] primes = new boolean[num];
        
        for (int i = 2; i < num; i++)
        {
            primes[i] = true;
        }
        int divisor = 0;
        primes[0] = false;
        primes[1] = false;
        for (int i = 2; i < num; i++)
        {
            if(primes[i] == true)
            {
                divisor = i;
                for (int a = divisor+ 1; a < num; a++)
                {
                    if ( a % divisor == 0)
                    {
                        primes[a] = false;
                    }
                }
            }
        }
        
        
        String s = "[";
        for (int i = 0 ; i < num; i++)
        {
            if (primes[i] != false)
            {
                if( i != 2)
                {
                    s += ", ";
                }
                s+= i;
            }
            
        }
        s += "]";
        System.out.println(s);
    }

}
