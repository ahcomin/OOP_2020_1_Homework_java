/**
 * <h1> CharacterFrequency </h1>
 * <p>
 * This program count in a telephone number.
 *
 * @Author Minyoung Kim
 * @version 1.0
 * @e-mail ahco8766@gmail.com
 * @contact 010-4443-9023
 * <p>
 * @Compile : javac CharacterFrequency.java
 * @Run : java CharacterFrequency
 * Programming Assignment 2.
 * @since 05-25-2020
 */

package Homework5;

import java.util.Scanner; //to import Scanner.

public class CharacterFrequency {
    private static int[] PhoneNumber = new int[10]; // create the array of int type with 10 size.

    public static void main(String[] arg) { //main method is defined here.
        System.out.println("Enter the telephone number : ");
        Scanner keyboard = new Scanner(System.in); // create the object of Scanner
        String phoneNum;
        phoneNum = keyboard.next(); //to get the number of String type from user.


        for (int i = 0; i < phoneNum.length(); i++) { //to repeat the loop until end of number

            String character = phoneNum.substring(i, i + 1); //to get character from phoneNum.
            int a = Integer.parseInt(character); //to convert String type to integer type.
            PhoneNumber[a]++; // increment count.
        }

            System.out.println("Digit and count : ");

            for(int j = 0; j < PhoneNumber.length; j++){
                System.out.print("The digit ");
                System.out.print(j);
                System.out.print(" appears ");
                System.out.println(PhoneNumber[j] + " times");

            }



    }

}
