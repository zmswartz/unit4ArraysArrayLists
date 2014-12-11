import java.util.ArrayList;

public class ArrayListRunner
{
    public static void main(String[] args)
    {
        ArrayList<String> names = new ArrayList<String>();
        System.out.println(names);
        
        names.add("Alice");
        names.add("Bob");
        names.add("Connie");
        names.add("David");
        names.add("Edward");
        names.add("Fran");
        names.add("Gomez");
        names.add("Harry");
        System.out.println(names);
        
        System.out.println(names.get(0));
        System.out.println(names.get(7));
        
        System.out.println(names.size());
        
        System.out.println(names.get(names.size() - 1));
        
        names.set(0 , "Alice B. Toklas");
        
        names.add(4, "Doug");
        
        for(String name : names)
        {
            System.out.println(name);
        }
        
        ArrayList<String> names2 = new ArrayList<String>(names);
        System.out.println(names2);
        
        names.remove(0);
        
        System.out.println(names);
        System.out.println(names2);
    }
} 