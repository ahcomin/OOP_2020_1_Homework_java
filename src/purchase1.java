/**
 * <h1> purchase1 </h1>
 * <p>
 * It is a program that determines what, how much, and how much it sells
 * and calculates the price according to the number of items.
 *
 * @Author Minyoung Kim
 * @version 1.0
 * @e-mail ahco8766@gmail.com
 * @contact 010-4443-9023
 * <p>
 * @Compile : javac purchase1.java
 * @Run : java purchase2
 * Programming Assignment 4.
 * @since 04-30-2020
 */


import java.util.Scanner; //import scanner

public class purchase1 {
    private String name;
    private int groupCount;   //Part of price, like the 2 in 2 for $1.99.
    private double groupPrice;//Part of price, like the $1.99
    //  in 2 for $1.99.
    private int numberBought; //Number of items bought.

    public void setName(String newName)
    {
        name = newName;
    }

    /**
     Sets price to count pieces for $costForCount.
     For example, 2 for $1.99.
     */
    public void setPrice(int count, double costForCount)
    {
        if ((count <= 0) || (costForCount <= 0))
        {
            System.out.println("Error: Bad parameter in setPrice.");
            System.exit(0);
        }
        else
        {
            groupCount = count;
            groupPrice = costForCount;
        }
    }

    public void setNumberBought(int number)
    {
        if (number <= 0)
        {
            System.out.println("Error: Bad parameter in setNumberBought.");
            System.exit(0);
        }
        else
            numberBought = number;
    }

    /**
     Reads from keyboard the price and number of a purchase.
     */
    public void readInput( )
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter name of item you are purchasing:");
        name = keyboard.nextLine( );

        System.out.println("Enter price of item as two numbers.");
        System.out.println("For example, 3 for $2.99 is entered as");
        System.out.println("3 2.99");
        System.out.println("Enter price of item as two numbers, now:");
        groupCount = keyboard.nextInt( );
        groupPrice = keyboard.nextDouble( );

        while ((groupCount <= 0) || (groupPrice <= 0))
        { //Try again:
            System.out.println("Both numbers must be positive. Try again.");
            System.out.println("Enter price of item as two numbers.");
            System.out.println("For example, 3 for $2.99 is entered as");
            System.out.println("3 2.99");
            System.out.println("Enter price of item as two numbers, now:");
            groupCount = keyboard.nextInt( );
            groupPrice = keyboard.nextDouble( );
        }

        System.out.println("Enter number of items purchased:");
        numberBought = keyboard.nextInt( );

        while (numberBought <= 0)
        { //Try again:
            System.out.println("Number must be positive. Try again.");
            System.out.println("Enter number of items purchased:");
            numberBought = keyboard.nextInt( );
        }
    }

    /**
     Displays price and number being purchased.
     */
    public void writeOutput( )
    {
        System.out.println(numberBought + " " + name);
        System.out.println("at " + groupCount +
                " for $" + groupPrice);
    }

    // It returns the name of the method, as String.
    public String getName( )
    {
        return name;
    }

    // It returns Total cost of the method, as double type.
    public double getTotalCost( )
    {
        return (groupPrice / groupCount) * numberBought;
    }

    // It returns unit cost of the method, as double
    public double getUnitCost( )
    {
        return groupPrice / groupCount;
    }

    //It returns NumberBought of th method, as int
    public int getNumberBought( )
    {
        return numberBought;
    }
}


