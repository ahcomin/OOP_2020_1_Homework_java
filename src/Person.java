/**
 * <h1> Person </h1>
 * <p>
 * the program that creates toddler, preschooler, adolescent, teenager and adult object and sets name or age
 *
 * @Author Minyoung Kim
 * @version 1.0
 * @e-mail ahco8766@gmail.com
 * @contact 010-4443-9023
 * <p>
 * @Compile : javac TestPerson.java
 * @Run : java Person
 * Programming Assignment 2.
 * @since 05-18-2020
 */


public class Person { //Person class defined here.
    //class instance variable
    private String name; //String type name instance
    private int age;// int type age instance.

    public Person() {//default constructor

        name = "No name yet";
        age = 0;


    }

    public Person(int age, String name) { //second constructor
        this.age = age;
        this.name = name;

    }

    //setName() to initialize the name with he given newName
    public void setName(String newName) {
        name = newName;
    }

    public static Person createAdult() {
        return new Person(21, "An adult");
    }

    public void setAge(int newAge) { //to initialize the age with the given newAge
        if (newAge >= 0)
            this.age = newAge;
        else {
            System.out.println("Error you entered negative number in age");
            System.exit(0);
        }
    }

    //setPerson() sets the name and age with the newName and newAge
    public void setPerson(String newName, int newAge) {
        setName(newName);
        setAge(newAge);
    }

    //getName() returns the name of the person
    public String getName() {
        return name;
    }

    //getAge() returns the age of the person
    public int getAge() {
        return age;
    }

    public void setName(String first, String last) { //to sum first name and last name
        this.name = first +" " + last;
    }

    //create static method
    public static Person createToddler() {
        return new Person(2, "A toddler");
    }

    public static Person createPreschooler() {

        return new Person(5, "A preschooler");
    }

    public static Person createAdolescent() {
        return new Person(9, "An adolescent");
    }

    public static Person createTeenager() {
        return new Person(15, "A teenager");
    }

    public static void main(String[] args) {
        Person y = new Person(); //make constructor object
        System.out.println("Testing the default constructor");
        System.out.println("Object has name " + y.getName() + " and age " + y.getAge());

        System.out.println("\nCreating each of the specialized instances");

        Person x;

        x = Person.createToddler();
        System.out.println("Created object with name " + x.getName() + " and age " + x.getAge());


        x = Person.createPreschooler();
        System.out.println("Created object with name " + x.getName() + " and age " + x.getAge());

        x = Person.createAdolescent();
        System.out.println("Created object with name " + x.getName() + " and age " + x.getAge());
        x = Person.createTeenager();
        System.out.println("Created object with name " + x.getName() + " and age " + x.getAge());
        x = Person.createAdult();
        System.out.println("Created object with name " + x.getName() + " and age " + x.getAge());

        System.out.println("\nTesting set - Name should be Bobby with age 10");
        x.setName("Bobby");
        x.setAge(10);
        System.out.println("Object has name " + x.getName() + " and age " + x.getAge());

        System.out.println("\nTesting the alternate set method - name change to Jane Doe");
        x.setName("Jane", "Doe");
        x.setAge(10);
        System.out.println("Object has name " + x.getName() + " and age " + x.getAge());
    }
}
