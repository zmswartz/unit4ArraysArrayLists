import java.util.*;

/**
 * Write a description of class TopCustomers here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TopCustomers
{
    private ArrayList<String> names = new ArrayList<String>();
    private ArrayList<Double> sale = new ArrayList<Double>();

    public void addSale(String customerName, double amount)
    {
        names.add(customerName);
        sale.add(amount);
    }
    public String nameOfBestCustomer()
    {
        int max = 0;
        
        for (int i = 0; i <
    }
}
