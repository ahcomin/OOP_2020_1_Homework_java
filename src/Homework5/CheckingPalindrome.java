/**
 * <h1> CheckingPalindrome </h1>
 * <p>
 * This program has few flowers and
 * You can get price of flowers that you select.
 *
 * @Author Minyoung Kim
 * @version 1.0
 * @e-mail ahco8766@gmail.com
 * @contact 010-4443-9023
 * <p>
 * @Compile : javac CheckingPalindrome.java
 * @Run : java CheckingPalindrome
 * Programming Assignment 6.
 * @since 05-25-2020
 */
package Homework5;

import java.util.Scanner; // to import scanner

public class CheckingPalindrome {
    public static void main(String[] args) {//main method is defined here.
        char[] characters;
        int size;
        boolean flag;

        //declared strings
        String line;
        String choice;
        Scanner reader = new Scanner(System.in);// create scanner object.
        String value;

        do {
            // to show user to enter for characters
            System.out.println("Enter a line of characters terminated by period(.)");

            // variables to be initialized
            line = "";
            characters = new char[80];
            size = 0;
            flag = false;
            // loop continues till period is discovered or size is 80
            while (true) {
                // read a word
                value = reader.next();
                if (value.contains(".") || size == 80) {
                    for (int i = 0; i < value.length() - 1; i++) {
                        characters[size] = value.charAt(i);
                        size++;
                    }
                    break; //breaks loop
                }

                for (int i = 0; i < value.length(); i++) {
                    characters[size] = value.charAt(i);
                    size++;
                }
                characters[size] = ' ';
                size++;
            }

            for (int i = 0; i < size; i++) // checks if array contains alphabets and spaces
            {
                if (Character.isAlphabetic(characters[i]) || characters[i] == ' ') {
                    line += characters[i];
                } else {
                    System.out.println("Content should" + " contain only " + "alphabets and spaces");
                    System.out.println("please try again");
                    flag = true;
                    break;
                }
            }

            // if false flag, check if word is palindrome or not and display the following
            if (flag == false) {
                //calls isPalindrome method
                // depending on return value
                //it prints a specific statement
                if (isPalindrome(characters, size))
                    System.out.println("\"" + line + "\"  is a Palindrome");
                else
                    System.out.println("\"" + line + "\"  is not a Palindrome");
            }

            System.out.println(" Enter yes to continue or end to terminate: "); // prompts user if they want to continue. if not, ask them to enter end
            choice = reader.next();
            System.out.println(); // loops until user ends
        }
        while (!choice.equalsIgnoreCase("end"));
    }

    public static boolean isPalindrome(char[] a, int used) //accepts 2 arguements, sequence of characters and number of characters used in array and returns true if array is palindrome. otherwise, returns false.
    {
        for (int i = 0, j = used - 1; i < used / 2; i++, j--) {
            if (a[i] == ' ' || a[used - 1] == ' ')
                continue;
            if (Character.toLowerCase(a[i]) !=  // checks for character match irrespective of case
                    Character.toLowerCase(a[j])) {
                return false;
            }
        }
        return true;
    }
}
