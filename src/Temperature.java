/**
 * <h1> Temperature </h1>
 * <p>
 *
 * The program that represents temperatures in degrees in both Celsius and Fahrenheit.
 *
 *
 * @Author Minyoung Kim
 * @version 1.0
 * @e-mail ahco8766@gmail.com
 * @contact 010-4443-9023
 * <p>
 * @Compile : javac Temperature.java
 * @Run : java Temperature
 * Programming Assignment 4.
 * @since 05-18-2020
 */

public class Temperature {
    // Use a floating-point number for the temperature and a character for the scale: either 'C' for Celsius or 'F' for Fahrenheit. T
    private double temperature;
    private char scale;


    //four constructors
    /*
    one for the number of degrees
    second for the scale
    third for both the degrees and the scale and a default constructor
    for each of these constructors, assume zero degrees if no value is specified and Celsius if no scale is given.
     */
    public Temperature()
    {
        this(0.0, 'C');
    }
    public Temperature(double temp)
    {
        this(temp, 'C');
    }
    public Temperature(char scale)
    {
        this(0.0, scale);
    }
    public Temperature(double temp, char s)
    {
        temperature = temp;
        scale = s;
    }

    //two accessor methods
    /*
    one to return temperature in degrees celsius,
    the other to return it in degrees Fahrenheit.
     */

    public double getDegreesF()
    {
        if(scale == 'F')
        {
            return round(temperature);
        }
        else
        {
            return round(9*temperature/5+32);
        }
    }
    public double getDegreesC()
    {
        if(scale == 'C')
        {
            return round(temperature);
        }
        else
        {
            return round(5*(temperature-32)/9);
        }
    }
    private double round(double input)
    {
        return (double)(((int)(input*10))/10.0);
    }

    //to set the number of degrees
    public void setDegrees(double temp){
        temperature = temp;
    }
    //to set the scale
    public void setScale(char s){
        scale = s;
    }
    // to set number of degrees and the scale
    public void setTemperature(double temp, char scale){
        setDegrees(temp);
        setScale(scale);
    }

    //to test whether two temperature are equal
    public boolean isEqualTo(Temperature rhs)
    {
        return rhs.getDegreesC() == getDegreesC();
    }

    //to test whether one temperature is greater than another
    public boolean isGreaterThan(Temperature rhs)
    {
        return rhs.getDegreesC() < getDegreesC();
    }
    //to test whether one temperature is less than another
    public boolean isLessThan(Temperature rhs)
    {
        return rhs.getDegreesC() > getDegreesC();
    }

    public static void main(String[] args)
    {
        Temperature C = new Temperature();
        Temperature F = new Temperature('F');
        F.setDegrees(32.0);

        Temperature equalC = new Temperature(-40.0, 'C');
        Temperature equalF = new Temperature(-40.0);
        equalF.setScale('F');

        Temperature boilC = new Temperature(100.0, 'C');
        Temperature boilF = new Temperature(212.0, 'F');

        System.out.println(boilC.isEqualTo(boilF));
        System.out.println(equalC.isEqualTo(equalF));
        System.out.println(C.isEqualTo(F));

        System.out.println(boilC.isLessThan(F));
        System.out.println(F.isGreaterThan(equalC));
    }
}

