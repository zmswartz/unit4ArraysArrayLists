
public class ArrayTracing
{
    public static void main(String[] args)
    {
        int[] a = { 1, 2, 3, 4, 5, 4, 3, 2, 1, 0 };
        
        int total = 0;
        
        for(int i = 0; i < 10;i++)
        {
            total = total + a[i];
        }
        System.out.println(total);
        total = 0;
        
        for(int i = 0; i < 10;i = i + 2)
        {
            total = total + a[i];
        }
        System.out.println(total);
        total = 0;
        
        for(int i = 1; i < 10;i = i + 2)
        {
            total = total + a[i];
        }
        System.out.println(total);
        total = 0;
        
//         for(int i = 2; i <= 10;i++)
//         {
//             total = total + a[i];
//         }
//         System.out.println(total);
//         total = 0;
//out of bounds error!!!
        
        for(int i = 1; i < 10; i = i * 2)
        {
            total = total + a[i];
        }
        System.out.println(total);
        total = 0;
        
        for(int i = 9; i >= 0;i--)
        {
            total = total + a[i];
        }
        System.out.println(total);
        total = 0;
        
        for(int i = 9; i >= 0; i = i - 2)
        {
            total = total + a[i];
        }
        System.out.println(total);
        total = 0;
        
        for(int i = 0; i < 10;i++)
        {
            total = a[i] - total;
        }
        System.out.println(total);
    }
}
