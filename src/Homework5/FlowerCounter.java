/**
 * <h1> FlowerCounter </h1>
 * <p>
 * This program has few flowers and
 * You can get price of flowers that you select.
 *
 * @Author Minyoung Kim
 * @version 1.0
 * @e-mail ahco8766@gmail.com
 * @contact 010-4443-9023
 * <p>
 * @Compile : javac FlowerCounter.java
 * @Run : java FlowerCounter
 * Programming Assignment 1.
 * @since 05-25-2020
 */

package Homework5;

import java.util.Scanner;

public class FlowerCounter {
    //static variable
    //String type variable in array
    private static String[] flowers = {"petunia", "pansy", "rose", "violet", "carnation"};
    private static double[] fCost = {0.5, 0.75, 1.50, 0.5, 0.8};// cost of flowers in array.

    public static void main(String[] arg) {


        Scanner keyboard = new Scanner(System.in); //create Scanner
        System.out.println("Which flower do you want to buy?");
        System.out.println("Select : ");
        for (int a = 0; a < 5; a++) {
            System.out.print(flowers[a]);
            System.out.print(" ");

        }
        System.out.println();


        String sentence;
        sentence = keyboard.nextLine(); //to get sentence of String type from user.
        int index = 0; // initialization
        boolean find = false;
        for (int i = 0; i < flowers.length; i++) { //꽃 배열의 크기만큼!


            if (sentence.equalsIgnoreCase(FlowerCounter.flowers[i])) { //you don't care about uppercase.
                index = i; // it is index number what you select flower in array
                find = true;
                System.out.println("you selected " + flowers[i]);

            }
        }
        if (find) {
            System.out.println("\nEnter quantity desired: ");
            double quantity = keyboard.nextDouble(); //to get what user entered
            double cost = fCost[index] * quantity; //to calculation how much you have to pay
            System.out.println("you entered " + quantity + "and ");
            System.out.println("Total cost is " + cost + "$");

        } else {
            System.out.println("Flower can not be found");
        }
    }
}
