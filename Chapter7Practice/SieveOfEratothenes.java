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
        int num = scan.nextInt();
        boolean[] primes = new boolean[num/2-1];
        
        for (int i = 0; i < num/2-1; i++)
        {
            primes[i] = true;
        }
        int divisor = 0;
        
        for (int i = 0; i < num/2-1; i++)
        {
            if(primes[i] == true)
            {
                divisor = i*2 + 3;
                for (int a = i + 1; a < num/2-1; a = a+1)
                {
                    if ( (a*2 +3) % divisor == 0)
                    {
                        primes[a] = false;
                    }
                }
            }
        }
        
        
        String s = "[2, ";
        for (int i = 0 ; i < num/2-1; i++)
        {
            if (primes[i] != false)
            {
                if( i != 0)
                {
                    s += ", ";
                }
                s+= i*2 +3;
            }
            
        }
        s += "]";
        System.out.println(s);
    }

}
