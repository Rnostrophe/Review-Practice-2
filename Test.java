import java.util.ArrayList;
import java.util.HashMap;
/**
 * Write a description of class Test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Test
{
    // instance variables - replace the example below with your own
    private int age; 
    private ArrayList<String> words; // 2.
    public final double decimalHolder;
    private int price;
    private String command;
    private HashMap<String,Integer> groupSizes;

    /**
     * Constructor for objects of class Test
     */
    public Test()
    {
        age = 20; // 1.
        decimalHolder = 0.1; // 3.
        price = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void checkPrice(int price) // 4. working
    {
        if(price>100)
        {
            this.price = price;
            System.out.println("Expensive");
        }
        else
        {
            System.out.println("cheap");
        }
    }
    public void commandCenter(String command) // 5. working
    {
        if (command == "help")
        {
            this.command = command;
            help();
        }
        else if (command == "quit")
        {
            this.command = command;
            quit();
        }
    }
    public void help()
    {
        System.out.println("Help initiated");
    }
    public void quit()
    {
        System.out.println("Quit initiated");
    }
    public void OneToTen() // 6. working
    {
        int number = 0;
        while (number<10)
        {   
            System.out.println(number+1);
            number = number+1;
        }
    }
    public void sumOneToTen() // 7.
    {
        //?
    }
    public void evenOneToTen() // 8. working
    {
        int number = 0;
        
        while(number<10 && number%2==0)
        {
            System.out.println(number+2);
            number = number+2;
        }
    }
    public void numbersAToB(int a, int b) // 9.
    {
        while(a>b)
        {
            System.out.println(a);
            a = a+1;
        }
    }
    public void returnCollection() // 10.
    {
        // ?
    }
    public void checkArrayList() // 11.
    {
        // ?
    }
    public void removeArrayList() // 12.
    {
        // ?
    }
    /* public int HashMapGetter() // 13.
    {
        // ?
    } */
    // 14.
    // 15.
    // 16.
}